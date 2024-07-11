// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountPnlDetailListResponseTest {

    @Test
    fun createAccountPnlDetailListResponse() {
        val accountPnlDetailListResponse =
            AccountPnlDetailListResponse.builder()
                .data(
                    listOf(
                        AccountPnlDetailListResponse.Data.builder()
                            .accountId("x")
                            .assetClass(AccountPnlDetailListResponse.Data.AssetClass.OTHER)
                            .boughtQuantity("x")
                            .buys(123L)
                            .dayPnl(42.23)
                            .entityId("x")
                            .grossMarketValue(42.23)
                            .netMarketValue(42.23)
                            .overnightPnl(42.23)
                            .price(42.23)
                            .quantity("x")
                            .realizedPnl(42.23)
                            .sells(123L)
                            .sodMarketValue(42.23)
                            .sodPrice(42.23)
                            .sodQuantity("x")
                            .soldQuantity("x")
                            .symbol("AAPL")
                            .symbolDescription("string")
                            .timestamp(1710613560668L)
                            .totalFees(42.23)
                            .totalPnl(42.23)
                            .underlier("AAPL")
                            .unrealizedPnl(42.23)
                            .build()
                    )
                )
                .build()
        assertThat(accountPnlDetailListResponse).isNotNull
        assertThat(accountPnlDetailListResponse.data())
            .containsExactly(
                AccountPnlDetailListResponse.Data.builder()
                    .accountId("x")
                    .assetClass(AccountPnlDetailListResponse.Data.AssetClass.OTHER)
                    .boughtQuantity("x")
                    .buys(123L)
                    .dayPnl(42.23)
                    .entityId("x")
                    .grossMarketValue(42.23)
                    .netMarketValue(42.23)
                    .overnightPnl(42.23)
                    .price(42.23)
                    .quantity("x")
                    .realizedPnl(42.23)
                    .sells(123L)
                    .sodMarketValue(42.23)
                    .sodPrice(42.23)
                    .sodQuantity("x")
                    .soldQuantity("x")
                    .symbol("AAPL")
                    .symbolDescription("string")
                    .timestamp(1710613560668L)
                    .totalFees(42.23)
                    .totalPnl(42.23)
                    .underlier("AAPL")
                    .unrealizedPnl(42.23)
                    .build()
            )
    }
}
