// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.Entity
import com.studio_sdk.api.models.EntityListParams
import com.studio_sdk.api.models.EntityListResponse
import com.studio_sdk.api.models.EntityRetrieveParams
import com.studio_sdk.api.services.blocking.entities.PnlSummaryService
import com.studio_sdk.api.services.blocking.entities.PnlSummaryServiceImpl
import com.studio_sdk.api.services.blocking.entities.PortfolioMarginService
import com.studio_sdk.api.services.blocking.entities.PortfolioMarginServiceImpl
import com.studio_sdk.api.services.blocking.entities.RegtMarginService
import com.studio_sdk.api.services.blocking.entities.RegtMarginServiceImpl
import com.studio_sdk.api.services.blocking.entities.RegtMarginSimulationService
import com.studio_sdk.api.services.blocking.entities.RegtMarginSimulationServiceImpl
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler

class EntityServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EntityService {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val pnlSummaries: PnlSummaryService by lazy { PnlSummaryServiceImpl(clientOptions) }

    private val regtMargins: RegtMarginService by lazy { RegtMarginServiceImpl(clientOptions) }

    private val portfolioMargins: PortfolioMarginService by lazy {
        PortfolioMarginServiceImpl(clientOptions)
    }

    private val regtMarginSimulations: RegtMarginSimulationService by lazy {
        RegtMarginSimulationServiceImpl(clientOptions)
    }

    override fun pnlSummaries(): PnlSummaryService = pnlSummaries

    override fun regtMargins(): RegtMarginService = regtMargins

    override fun portfolioMargins(): PortfolioMarginService = portfolioMargins

    override fun regtMarginSimulations(): RegtMarginSimulationService = regtMarginSimulations

    private val retrieveHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an entity by its ID. */
    override fun retrieve(params: EntityRetrieveParams, requestOptions: RequestOptions): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<EntityListResponse> =
        jsonHandler<EntityListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List all available entities. */
    override fun list(
        params: EntityListParams,
        requestOptions: RequestOptions
    ): EntityListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
