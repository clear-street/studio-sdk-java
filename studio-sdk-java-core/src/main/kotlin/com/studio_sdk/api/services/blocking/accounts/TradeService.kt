// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.blocking.accounts

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.AccountTradeListParams
import com.studio_sdk.api.models.AccountTradeListResponse
import com.studio_sdk.api.models.AccountTradeRetrieveParams
import com.studio_sdk.api.models.Trade

interface TradeService {

    /** Get trade a trade by its unique trade ID. */
    @JvmOverloads
    fun retrieve(
        params: AccountTradeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Trade

    /** List trades for a given account for the current trading day. */
    @JvmOverloads
    fun list(
        params: AccountTradeListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountTradeListResponse
}
