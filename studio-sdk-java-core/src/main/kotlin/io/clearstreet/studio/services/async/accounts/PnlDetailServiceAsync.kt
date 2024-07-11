// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.AccountPnlDetailListParams
import io.clearstreet.studio.models.AccountPnlDetailListResponse
import java.util.concurrent.CompletableFuture

interface PnlDetailServiceAsync {

    /** List PNL details for a given account. */
    @JvmOverloads
    fun list(
        params: AccountPnlDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountPnlDetailListResponse>
}
