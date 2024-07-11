// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async.entities

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.EntityPnlSummaryRetrieveParams
import io.clearstreet.studio.models.PnlSummary
import java.util.concurrent.CompletableFuture

interface PnlSummaryServiceAsync {

    /** Get PNL summary for all accounts in an entity. */
    @JvmOverloads
    fun retrieve(
        params: EntityPnlSummaryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PnlSummary>
}
