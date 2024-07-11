// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.async

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.Instrument
import com.studio_sdk.api.models.InstrumentRetrieveParams
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class InstrumentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InstrumentServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Instrument> =
        jsonHandler<Instrument>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an instrument by the given symbol */
    override fun retrieve(
        params: InstrumentRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Instrument> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("instruments", params.getPathParam(0))
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
