// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTradeListResponseTest {

    @Test
    fun createAccountTradeListResponse() {
        val accountTradeListResponse =
            AccountTradeListResponse.builder()
                .data(
                    listOf(
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
                    )
                )
                .nextPageToken("next_page_token")
                .build()
        assertThat(accountTradeListResponse).isNotNull
        assertThat(accountTradeListResponse.data())
            .containsExactly(
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
            )
        assertThat(accountTradeListResponse.nextPageToken()).contains("next_page_token")
    }
}
