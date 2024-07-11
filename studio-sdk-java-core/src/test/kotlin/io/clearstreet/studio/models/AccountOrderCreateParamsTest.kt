// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountOrderCreateParamsTest {

    @Test
    fun createAccountOrderCreateParams() {
        AccountOrderCreateParams.builder()
            .accountId("x")
            .orderType(AccountOrderCreateParams.OrderType.LIMIT)
            .quantity("x")
            .side(AccountOrderCreateParams.Side.BUY)
            .strategyType(AccountOrderCreateParams.StrategyType.SOR)
            .symbol("AAPL")
            .timeInForce(AccountOrderCreateParams.TimeInForce.DAY)
            .locateBroker("x")
            .price("x")
            .referenceId("my-order-id-123")
            .symbolFormat(AccountOrderCreateParams.SymbolFormat.CMS)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountOrderCreateParams.builder()
                .accountId("x")
                .orderType(AccountOrderCreateParams.OrderType.LIMIT)
                .quantity("x")
                .side(AccountOrderCreateParams.Side.BUY)
                .strategyType(AccountOrderCreateParams.StrategyType.SOR)
                .symbol("AAPL")
                .timeInForce(AccountOrderCreateParams.TimeInForce.DAY)
                .locateBroker("x")
                .price("x")
                .referenceId("my-order-id-123")
                .symbolFormat(AccountOrderCreateParams.SymbolFormat.CMS)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.orderType()).isEqualTo(AccountOrderCreateParams.OrderType.LIMIT)
        assertThat(body.quantity()).isEqualTo("x")
        assertThat(body.side()).isEqualTo(AccountOrderCreateParams.Side.BUY)
        assertThat(body.strategyType()).isEqualTo(AccountOrderCreateParams.StrategyType.SOR)
        assertThat(body.symbol()).isEqualTo("AAPL")
        assertThat(body.timeInForce()).isEqualTo(AccountOrderCreateParams.TimeInForce.DAY)
        assertThat(body.locateBroker()).isEqualTo("x")
        assertThat(body.price()).isEqualTo("x")
        assertThat(body.referenceId()).isEqualTo("my-order-id-123")
        assertThat(body.symbolFormat()).isEqualTo(AccountOrderCreateParams.SymbolFormat.CMS)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountOrderCreateParams.builder()
                .accountId("x")
                .orderType(AccountOrderCreateParams.OrderType.LIMIT)
                .quantity("x")
                .side(AccountOrderCreateParams.Side.BUY)
                .strategyType(AccountOrderCreateParams.StrategyType.SOR)
                .symbol("AAPL")
                .timeInForce(AccountOrderCreateParams.TimeInForce.DAY)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.orderType()).isEqualTo(AccountOrderCreateParams.OrderType.LIMIT)
        assertThat(body.quantity()).isEqualTo("x")
        assertThat(body.side()).isEqualTo(AccountOrderCreateParams.Side.BUY)
        assertThat(body.strategyType()).isEqualTo(AccountOrderCreateParams.StrategyType.SOR)
        assertThat(body.symbol()).isEqualTo("AAPL")
        assertThat(body.timeInForce()).isEqualTo(AccountOrderCreateParams.TimeInForce.DAY)
    }

    @Test
    fun getPathParam() {
        val params =
            AccountOrderCreateParams.builder()
                .accountId("x")
                .orderType(AccountOrderCreateParams.OrderType.LIMIT)
                .quantity("x")
                .side(AccountOrderCreateParams.Side.BUY)
                .strategyType(AccountOrderCreateParams.StrategyType.SOR)
                .symbol("AAPL")
                .timeInForce(AccountOrderCreateParams.TimeInForce.DAY)
                .build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
