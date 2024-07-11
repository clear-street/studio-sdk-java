// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PnlSummaryTest {

    @Test
    fun createPnlSummary() {
        val pnlSummary =
            PnlSummary.builder()
                .dayPnl(42.23)
                .entityId("x")
                .equity(42.23)
                .grossMarketValue(42.23)
                .longMarketValue(42.23)
                .netMarketValue(42.23)
                .netPnl(42.23)
                .overnightPnl(42.23)
                .realizedPnl(42.23)
                .shortMarketValue(42.23)
                .sodEquity(42.23)
                .sodGrossMarketValue(42.23)
                .sodLongMarketValue(42.23)
                .sodShortMarketValue(42.23)
                .timestamp(1710613560668L)
                .totalFees(42.23)
                .totalPnl(42.23)
                .unrealizedPnl(42.23)
                .build()
        assertThat(pnlSummary).isNotNull
        assertThat(pnlSummary.dayPnl()).isEqualTo(42.23)
        assertThat(pnlSummary.entityId()).isEqualTo("x")
        assertThat(pnlSummary.equity()).isEqualTo(42.23)
        assertThat(pnlSummary.grossMarketValue()).isEqualTo(42.23)
        assertThat(pnlSummary.longMarketValue()).isEqualTo(42.23)
        assertThat(pnlSummary.netMarketValue()).isEqualTo(42.23)
        assertThat(pnlSummary.netPnl()).isEqualTo(42.23)
        assertThat(pnlSummary.overnightPnl()).isEqualTo(42.23)
        assertThat(pnlSummary.realizedPnl()).isEqualTo(42.23)
        assertThat(pnlSummary.shortMarketValue()).isEqualTo(42.23)
        assertThat(pnlSummary.sodEquity()).isEqualTo(42.23)
        assertThat(pnlSummary.sodGrossMarketValue()).isEqualTo(42.23)
        assertThat(pnlSummary.sodLongMarketValue()).isEqualTo(42.23)
        assertThat(pnlSummary.sodShortMarketValue()).isEqualTo(42.23)
        assertThat(pnlSummary.timestamp()).isEqualTo(1710613560668L)
        assertThat(pnlSummary.totalFees()).isEqualTo(42.23)
        assertThat(pnlSummary.totalPnl()).isEqualTo(42.23)
        assertThat(pnlSummary.unrealizedPnl()).isEqualTo(42.23)
    }
}
