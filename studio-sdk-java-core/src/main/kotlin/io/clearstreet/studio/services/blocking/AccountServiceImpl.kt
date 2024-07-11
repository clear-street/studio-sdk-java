// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking

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
import io.clearstreet.studio.services.blocking.accounts.BulkOrderService
import io.clearstreet.studio.services.blocking.accounts.BulkOrderServiceImpl
import io.clearstreet.studio.services.blocking.accounts.EasyBorrowService
import io.clearstreet.studio.services.blocking.accounts.EasyBorrowServiceImpl
import io.clearstreet.studio.services.blocking.accounts.LocateOrderService
import io.clearstreet.studio.services.blocking.accounts.LocateOrderServiceImpl
import io.clearstreet.studio.services.blocking.accounts.OrderService
import io.clearstreet.studio.services.blocking.accounts.OrderServiceImpl
import io.clearstreet.studio.services.blocking.accounts.PnlDetailService
import io.clearstreet.studio.services.blocking.accounts.PnlDetailServiceImpl
import io.clearstreet.studio.services.blocking.accounts.PnlSummaryService
import io.clearstreet.studio.services.blocking.accounts.PnlSummaryServiceImpl
import io.clearstreet.studio.services.blocking.accounts.PositionService
import io.clearstreet.studio.services.blocking.accounts.PositionServiceImpl
import io.clearstreet.studio.services.blocking.accounts.TradeService
import io.clearstreet.studio.services.blocking.accounts.TradeServiceImpl
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler

class AccountServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AccountService {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val bulkOrders: BulkOrderService by lazy { BulkOrderServiceImpl(clientOptions) }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    private val trades: TradeService by lazy { TradeServiceImpl(clientOptions) }

    private val positions: PositionService by lazy { PositionServiceImpl(clientOptions) }

    private val locateOrders: LocateOrderService by lazy { LocateOrderServiceImpl(clientOptions) }

    private val easyBorrows: EasyBorrowService by lazy { EasyBorrowServiceImpl(clientOptions) }

    private val pnlSummary: PnlSummaryService by lazy { PnlSummaryServiceImpl(clientOptions) }

    private val pnlDetails: PnlDetailService by lazy { PnlDetailServiceImpl(clientOptions) }

    override fun bulkOrders(): BulkOrderService = bulkOrders

    override fun orders(): OrderService = orders

    override fun trades(): TradeService = trades

    override fun positions(): PositionService = positions

    override fun locateOrders(): LocateOrderService = locateOrders

    override fun easyBorrows(): EasyBorrowService = easyBorrows

    override fun pnlSummary(): PnlSummaryService = pnlSummary

    override fun pnlDetails(): PnlDetailService = pnlDetails

    private val retrieveHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an account by its ID. */
    override fun retrieve(params: AccountRetrieveParams, requestOptions: RequestOptions): Account {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0))
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

    private val listHandler: Handler<AccountListResponse> =
        jsonHandler<AccountListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all available accounts. */
    override fun list(
        params: AccountListParams,
        requestOptions: RequestOptions
    ): AccountListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
