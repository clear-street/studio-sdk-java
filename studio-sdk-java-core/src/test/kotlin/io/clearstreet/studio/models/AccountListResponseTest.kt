// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountListResponseTest {

    @Test
    fun createAccountListResponse() {
        val accountListResponse =
            AccountListResponse.builder()
                .data(
                    listOf(
                        Account.builder().accountId("x").entityId("x").name("Clear Street").build()
                    )
                )
                .build()
        assertThat(accountListResponse).isNotNull
        assertThat(accountListResponse.data().get())
            .containsExactly(
                Account.builder().accountId("x").entityId("x").name("Clear Street").build()
            )
    }
}
