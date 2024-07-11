// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OrderTest {

    @Test
    fun createOrder() {
        val order =
            Order.builder()
                .accountId("x")
                .createdAt(1710613560668L)
                .filledQuantity("x")
                .orderId("x")
                .orderType(Order.OrderType.LIMIT)
                .quantity("x")
                .side(Order.Side.BUY)
                .state(Order.State.OPEN)
                .status(Order.Status.NEW)
                .strategyType(Order.StrategyType.SOR)
                .symbol("AAPL")
                .timeInForce(Order.TimeInForce.DAY)
                .updatedAt(1710613560668L)
                .version(123L)
                .averagePrice(42.23)
                .orderUpdateReason(Order.OrderUpdateReason.PLACE)
                .price("x")
                .referenceId("my-order-id-123")
                .text("string")
                .build()
        assertThat(order).isNotNull
        assertThat(order.accountId()).isEqualTo("x")
        assertThat(order.createdAt()).isEqualTo(1710613560668L)
        assertThat(order.filledQuantity()).isEqualTo("x")
        assertThat(order.orderId()).isEqualTo("x")
        assertThat(order.orderType()).isEqualTo(Order.OrderType.LIMIT)
        assertThat(order.quantity()).isEqualTo("x")
        assertThat(order.side()).isEqualTo(Order.Side.BUY)
        assertThat(order.state()).isEqualTo(Order.State.OPEN)
        assertThat(order.status()).isEqualTo(Order.Status.NEW)
        assertThat(order.strategyType()).isEqualTo(Order.StrategyType.SOR)
        assertThat(order.symbol()).isEqualTo("AAPL")
        assertThat(order.timeInForce()).isEqualTo(Order.TimeInForce.DAY)
        assertThat(order.updatedAt()).isEqualTo(1710613560668L)
        assertThat(order.version()).isEqualTo(123L)
        assertThat(order.averagePrice()).contains(42.23)
        assertThat(order.orderUpdateReason()).contains(Order.OrderUpdateReason.PLACE)
        assertThat(order.price()).contains("x")
        assertThat(order.referenceId()).contains("my-order-id-123")
        assertThat(order.text()).contains("string")
    }
}
