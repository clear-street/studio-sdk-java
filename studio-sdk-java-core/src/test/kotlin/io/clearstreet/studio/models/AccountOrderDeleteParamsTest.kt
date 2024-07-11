// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountOrderDeleteParamsTest {

    @Test
    fun createAccountOrderDeleteParams() {
        AccountOrderDeleteParams.builder()
            .accountId("x")
            .symbol("AAPL")
            .symbolFormat(AccountOrderDeleteParams.SymbolFormat.CMS)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountOrderDeleteParams.builder()
                .accountId("x")
                .symbol("AAPL")
                .symbolFormat(AccountOrderDeleteParams.SymbolFormat.CMS)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("symbol", listOf("AAPL"))
        expected.put("symbol_format", listOf(AccountOrderDeleteParams.SymbolFormat.CMS.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountOrderDeleteParams.builder().accountId("x").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = AccountOrderDeleteParams.builder().accountId("x").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
