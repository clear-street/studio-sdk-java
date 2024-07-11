// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountEasyBorrowListResponseTest {

    @Test
    fun createAccountEasyBorrowListResponse() {
        val accountEasyBorrowListResponse =
            AccountEasyBorrowListResponse.builder().data(listOf("AAPL")).build()
        assertThat(accountEasyBorrowListResponse).isNotNull
        assertThat(accountEasyBorrowListResponse.data()).containsExactly("AAPL")
    }
}
