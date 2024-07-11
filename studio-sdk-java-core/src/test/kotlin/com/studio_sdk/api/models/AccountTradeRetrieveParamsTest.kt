// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.studio_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTradeRetrieveParamsTest {

    @Test
    fun createAccountTradeRetrieveParams() {
        AccountTradeRetrieveParams.builder().accountId("x").tradeId("x").build()
    }

    @Test
    fun getPathParam() {
        val params = AccountTradeRetrieveParams.builder().accountId("x").tradeId("x").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // path param "tradeId"
        assertThat(params.getPathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
