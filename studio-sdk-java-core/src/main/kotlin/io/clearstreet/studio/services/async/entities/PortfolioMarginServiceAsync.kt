// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async.entities

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.EntityPortfolioMarginRetrieveParams
import io.clearstreet.studio.models.PortfolioMargin
import java.util.concurrent.CompletableFuture

interface PortfolioMarginServiceAsync {

    /** Get latest portfolio margin calculation for the given entity */
    @JvmOverloads
    fun retrieve(
        params: EntityPortfolioMarginRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PortfolioMargin>
}