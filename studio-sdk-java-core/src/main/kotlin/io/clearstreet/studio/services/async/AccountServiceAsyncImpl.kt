// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.Account
import io.clearstreet.studio.models.AccountListParams
import io.clearstreet.studio.models.AccountListResponse
import io.clearstreet.studio.models.AccountRetrieveParams
import io.clearstreet.studio.services.async.accounts.BulkOrderServiceAsync
import io.clearstreet.studio.services.async.accounts.BulkOrderServiceAsyncImpl
import io.clearstreet.studio.services.async.accounts.EasyBorrowServiceAsync
import io.clearstreet.studio.services.async.accounts.EasyBorrowServiceAsyncImpl
import io.clearstreet.studio.services.async.accounts.LocateOrderServiceAsync
import io.clearstreet.studio.services.async.accounts.LocateOrderServiceAsyncImpl
import io.clearstreet.studio.services.async.accounts.OrderServiceAsync
import io.clearstreet.studio.services.async.accounts.OrderServiceAsyncImpl
import io.clearstreet.studio.services.async.accounts.PnlDetailServiceAsync
import io.clearstreet.studio.services.async.accounts.PnlDetailServiceAsyncImpl
import io.clearstreet.studio.services.async.accounts.PnlSummaryServiceAsync
import io.clearstreet.studio.services.async.accounts.PnlSummaryServiceAsyncImpl
import io.clearstreet.studio.services.async.accounts.PositionServiceAsync
import io.clearstreet.studio.services.async.accounts.PositionServiceAsyncImpl
import io.clearstreet.studio.services.async.accounts.TradeServiceAsync
import io.clearstreet.studio.services.async.accounts.TradeServiceAsyncImpl
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
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
