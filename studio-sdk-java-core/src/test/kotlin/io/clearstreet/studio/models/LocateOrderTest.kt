// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LocateOrderTest {

    @Test
    fun createLocateOrder() {
        val locateOrder =
            LocateOrder.builder()
                .accountId("x")
                .locateOrderId("x")
                .mpid("CLST")
                .requestedAt(1710613560668L)
                .requestedQuantity("x")
                .status(LocateOrder.Status.PENDING)
                .symbol("AAPL")
                .updatedAt(1710613560668L)
                .borrowRate("x")
                .deskComment("desk_comment")
                .expiresAt(1710613560668L)
                .locateId("x")
                .locatedAt(1710613560668L)
                .locatedQuantity("x")
                .referenceId("my-order-id-123")
                .totalCost("x")
                .traderComment("trader_comment")
                .build()
        assertThat(locateOrder).isNotNull
        assertThat(locateOrder.accountId()).isEqualTo("x")
        assertThat(locateOrder.locateOrderId()).isEqualTo("x")
        assertThat(locateOrder.mpid()).isEqualTo("CLST")
        assertThat(locateOrder.requestedAt()).isEqualTo(1710613560668L)
        assertThat(locateOrder.requestedQuantity()).isEqualTo("x")
        assertThat(locateOrder.status()).isEqualTo(LocateOrder.Status.PENDING)
        assertThat(locateOrder.symbol()).isEqualTo("AAPL")
        assertThat(locateOrder.updatedAt()).isEqualTo(1710613560668L)
        assertThat(locateOrder.borrowRate()).contains("x")
        assertThat(locateOrder.deskComment()).contains("desk_comment")
        assertThat(locateOrder.expiresAt()).contains(1710613560668L)
        assertThat(locateOrder.locateId()).contains("x")
        assertThat(locateOrder.locatedAt()).contains(1710613560668L)
        assertThat(locateOrder.locatedQuantity()).contains("x")
        assertThat(locateOrder.referenceId()).contains("my-order-id-123")
        assertThat(locateOrder.totalCost()).contains("x")
        assertThat(locateOrder.traderComment()).contains("trader_comment")
    }
}
