// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.async

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.Account
import com.studio_sdk.api.models.AccountListParams
import com.studio_sdk.api.models.AccountListResponse
import com.studio_sdk.api.models.AccountRetrieveParams
import com.studio_sdk.api.services.async.accounts.BulkOrderServiceAsync
import com.studio_sdk.api.services.async.accounts.BulkOrderServiceAsyncImpl
import com.studio_sdk.api.services.async.accounts.EasyBorrowServiceAsync
import com.studio_sdk.api.services.async.accounts.EasyBorrowServiceAsyncImpl
import com.studio_sdk.api.services.async.accounts.LocateOrderServiceAsync
import com.studio_sdk.api.services.async.accounts.LocateOrderServiceAsyncImpl
import com.studio_sdk.api.services.async.accounts.OrderServiceAsync
import com.studio_sdk.api.services.async.accounts.OrderServiceAsyncImpl
import com.studio_sdk.api.services.async.accounts.PnlDetailServiceAsync
import com.studio_sdk.api.services.async.accounts.PnlDetailServiceAsyncImpl
import com.studio_sdk.api.services.async.accounts.PnlSummaryServiceAsync
import com.studio_sdk.api.services.async.accounts.PnlSummaryServiceAsyncImpl
import com.studio_sdk.api.services.async.accounts.PositionServiceAsync
import com.studio_sdk.api.services.async.accounts.PositionServiceAsyncImpl
import com.studio_sdk.api.services.async.accounts.TradeServiceAsync
import com.studio_sdk.api.services.async.accounts.TradeServiceAsyncImpl
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class AccountServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AccountServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val bulkOrders: BulkOrderServiceAsync by lazy {
        BulkOrderServiceAsyncImpl(clientOptions)
    }

    private val orders: OrderServiceAsync by lazy { OrderServiceAsyncImpl(clientOptions) }

    private val trades: TradeServiceAsync by lazy { TradeServiceAsyncImpl(clientOptions) }

    private val positions: PositionServiceAsync by lazy { PositionServiceAsyncImpl(clientOptions) }

    private val locateOrders: LocateOrderServiceAsync by lazy {
        LocateOrderServiceAsyncImpl(clientOptions)
    }

    private val easyBorrows: EasyBorrowServiceAsync by lazy {
        EasyBorrowServiceAsyncImpl(clientOptions)
    }

    private val pnlSummary: PnlSummaryServiceAsync by lazy {
        PnlSummaryServiceAsyncImpl(clientOptions)
    }

    private val pnlDetails: PnlDetailServiceAsync by lazy {
        PnlDetailServiceAsyncImpl(clientOptions)
    }

    override fun bulkOrders(): BulkOrderServiceAsync = bulkOrders

    override fun orders(): OrderServiceAsync = orders

    override fun trades(): TradeServiceAsync = trades

    override fun positions(): PositionServiceAsync = positions

    override fun locateOrders(): LocateOrderServiceAsync = locateOrders

    override fun easyBorrows(): EasyBorrowServiceAsync = easyBorrows

    override fun pnlSummary(): PnlSummaryServiceAsync = pnlSummary

    override fun pnlDetails(): PnlDetailServiceAsync = pnlDetails

    private val retrieveHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an account by its ID. */
    override fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Account> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0))
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

    private val listHandler: Handler<AccountListResponse> =
        jsonHandler<AccountListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all available accounts. */
    override fun list(
        params: AccountListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts")
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
