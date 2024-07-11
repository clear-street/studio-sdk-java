// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.async

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
import com.studio_sdk.api.services.async.entities.PnlSummaryServiceAsync
import com.studio_sdk.api.services.async.entities.PnlSummaryServiceAsyncImpl
import com.studio_sdk.api.services.async.entities.PortfolioMarginServiceAsync
import com.studio_sdk.api.services.async.entities.PortfolioMarginServiceAsyncImpl
import com.studio_sdk.api.services.async.entities.RegtMarginServiceAsync
import com.studio_sdk.api.services.async.entities.RegtMarginServiceAsyncImpl
import com.studio_sdk.api.services.async.entities.RegtMarginSimulationServiceAsync
import com.studio_sdk.api.services.async.entities.RegtMarginSimulationServiceAsyncImpl
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler
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
