// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TradeTest {

    @Test
    fun createTrade() {
        val trade =
            Trade.builder()
                .createdAt(1710613560668L)
                .orderId("x")
                .price("x")
                .quantity("x")
                .side(Trade.Side.BUY)
                .tradeId("x")
                .accountId("x")
                .symbol("AAPL")
                .build()
        assertThat(trade).isNotNull
        assertThat(trade.createdAt()).isEqualTo(1710613560668L)
        assertThat(trade.orderId()).isEqualTo("x")
        assertThat(trade.price()).isEqualTo("x")
        assertThat(trade.quantity()).isEqualTo("x")
        assertThat(trade.side()).isEqualTo(Trade.Side.BUY)
        assertThat(trade.tradeId()).isEqualTo("x")
        assertThat(trade.accountId()).contains("x")
        assertThat(trade.symbol()).contains("AAPL")
    }
}
