// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.studio_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountOrderListParamsTest {

    @Test
    fun createAccountOrderListParams() {
        AccountOrderListParams.builder()
            .accountId("x")
            .from(1710613560668L)
            .pageSize(123L)
            .pageToken("string")
            .to(1710613560668L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountOrderListParams.builder()
                .accountId("x")
                .from(1710613560668L)
                .pageSize(123L)
                .pageToken("string")
                .to(1710613560668L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("from", listOf("1710613560668"))
        expected.put("page_size", listOf("123"))
        expected.put("page_token", listOf("string"))
        expected.put("to", listOf("1710613560668"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountOrderListParams.builder().accountId("x").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = AccountOrderListParams.builder().accountId("x").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
