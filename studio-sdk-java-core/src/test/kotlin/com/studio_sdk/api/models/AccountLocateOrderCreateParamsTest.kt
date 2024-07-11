// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.studio_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountLocateOrderCreateParamsTest {

    @Test
    fun createAccountLocateOrderCreateParams() {
        AccountLocateOrderCreateParams.builder()
            .accountId("x")
            .mpid("x")
            .quantity("x")
            .referenceId("my-order-id-123")
            .symbol("AAPL")
            .comments("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountLocateOrderCreateParams.builder()
                .accountId("x")
                .mpid("x")
                .quantity("x")
                .referenceId("my-order-id-123")
                .symbol("AAPL")
                .comments("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.mpid()).isEqualTo("x")
        assertThat(body.quantity()).isEqualTo("x")
        assertThat(body.referenceId()).isEqualTo("my-order-id-123")
        assertThat(body.symbol()).isEqualTo("AAPL")
        assertThat(body.comments()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountLocateOrderCreateParams.builder()
                .accountId("x")
                .mpid("x")
                .quantity("x")
                .referenceId("my-order-id-123")
                .symbol("AAPL")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.mpid()).isEqualTo("x")
        assertThat(body.quantity()).isEqualTo("x")
        assertThat(body.referenceId()).isEqualTo("my-order-id-123")
        assertThat(body.symbol()).isEqualTo("AAPL")
    }

    @Test
    fun getPathParam() {
        val params =
            AccountLocateOrderCreateParams.builder()
                .accountId("x")
                .mpid("x")
                .quantity("x")
                .referenceId("my-order-id-123")
                .symbol("AAPL")
                .build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
