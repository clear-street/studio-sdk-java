// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.Entity
import io.clearstreet.studio.models.EntityListParams
import io.clearstreet.studio.models.EntityListResponse
import io.clearstreet.studio.models.EntityRetrieveParams
import io.clearstreet.studio.services.blocking.entities.PnlSummaryService
import io.clearstreet.studio.services.blocking.entities.PnlSummaryServiceImpl
import io.clearstreet.studio.services.blocking.entities.PortfolioMarginService
import io.clearstreet.studio.services.blocking.entities.PortfolioMarginServiceImpl
import io.clearstreet.studio.services.blocking.entities.RegtMarginService
import io.clearstreet.studio.services.blocking.entities.RegtMarginServiceImpl
import io.clearstreet.studio.services.blocking.entities.RegtMarginSimulationService
import io.clearstreet.studio.services.blocking.entities.RegtMarginSimulationServiceImpl
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler

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
