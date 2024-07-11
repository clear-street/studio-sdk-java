// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.blocking

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.Entity
import io.clearstreet.studio.models.EntityListParams
import io.clearstreet.studio.models.EntityListResponse
import io.clearstreet.studio.models.EntityRetrieveParams
import io.clearstreet.studio.services.blocking.entities.PnlSummaryService
import io.clearstreet.studio.services.blocking.entities.PortfolioMarginService
import io.clearstreet.studio.services.blocking.entities.RegtMarginService
import io.clearstreet.studio.services.blocking.entities.RegtMarginSimulationService

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
