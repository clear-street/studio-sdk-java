// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountOrderDeleteResponseTest {

    @Test
    fun createAccountOrderDeleteResponse() {
        val accountOrderDeleteResponse =
            AccountOrderDeleteResponse.builder().data(listOf("x")).build()
        assertThat(accountOrderDeleteResponse).isNotNull
        assertThat(accountOrderDeleteResponse.data()).containsExactly("x")
    }
}
