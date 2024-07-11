// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.AccountPnlSummaryRetrieveParams
import io.clearstreet.studio.models.PnlSummaryForAccount

interface PnlSummaryService {

    /** Get PNL summary for a given account. */
    @JvmOverloads
    fun retrieve(
        params: AccountPnlSummaryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PnlSummaryForAccount
}
