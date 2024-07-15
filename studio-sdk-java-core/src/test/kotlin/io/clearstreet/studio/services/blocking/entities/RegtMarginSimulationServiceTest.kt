// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.entities

import io.clearstreet.studio.TestServerExtension
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RegtMarginSimulationServiceTest {

    @Test
    fun callCreate() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val regtMarginSimulationService = client.entities().regtMarginSimulations()
        val entityRegtMarginSimulationCreateResponse =
            regtMarginSimulationService.create(
                EntityRegtMarginSimulationCreateParams.builder()
                    .entityId("x")
                    .name("name")
                    .ignoreExisting(true)
                    .prices(
                        listOf(
                            EntityRegtMarginSimulationCreateParams.Price.builder()
                                .price("x")
                                .symbol("AAPL")
                                .symbolFormat(
                                    EntityRegtMarginSimulationCreateParams.Price.SymbolFormat.CMS
                                )
                                .build()
                        )
                    )
                    .trades(
                        listOf(
                            EntityRegtMarginSimulationCreateParams.Trade.builder()
                                .price("x")
                                .quantity("x")
                                .side(EntityRegtMarginSimulationCreateParams.Trade.Side.BUY)
                                .symbol("AAPL")
                                .symbolFormat(
                                    EntityRegtMarginSimulationCreateParams.Trade.SymbolFormat.CMS
                                )
                                .build()
                        )
                    )
                    .build()
            )
        println(entityRegtMarginSimulationCreateResponse)
        entityRegtMarginSimulationCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val regtMarginSimulationService = client.entities().regtMarginSimulations()
        val regtMarginSimulation =
            regtMarginSimulationService.retrieve(
                EntityRegtMarginSimulationRetrieveParams.builder()
                    .entityId("x")
                    .simulationId("6460030d-8ed4-19d3-818e-e87b36e90005")
                    .build()
            )
        println(regtMarginSimulation)
        regtMarginSimulation.validate()
    }
}
