// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.async.accounts

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.AccountTradeListParams
import com.studio_sdk.api.models.AccountTradeListResponse
import com.studio_sdk.api.models.AccountTradeRetrieveParams
import com.studio_sdk.api.models.Trade
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class TradeServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : TradeServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Trade> =
        jsonHandler<Trade>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get trade a trade by its unique trade ID. */
    override fun retrieve(
        params: AccountTradeRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Trade> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "accounts",
                    params.getPathParam(0),
                    "trades",
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

    private val listHandler: Handler<AccountTradeListResponse> =
        jsonHandler<AccountTradeListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List trades for a given account for the current trading day. */
    override fun list(
        params: AccountTradeListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountTradeListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "trades")
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
