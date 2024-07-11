// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.Entity
import io.clearstreet.studio.models.EntityListParams
import io.clearstreet.studio.models.EntityListResponse
import io.clearstreet.studio.models.EntityRetrieveParams
import io.clearstreet.studio.services.async.entities.PnlSummaryServiceAsync
import io.clearstreet.studio.services.async.entities.PortfolioMarginServiceAsync
import io.clearstreet.studio.services.async.entities.RegtMarginServiceAsync
import io.clearstreet.studio.services.async.entities.RegtMarginSimulationServiceAsync
import java.util.concurrent.CompletableFuture

interface EntityServiceAsync {

    fun pnlSummaries(): PnlSummaryServiceAsync

    fun regtMargins(): RegtMarginServiceAsync

    fun portfolioMargins(): PortfolioMarginServiceAsync

    fun regtMarginSimulations(): RegtMarginSimulationServiceAsync

    /** Get an entity by its ID. */
    @JvmOverloads
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Entity>

    /** List all available entities. */
    @JvmOverloads
    fun list(
        params: EntityListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EntityListResponse>
}
