// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountLocateOrderRetrieveParamsTest {

    @Test
    fun createAccountLocateOrderRetrieveParams() {
        AccountLocateOrderRetrieveParams.builder().accountId("x").locateOrderId("x").build()
    }

    @Test
    fun getPathParam() {
        val params =
            AccountLocateOrderRetrieveParams.builder().accountId("x").locateOrderId("x").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // path param "locateOrderId"
        assertThat(params.getPathParam(1)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
