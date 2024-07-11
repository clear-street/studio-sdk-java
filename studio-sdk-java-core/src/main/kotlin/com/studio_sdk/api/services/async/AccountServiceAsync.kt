// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.async

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.Account
import com.studio_sdk.api.models.AccountListParams
import com.studio_sdk.api.models.AccountListResponse
import com.studio_sdk.api.models.AccountRetrieveParams
import com.studio_sdk.api.services.async.accounts.BulkOrderServiceAsync
import com.studio_sdk.api.services.async.accounts.EasyBorrowServiceAsync
import com.studio_sdk.api.services.async.accounts.LocateOrderServiceAsync
import com.studio_sdk.api.services.async.accounts.OrderServiceAsync
import com.studio_sdk.api.services.async.accounts.PnlDetailServiceAsync
import com.studio_sdk.api.services.async.accounts.PnlSummaryServiceAsync
import com.studio_sdk.api.services.async.accounts.PositionServiceAsync
import com.studio_sdk.api.services.async.accounts.TradeServiceAsync
import java.util.concurrent.CompletableFuture

interface AccountServiceAsync {

    fun bulkOrders(): BulkOrderServiceAsync

    fun orders(): OrderServiceAsync

    fun trades(): TradeServiceAsync

    fun positions(): PositionServiceAsync

    fun locateOrders(): LocateOrderServiceAsync

    fun easyBorrows(): EasyBorrowServiceAsync

    fun pnlSummary(): PnlSummaryServiceAsync

    fun pnlDetails(): PnlDetailServiceAsync

    /** Get an account by its ID. */
    @JvmOverloads
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Account>

    /** List all available accounts. */
    @JvmOverloads
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountListResponse>
}
