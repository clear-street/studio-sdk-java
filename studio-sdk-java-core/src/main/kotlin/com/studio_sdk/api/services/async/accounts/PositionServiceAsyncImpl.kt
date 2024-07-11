// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.async.accounts

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.AccountPositionListParams
import com.studio_sdk.api.models.AccountPositionListResponse
import com.studio_sdk.api.models.AccountPositionRetrieveParams
import com.studio_sdk.api.models.Position
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PositionServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PositionServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Position> =
        jsonHandler<Position>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get current positions for a given account for a given symbol. */
    override fun retrieve(
        params: AccountPositionRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Position> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "accounts",
                    params.getPathParam(0),
                    "positions",
                    params.getPathParam(1)
                )
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

    private val listHandler: Handler<AccountPositionListResponse> =
        jsonHandler<AccountPositionListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List current positions for a given account. */
    override fun list(
        params: AccountPositionListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountPositionListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "positions")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
