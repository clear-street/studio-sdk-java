// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.studio_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountOrderCancelParamsTest {

    @Test
    fun createAccountOrderCancelParams() {
        AccountOrderCancelParams.builder().accountId("x").orderId("x").build()
    }

    @Test
    fun getPathParam() {
        val params = AccountOrderCancelParams.builder().accountId("x").orderId("x").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // path param "orderId"
        assertThat(params.getPathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
