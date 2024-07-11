@file:JvmName("Handlers")

package io.clearstreet.studio.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.clearstreet.studio.core.http.BinaryResponseContent
import io.clearstreet.studio.core.http.HttpResponse
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.BadRequestException
import io.clearstreet.studio.errors.InternalServerException
import io.clearstreet.studio.errors.NotFoundException
import io.clearstreet.studio.errors.PermissionDeniedException
import io.clearstreet.studio.errors.RateLimitException
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.errors.StudioSdkException
import io.clearstreet.studio.errors.UnauthorizedException
import io.clearstreet.studio.errors.UnexpectedStatusCodeException
import io.clearstreet.studio.errors.UnprocessableEntityException
import java.io.InputStream
import java.io.OutputStream

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandler

private object EmptyHandler : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandler

@JvmSynthetic internal fun binaryHandler(): Handler<BinaryResponseContent> = BinaryHandler

private object StringHandler : Handler<String> {
    override fun handle(response: HttpResponse): String {
        return response.body().readBytes().toString(Charsets.UTF_8)
    }
}

private object BinaryHandler : Handler<BinaryResponseContent> {
    override fun handle(response: HttpResponse): BinaryResponseContent {
        return BinaryResponseContentImpl(response)
    }
}

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw StudioSdkException("Error reading response", e)
            }
        }
    }
}

@JvmSynthetic
internal fun errorHandler(jsonMapper: JsonMapper): Handler<StudioSdkError> {
    val handler = jsonHandler<StudioSdkError>(jsonMapper)

    return object : Handler<StudioSdkError> {
        override fun handle(response: HttpResponse): StudioSdkError {
            try {
                return handler.handle(response)
            } catch (e: Exception) {
                return StudioSdkError.builder().build()
            }
        }
    }
}

@JvmSynthetic
internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<StudioSdkError>): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> return this@withErrorHandler.handle(response)
                400 -> throw BadRequestException(response.headers(), errorHandler.handle(response))
                401 ->
                    throw UnauthorizedException(response.headers(), errorHandler.handle(response))
                403 ->
                    throw PermissionDeniedException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                404 -> throw NotFoundException(response.headers(), errorHandler.handle(response))
                422 ->
                    throw UnprocessableEntityException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                429 -> throw RateLimitException(response.headers(), errorHandler.handle(response))
                in 500..599 ->
                    throw InternalServerException(
                        statusCode,
                        response.headers(),
                        errorHandler.handle(response)
                    )
                else ->
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        response.headers(),
                        StringHandler.handle(response)
                    )
            }
        }
    }
}

class BinaryResponseContentImpl
constructor(
    private val response: HttpResponse,
) : BinaryResponseContent {
    override fun contentType(): String? {
        return response.headers().get("Content-Type").firstOrNull()
    }

    override fun body(): InputStream {
        return response.body()
    }

    override fun writeTo(outputStream: OutputStream) {
        response.body().copyTo(outputStream)
    }

    override fun close() {
        response.body().close()
    }
}