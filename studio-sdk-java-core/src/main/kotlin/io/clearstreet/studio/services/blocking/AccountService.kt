// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.blocking

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.Account
import io.clearstreet.studio.models.AccountListParams
import io.clearstreet.studio.models.AccountListResponse
import io.clearstreet.studio.models.AccountRetrieveParams
import io.clearstreet.studio.services.blocking.accounts.BulkOrderService
import io.clearstreet.studio.services.blocking.accounts.EasyBorrowService
import io.clearstreet.studio.services.blocking.accounts.LocateOrderService
import io.clearstreet.studio.services.blocking.accounts.OrderService
import io.clearstreet.studio.services.blocking.accounts.PnlDetailService
import io.clearstreet.studio.services.blocking.accounts.PnlSummaryService
import io.clearstreet.studio.services.blocking.accounts.PositionService
import io.clearstreet.studio.services.blocking.accounts.TradeService

interface AccountService {

    fun bulkOrders(): BulkOrderService

    fun orders(): OrderService

    fun trades(): TradeService

    fun positions(): PositionService

    fun locateOrders(): LocateOrderService

    fun easyBorrows(): EasyBorrowService

    fun pnlSummary(): PnlSummaryService

    fun pnlDetails(): PnlDetailService

    /** Get an account by its ID. */
    @JvmOverloads
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /** List all available accounts. */
    @JvmOverloads
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountListResponse
}
