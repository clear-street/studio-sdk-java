// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.Account
import io.clearstreet.studio.models.AccountListParams
import io.clearstreet.studio.models.AccountListResponse
import io.clearstreet.studio.models.AccountRetrieveParams
import io.clearstreet.studio.services.async.accounts.BulkOrderServiceAsync
import io.clearstreet.studio.services.async.accounts.EasyBorrowServiceAsync
import io.clearstreet.studio.services.async.accounts.LocateOrderServiceAsync
import io.clearstreet.studio.services.async.accounts.OrderServiceAsync
import io.clearstreet.studio.services.async.accounts.PnlDetailServiceAsync
import io.clearstreet.studio.services.async.accounts.PnlSummaryServiceAsync
import io.clearstreet.studio.services.async.accounts.PositionServiceAsync
import io.clearstreet.studio.services.async.accounts.TradeServiceAsync
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
