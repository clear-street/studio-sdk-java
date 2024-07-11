// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.async.entities

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.EntityPortfolioMarginRetrieveParams
import com.studio_sdk.api.models.PortfolioMargin
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PortfolioMarginServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PortfolioMarginServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<PortfolioMargin> =
        jsonHandler<PortfolioMargin>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get latest portfolio margin calculation for the given entity */
    override fun retrieve(
        params: EntityPortfolioMarginRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PortfolioMargin> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0), "portfolio-margin")
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
