// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.async

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.Entity
import com.studio_sdk.api.models.EntityListParams
import com.studio_sdk.api.models.EntityListResponse
import com.studio_sdk.api.models.EntityRetrieveParams
import com.studio_sdk.api.services.async.entities.PnlSummaryServiceAsync
import com.studio_sdk.api.services.async.entities.PortfolioMarginServiceAsync
import com.studio_sdk.api.services.async.entities.RegtMarginServiceAsync
import com.studio_sdk.api.services.async.entities.RegtMarginSimulationServiceAsync
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
