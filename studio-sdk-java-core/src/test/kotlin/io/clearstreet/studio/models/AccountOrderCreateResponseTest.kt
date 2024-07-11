// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountOrderCreateResponseTest {

    @Test
    fun createAccountOrderCreateResponse() {
        val accountOrderCreateResponse =
            AccountOrderCreateResponse.builder().orderId("234usdfa3").build()
        assertThat(accountOrderCreateResponse).isNotNull
        assertThat(accountOrderCreateResponse.orderId()).isEqualTo("234usdfa3")
    }
}
