// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountPositionRetrieveParamsTest {

    @Test
    fun createAccountPositionRetrieveParams() {
        AccountPositionRetrieveParams.builder().accountId("x").symbol("AAPL").build()
    }

    @Test
    fun getPathParam() {
        val params = AccountPositionRetrieveParams.builder().accountId("x").symbol("AAPL").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // path param "symbol"
        assertThat(params.getPathParam(1)).isEqualTo("AAPL")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
