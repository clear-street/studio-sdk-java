// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async.entities

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.EntityRegtMarginRetrieveParams
import io.clearstreet.studio.models.RegtMargin
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class RegtMarginServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RegtMarginServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<RegtMargin> =
        jsonHandler<RegtMargin>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the latest Reg-T margin calculation for the given entity */
    override fun retrieve(
        params: EntityRegtMarginRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RegtMargin> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0), "regt-margin")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
