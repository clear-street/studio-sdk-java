// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.AccountPnlSummaryRetrieveParams
import io.clearstreet.studio.models.PnlSummaryForAccount
import java.util.concurrent.CompletableFuture

interface PnlSummaryServiceAsync {

    /** Get PNL summary for a given account. */
    @JvmOverloads
    fun retrieve(
        params: AccountPnlSummaryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PnlSummaryForAccount>
}
