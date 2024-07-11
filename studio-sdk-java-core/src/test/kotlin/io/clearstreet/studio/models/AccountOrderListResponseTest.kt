// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountOrderListResponseTest {

    @Test
    fun createAccountOrderListResponse() {
        val accountOrderListResponse =
            AccountOrderListResponse.builder()
                .data(
                    listOf(
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
                    )
                )
                .nextPageToken("string")
                .build()
        assertThat(accountOrderListResponse).isNotNull
        assertThat(accountOrderListResponse.data())
            .containsExactly(
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
            )
        assertThat(accountOrderListResponse.nextPageToken()).contains("string")
    }
}
