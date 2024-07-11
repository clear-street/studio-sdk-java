// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.async.entities

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.EntityRegtMarginSimulationCreateParams
import com.studio_sdk.api.models.EntityRegtMarginSimulationCreateResponse
import com.studio_sdk.api.models.EntityRegtMarginSimulationRetrieveParams
import com.studio_sdk.api.models.RegtMarginSimulation
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.json
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class RegtMarginSimulationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RegtMarginSimulationServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EntityRegtMarginSimulationCreateResponse> =
        jsonHandler<EntityRegtMarginSimulationCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulate Reg-T margin calculation for a given hypothetical set of prices and/or trades. This
     * is useful for understanding the impact of price fluctuations or trades on margin
     * requirements. Once a simulation is created, it remains available for 48-hours, after which it
     * will automatically be deleted.
     *
     * Simulations created through the API are visible in the Studio UI under the Risk & Margin
     * section, after enabling the "Risk Simulations" toggle.
     */
    override fun create(
        params: EntityRegtMarginSimulationCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<EntityRegtMarginSimulationCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "regt-margin-simulations")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<RegtMarginSimulation> =
        jsonHandler<RegtMarginSimulation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get a Reg-T margin simluation that was previously created. Note, simulations are
     * automatically deleted after 48-hours.
     */
    override fun retrieve(
        params: EntityRegtMarginSimulationRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RegtMarginSimulation> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "entities",
                    params.getPathParam(0),
                    "regt-margin-simulations",
                    params.getPathParam(1)
                )
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
}
