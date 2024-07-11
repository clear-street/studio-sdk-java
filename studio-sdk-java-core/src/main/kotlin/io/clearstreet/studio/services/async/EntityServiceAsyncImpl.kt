// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async

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
import io.clearstreet.studio.services.async.entities.PnlSummaryServiceAsync
import io.clearstreet.studio.services.async.entities.PnlSummaryServiceAsyncImpl
import io.clearstreet.studio.services.async.entities.PortfolioMarginServiceAsync
import io.clearstreet.studio.services.async.entities.PortfolioMarginServiceAsyncImpl
import io.clearstreet.studio.services.async.entities.RegtMarginServiceAsync
import io.clearstreet.studio.services.async.entities.RegtMarginServiceAsyncImpl
import io.clearstreet.studio.services.async.entities.RegtMarginSimulationServiceAsync
import io.clearstreet.studio.services.async.entities.RegtMarginSimulationServiceAsyncImpl
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class EntityServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : EntityServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val pnlSummaries: PnlSummaryServiceAsync by lazy {
        PnlSummaryServiceAsyncImpl(clientOptions)
    }

    private val regtMargins: RegtMarginServiceAsync by lazy {
        RegtMarginServiceAsyncImpl(clientOptions)
    }

    private val portfolioMargins: PortfolioMarginServiceAsync by lazy {
        PortfolioMarginServiceAsyncImpl(clientOptions)
    }

    private val regtMarginSimulations: RegtMarginSimulationServiceAsync by lazy {
        RegtMarginSimulationServiceAsyncImpl(clientOptions)
    }

    override fun pnlSummaries(): PnlSummaryServiceAsync = pnlSummaries

    override fun regtMargins(): RegtMarginServiceAsync = regtMargins

    override fun portfolioMargins(): PortfolioMarginServiceAsync = portfolioMargins

    override fun regtMarginSimulations(): RegtMarginSimulationServiceAsync = regtMarginSimulations

    private val retrieveHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an entity by its ID. */
    override fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Entity> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
    ): CompletableFuture<EntityListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
