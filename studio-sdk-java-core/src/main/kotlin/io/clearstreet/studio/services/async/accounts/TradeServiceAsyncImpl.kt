// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.AccountTradeListParams
import io.clearstreet.studio.models.AccountTradeListResponse
import io.clearstreet.studio.models.AccountTradeRetrieveParams
import io.clearstreet.studio.models.Trade
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
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
