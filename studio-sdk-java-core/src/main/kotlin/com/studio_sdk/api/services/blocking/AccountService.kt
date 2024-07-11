// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.blocking

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.Account
import com.studio_sdk.api.models.AccountListParams
import com.studio_sdk.api.models.AccountListResponse
import com.studio_sdk.api.models.AccountRetrieveParams
import com.studio_sdk.api.services.blocking.accounts.BulkOrderService
import com.studio_sdk.api.services.blocking.accounts.EasyBorrowService
import com.studio_sdk.api.services.blocking.accounts.LocateOrderService
import com.studio_sdk.api.services.blocking.accounts.OrderService
import com.studio_sdk.api.services.blocking.accounts.PnlDetailService
import com.studio_sdk.api.services.blocking.accounts.PnlSummaryService
import com.studio_sdk.api.services.blocking.accounts.PositionService
import com.studio_sdk.api.services.blocking.accounts.TradeService

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
