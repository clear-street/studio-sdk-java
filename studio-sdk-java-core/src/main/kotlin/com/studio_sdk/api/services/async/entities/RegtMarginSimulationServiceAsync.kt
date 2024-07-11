// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.async.entities

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.EntityRegtMarginSimulationCreateParams
import com.studio_sdk.api.models.EntityRegtMarginSimulationCreateResponse
import com.studio_sdk.api.models.EntityRegtMarginSimulationRetrieveParams
import com.studio_sdk.api.models.RegtMarginSimulation
import java.util.concurrent.CompletableFuture

interface RegtMarginSimulationServiceAsync {

    /**
     * Simulate Reg-T margin calculation for a given hypothetical set of prices and/or trades. This
     * is useful for understanding the impact of price fluctuations or trades on margin
     * requirements. Once a simulation is created, it remains available for 48-hours, after which it
     * will automatically be deleted.
     *
     * Simulations created through the API are visible in the Studio UI under the Risk & Margin
     * section, after enabling the "Risk Simulations" toggle.
     */
    @JvmOverloads
    fun create(
        params: EntityRegtMarginSimulationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EntityRegtMarginSimulationCreateResponse>

    /**
     * Get a Reg-T margin simluation that was previously created. Note, simulations are
     * automatically deleted after 48-hours.
     */
    @JvmOverloads
    fun retrieve(
        params: EntityRegtMarginSimulationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RegtMarginSimulation>
}
