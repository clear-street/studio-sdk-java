// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.entities

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.EntityRegtMarginSimulationCreateParams
import io.clearstreet.studio.models.EntityRegtMarginSimulationCreateResponse
import io.clearstreet.studio.models.EntityRegtMarginSimulationRetrieveParams
import io.clearstreet.studio.models.RegtMarginSimulation
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.json
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler

class RegtMarginSimulationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RegtMarginSimulationService {

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
    ): EntityRegtMarginSimulationCreateResponse {
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    ): RegtMarginSimulation {
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
}
