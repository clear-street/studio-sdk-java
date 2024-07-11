// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.studio_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityRegtMarginSimulationCreateParamsTest {

    @Test
    fun createEntityRegtMarginSimulationCreateParams() {
        EntityRegtMarginSimulationCreateParams.builder()
            .entityId("x")
            .name("string")
            .ignoreExisting(true)
            .prices(
                listOf(
                    EntityRegtMarginSimulationCreateParams.Price.builder()
                        .price("x")
                        .symbol("AAPL")
                        .symbolFormat(EntityRegtMarginSimulationCreateParams.Price.SymbolFormat.CMS)
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
                        .symbolFormat(EntityRegtMarginSimulationCreateParams.Trade.SymbolFormat.CMS)
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EntityRegtMarginSimulationCreateParams.builder()
                .entityId("x")
                .name("string")
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.ignoreExisting()).isEqualTo(true)
        assertThat(body.prices())
            .isEqualTo(
                listOf(
                    EntityRegtMarginSimulationCreateParams.Price.builder()
                        .price("x")
                        .symbol("AAPL")
                        .symbolFormat(EntityRegtMarginSimulationCreateParams.Price.SymbolFormat.CMS)
                        .build()
                )
            )
        assertThat(body.trades())
            .isEqualTo(
                listOf(
                    EntityRegtMarginSimulationCreateParams.Trade.builder()
                        .price("x")
                        .quantity("x")
                        .side(EntityRegtMarginSimulationCreateParams.Trade.Side.BUY)
                        .symbol("AAPL")
                        .symbolFormat(EntityRegtMarginSimulationCreateParams.Trade.SymbolFormat.CMS)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EntityRegtMarginSimulationCreateParams.builder().entityId("x").name("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
    }

    @Test
    fun getPathParam() {
        val params =
            EntityRegtMarginSimulationCreateParams.builder().entityId("x").name("string").build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
