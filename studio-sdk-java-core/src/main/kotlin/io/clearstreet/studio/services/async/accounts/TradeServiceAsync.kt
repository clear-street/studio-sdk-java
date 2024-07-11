// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.AccountTradeListParams
import io.clearstreet.studio.models.AccountTradeListResponse
import io.clearstreet.studio.models.AccountTradeRetrieveParams
import io.clearstreet.studio.models.Trade
import java.util.concurrent.CompletableFuture

interface TradeServiceAsync {

    /** Get trade a trade by its unique trade ID. */
    @JvmOverloads
    fun retrieve(
        params: AccountTradeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Trade>

    /** List trades for a given account for the current trading day. */
    @JvmOverloads
    fun list(
        params: AccountTradeListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountTradeListResponse>
}
