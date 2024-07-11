// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.Instrument
import io.clearstreet.studio.models.InstrumentRetrieveParams
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler

class InstrumentServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InstrumentService {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Instrument> =
        jsonHandler<Instrument>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an instrument by the given symbol */
    override fun retrieve(
        params: InstrumentRetrieveParams,
        requestOptions: RequestOptions
    ): Instrument {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("instruments", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
