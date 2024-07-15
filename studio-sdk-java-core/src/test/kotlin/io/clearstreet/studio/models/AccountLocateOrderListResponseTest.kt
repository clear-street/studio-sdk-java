// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountLocateOrderListResponseTest {

    @Test
    fun createAccountLocateOrderListResponse() {
        val accountLocateOrderListResponse =
            AccountLocateOrderListResponse.builder()
                .data(
                    listOf(
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
                    )
                )
                .build()
        assertThat(accountLocateOrderListResponse).isNotNull
        assertThat(accountLocateOrderListResponse.data())
            .containsExactly(
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
            )
    }
}
