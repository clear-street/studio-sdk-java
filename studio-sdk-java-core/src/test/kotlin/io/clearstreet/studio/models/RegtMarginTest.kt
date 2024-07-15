// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RegtMarginTest {

    @Test
    fun createRegtMargin() {
        val regtMargin =
            RegtMargin.builder()
                .dayTradeBuyingPower(42.23)
                .effectiveRequirement(42.23)
                .exchangeRequirement(42.23)
                .groups(
                    listOf(
                        RegtMargin.Group.builder()
                            .effectiveRequirement(42.23)
                            .exchangeRequirement(42.23)
                            .houseRequirement(42.23)
                            .marginPercent(42.23)
                            .marginPercentContribution(42.23)
                            .marketValue(42.23)
                            .marketValuePercent(42.23)
                            .members(
                                listOf(
                                    RegtMargin.Group.Member.builder()
                                        .assetClass(RegtMargin.Group.Member.AssetClass.OTHER)
                                        .marketValue(42.23)
                                        .marketValuePercent(42.23)
                                        .quantity("x")
                                        .symbol("AAPL")
                                        .build()
                                )
                            )
                            .name("name")
                            .build()
                    )
                )
                .houseExcess(42.23)
                .houseRequirement(42.23)
                .netMarketValue(42.23)
                .overnightBuyingPower(42.23)
                .sma(42.23)
                .sodBuyingPower(42.23)
                .timestamp(1710613560668L)
                .version("version")
                .effectiveExcess(42.23)
                .exchangeExcess(42.23)
                .build()
        assertThat(regtMargin).isNotNull
        assertThat(regtMargin.dayTradeBuyingPower()).isEqualTo(42.23)
        assertThat(regtMargin.effectiveRequirement()).isEqualTo(42.23)
        assertThat(regtMargin.exchangeRequirement()).isEqualTo(42.23)
        assertThat(regtMargin.groups())
            .containsExactly(
                RegtMargin.Group.builder()
                    .effectiveRequirement(42.23)
                    .exchangeRequirement(42.23)
                    .houseRequirement(42.23)
                    .marginPercent(42.23)
                    .marginPercentContribution(42.23)
                    .marketValue(42.23)
                    .marketValuePercent(42.23)
                    .members(
                        listOf(
                            RegtMargin.Group.Member.builder()
                                .assetClass(RegtMargin.Group.Member.AssetClass.OTHER)
                                .marketValue(42.23)
                                .marketValuePercent(42.23)
                                .quantity("x")
                                .symbol("AAPL")
                                .build()
                        )
                    )
                    .name("name")
                    .build()
            )
        assertThat(regtMargin.houseExcess()).isEqualTo(42.23)
        assertThat(regtMargin.houseRequirement()).isEqualTo(42.23)
        assertThat(regtMargin.netMarketValue()).isEqualTo(42.23)
        assertThat(regtMargin.overnightBuyingPower()).isEqualTo(42.23)
        assertThat(regtMargin.sma()).isEqualTo(42.23)
        assertThat(regtMargin.sodBuyingPower()).isEqualTo(42.23)
        assertThat(regtMargin.timestamp()).isEqualTo(1710613560668L)
        assertThat(regtMargin.version()).isEqualTo("version")
        assertThat(regtMargin.effectiveExcess()).contains(42.23)
        assertThat(regtMargin.exchangeExcess()).contains(42.23)
    }
}
