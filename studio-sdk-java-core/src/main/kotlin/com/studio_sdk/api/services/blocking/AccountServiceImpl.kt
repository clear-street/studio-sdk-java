// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking

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
import com.studio_sdk.api.services.blocking.accounts.BulkOrderService
import com.studio_sdk.api.services.blocking.accounts.BulkOrderServiceImpl
import com.studio_sdk.api.services.blocking.accounts.EasyBorrowService
import com.studio_sdk.api.services.blocking.accounts.EasyBorrowServiceImpl
import com.studio_sdk.api.services.blocking.accounts.LocateOrderService
import com.studio_sdk.api.services.blocking.accounts.LocateOrderServiceImpl
import com.studio_sdk.api.services.blocking.accounts.OrderService
import com.studio_sdk.api.services.blocking.accounts.OrderServiceImpl
import com.studio_sdk.api.services.blocking.accounts.PnlDetailService
import com.studio_sdk.api.services.blocking.accounts.PnlDetailServiceImpl
import com.studio_sdk.api.services.blocking.accounts.PnlSummaryService
import com.studio_sdk.api.services.blocking.accounts.PnlSummaryServiceImpl
import com.studio_sdk.api.services.blocking.accounts.PositionService
import com.studio_sdk.api.services.blocking.accounts.PositionServiceImpl
import com.studio_sdk.api.services.blocking.accounts.TradeService
import com.studio_sdk.api.services.blocking.accounts.TradeServiceImpl
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler

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
