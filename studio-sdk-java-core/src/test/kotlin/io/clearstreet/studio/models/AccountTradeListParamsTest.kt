// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTradeListParamsTest {

    @Test
    fun createAccountTradeListParams() {
        AccountTradeListParams.builder()
            .accountId("x")
            .pageSize(123L)
            .pageToken("page_token")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountTradeListParams.builder()
                .accountId("x")
                .pageSize(123L)
                .pageToken("page_token")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("page_size", listOf("123"))
        expected.put("page_token", listOf("page_token"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountTradeListParams.builder().accountId("x").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = AccountTradeListParams.builder().accountId("x").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
