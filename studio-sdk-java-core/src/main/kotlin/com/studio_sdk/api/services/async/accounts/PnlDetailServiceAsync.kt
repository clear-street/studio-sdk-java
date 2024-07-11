// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.async.accounts

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.AccountPnlDetailListParams
import com.studio_sdk.api.models.AccountPnlDetailListResponse
import java.util.concurrent.CompletableFuture

interface PnlDetailServiceAsync {

    /** List PNL details for a given account. */
    @JvmOverloads
    fun list(
        params: AccountPnlDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountPnlDetailListResponse>
}
