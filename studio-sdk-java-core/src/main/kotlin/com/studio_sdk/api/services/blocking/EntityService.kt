// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.blocking

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.Entity
import com.studio_sdk.api.models.EntityListParams
import com.studio_sdk.api.models.EntityListResponse
import com.studio_sdk.api.models.EntityRetrieveParams
import com.studio_sdk.api.services.blocking.entities.PnlSummaryService
import com.studio_sdk.api.services.blocking.entities.PortfolioMarginService
import com.studio_sdk.api.services.blocking.entities.RegtMarginService
import com.studio_sdk.api.services.blocking.entities.RegtMarginSimulationService

interface EntityService {

    fun pnlSummaries(): PnlSummaryService

    fun regtMargins(): RegtMarginService

    fun portfolioMargins(): PortfolioMarginService

    fun regtMarginSimulations(): RegtMarginSimulationService

    /** Get an entity by its ID. */
    @JvmOverloads
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** List all available entities. */
    @JvmOverloads
    fun list(
        params: EntityListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EntityListResponse
}
