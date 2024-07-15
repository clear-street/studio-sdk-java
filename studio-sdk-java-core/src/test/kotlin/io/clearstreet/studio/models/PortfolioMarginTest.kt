// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PortfolioMarginTest {

    @Test
    fun createPortfolioMargin() {
        val portfolioMargin =
            PortfolioMargin.builder()
                .addOnRequirement(42.23)
                .addOnRequirementPercent(42.23)
                .concentrationAddOn(42.23)
                .concentrationAddOnPercent(42.23)
                .discretionaryRequirement(42.23)
                .discretionaryRequirementPercent(42.23)
                .effeciveExcess(42.23)
                .effectiveRequirement(42.23)
                .groups(
                    listOf(
                        PortfolioMargin.Group.builder()
                            .effectiveRequirement(42.23)
                            .marginPercent(42.23)
                            .marginPercentContribution(42.23)
                            .marketValue(42.23)
                            .marketValuePercent(42.23)
                            .members(
                                listOf(
                                    PortfolioMargin.Group.Member.builder()
                                        .assetClass(PortfolioMargin.Group.Member.AssetClass.OTHER)
                                        .marketValue(42.23)
                                        .marketValuePercent(42.23)
                                        .quantity("x")
                                        .shocks(
                                            PortfolioMargin.Group.Member.Shocks.builder().build()
                                        )
                                        .symbol("AAPL")
                                        .build()
                                )
                            )
                            .name("name")
                            .concentrationRequirement(42.23)
                            .discretionaryRequirement(42.23)
                            .liquidityRequirement(42.23)
                            .nonMarginableRequirement(42.23)
                            .regulatoryRequirement(42.23)
                            .riskBasedRequirement(42.23)
                            .shocks(PortfolioMargin.Group.Shocks.builder().build())
                            .varRequirement(42.23)
                            .build()
                    )
                )
                .houseExcess(42.23)
                .houseRequirement(42.23)
                .liquidityAddOn(42.23)
                .liquidityAddOnPercent(42.23)
                .netMarketValue(42.23)
                .nonMarginableRequirement(42.23)
                .nonMarginableRequirementPercent(42.23)
                .riskBasedRequirement(42.23)
                .riskBasedRequirementPercent(42.23)
                .timestamp(1710613560668L)
                .vegaRequirement(42.23)
                .version("version")
                .build()
        assertThat(portfolioMargin).isNotNull
        assertThat(portfolioMargin.addOnRequirement()).contains(42.23)
        assertThat(portfolioMargin.addOnRequirementPercent()).contains(42.23)
        assertThat(portfolioMargin.concentrationAddOn()).contains(42.23)
        assertThat(portfolioMargin.concentrationAddOnPercent()).contains(42.23)
        assertThat(portfolioMargin.discretionaryRequirement()).contains(42.23)
        assertThat(portfolioMargin.discretionaryRequirementPercent()).contains(42.23)
        assertThat(portfolioMargin.effeciveExcess()).contains(42.23)
        assertThat(portfolioMargin.effectiveRequirement()).contains(42.23)
        assertThat(portfolioMargin.groups().get())
            .containsExactly(
                PortfolioMargin.Group.builder()
                    .effectiveRequirement(42.23)
                    .marginPercent(42.23)
                    .marginPercentContribution(42.23)
                    .marketValue(42.23)
                    .marketValuePercent(42.23)
                    .members(
                        listOf(
                            PortfolioMargin.Group.Member.builder()
                                .assetClass(PortfolioMargin.Group.Member.AssetClass.OTHER)
                                .marketValue(42.23)
                                .marketValuePercent(42.23)
                                .quantity("x")
                                .shocks(PortfolioMargin.Group.Member.Shocks.builder().build())
                                .symbol("AAPL")
                                .build()
                        )
                    )
                    .name("name")
                    .concentrationRequirement(42.23)
                    .discretionaryRequirement(42.23)
                    .liquidityRequirement(42.23)
                    .nonMarginableRequirement(42.23)
                    .regulatoryRequirement(42.23)
                    .riskBasedRequirement(42.23)
                    .shocks(PortfolioMargin.Group.Shocks.builder().build())
                    .varRequirement(42.23)
                    .build()
            )
        assertThat(portfolioMargin.houseExcess()).contains(42.23)
        assertThat(portfolioMargin.houseRequirement()).contains(42.23)
        assertThat(portfolioMargin.liquidityAddOn()).contains(42.23)
        assertThat(portfolioMargin.liquidityAddOnPercent()).contains(42.23)
        assertThat(portfolioMargin.netMarketValue()).contains(42.23)
        assertThat(portfolioMargin.nonMarginableRequirement()).contains(42.23)
        assertThat(portfolioMargin.nonMarginableRequirementPercent()).contains(42.23)
        assertThat(portfolioMargin.riskBasedRequirement()).contains(42.23)
        assertThat(portfolioMargin.riskBasedRequirementPercent()).contains(42.23)
        assertThat(portfolioMargin.timestamp()).contains(1710613560668L)
        assertThat(portfolioMargin.vegaRequirement()).contains(42.23)
        assertThat(portfolioMargin.version()).contains("version")
    }
}
