// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.async.accounts

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.AccountPnlSummaryRetrieveParams
import com.studio_sdk.api.models.PnlSummaryForAccount
import java.util.concurrent.CompletableFuture

interface PnlSummaryServiceAsync {

    /** Get PNL summary for a given account. */
    @JvmOverloads
    fun retrieve(
        params: AccountPnlSummaryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PnlSummaryForAccount>
}
