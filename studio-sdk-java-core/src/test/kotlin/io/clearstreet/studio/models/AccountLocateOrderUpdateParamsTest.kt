// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountLocateOrderUpdateParamsTest {

    @Test
    fun createAccountLocateOrderUpdateParams() {
        AccountLocateOrderUpdateParams.builder()
            .accountId("x")
            .locateOrderId("x")
            .accept(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountLocateOrderUpdateParams.builder()
                .accountId("x")
                .locateOrderId("x")
                .accept(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accept()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountLocateOrderUpdateParams.builder()
                .accountId("x")
                .locateOrderId("x")
                .accept(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accept()).isEqualTo(true)
    }

    @Test
    fun getPathParam() {
        val params =
            AccountLocateOrderUpdateParams.builder()
                .accountId("x")
                .locateOrderId("x")
                .accept(true)
                .build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // path param "locateOrderId"
        assertThat(params.getPathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
