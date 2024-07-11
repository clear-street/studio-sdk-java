// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountBulkOrderCreateParamsTest {

    @Test
    fun createAccountBulkOrderCreateParams() {
        AccountBulkOrderCreateParams.builder()
            .accountId("x")
            .orders(
                listOf(
                    AccountBulkOrderCreateParams.Order.builder()
                        .orderType(AccountBulkOrderCreateParams.Order.OrderType.LIMIT)
                        .quantity("x")
                        .side(AccountBulkOrderCreateParams.Order.Side.BUY)
                        .strategyType(AccountBulkOrderCreateParams.Order.StrategyType.SOR)
                        .symbol("AAPL")
                        .timeInForce(AccountBulkOrderCreateParams.Order.TimeInForce.DAY)
                        .locateBroker("x")
                        .price("x")
                        .referenceId("my-order-id-123")
                        .symbolFormat(AccountBulkOrderCreateParams.Order.SymbolFormat.CMS)
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountBulkOrderCreateParams.builder()
                .accountId("x")
                .orders(
                    listOf(
                        AccountBulkOrderCreateParams.Order.builder()
                            .orderType(AccountBulkOrderCreateParams.Order.OrderType.LIMIT)
                            .quantity("x")
                            .side(AccountBulkOrderCreateParams.Order.Side.BUY)
                            .strategyType(AccountBulkOrderCreateParams.Order.StrategyType.SOR)
                            .symbol("AAPL")
                            .timeInForce(AccountBulkOrderCreateParams.Order.TimeInForce.DAY)
                            .locateBroker("x")
                            .price("x")
                            .referenceId("my-order-id-123")
                            .symbolFormat(AccountBulkOrderCreateParams.Order.SymbolFormat.CMS)
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.orders())
            .isEqualTo(
                listOf(
                    AccountBulkOrderCreateParams.Order.builder()
                        .orderType(AccountBulkOrderCreateParams.Order.OrderType.LIMIT)
                        .quantity("x")
                        .side(AccountBulkOrderCreateParams.Order.Side.BUY)
                        .strategyType(AccountBulkOrderCreateParams.Order.StrategyType.SOR)
                        .symbol("AAPL")
                        .timeInForce(AccountBulkOrderCreateParams.Order.TimeInForce.DAY)
                        .locateBroker("x")
                        .price("x")
                        .referenceId("my-order-id-123")
                        .symbolFormat(AccountBulkOrderCreateParams.Order.SymbolFormat.CMS)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountBulkOrderCreateParams.builder()
                .accountId("x")
                .orders(
                    listOf(
                        AccountBulkOrderCreateParams.Order.builder()
                            .orderType(AccountBulkOrderCreateParams.Order.OrderType.LIMIT)
                            .quantity("x")
                            .side(AccountBulkOrderCreateParams.Order.Side.BUY)
                            .strategyType(AccountBulkOrderCreateParams.Order.StrategyType.SOR)
                            .symbol("AAPL")
                            .timeInForce(AccountBulkOrderCreateParams.Order.TimeInForce.DAY)
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.orders())
            .isEqualTo(
                listOf(
                    AccountBulkOrderCreateParams.Order.builder()
                        .orderType(AccountBulkOrderCreateParams.Order.OrderType.LIMIT)
                        .quantity("x")
                        .side(AccountBulkOrderCreateParams.Order.Side.BUY)
                        .strategyType(AccountBulkOrderCreateParams.Order.StrategyType.SOR)
                        .symbol("AAPL")
                        .timeInForce(AccountBulkOrderCreateParams.Order.TimeInForce.DAY)
                        .build()
                )
            )
    }

    @Test
    fun getPathParam() {
        val params =
            AccountBulkOrderCreateParams.builder()
                .accountId("x")
                .orders(
                    listOf(
                        AccountBulkOrderCreateParams.Order.builder()
                            .orderType(AccountBulkOrderCreateParams.Order.OrderType.LIMIT)
                            .quantity("x")
                            .side(AccountBulkOrderCreateParams.Order.Side.BUY)
                            .strategyType(AccountBulkOrderCreateParams.Order.StrategyType.SOR)
                            .symbol("AAPL")
                            .timeInForce(AccountBulkOrderCreateParams.Order.TimeInForce.DAY)
                            .build()
                    )
                )
                .build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
