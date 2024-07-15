// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountBulkOrderCreateResponseTest {

    @Test
    fun createAccountBulkOrderCreateResponse() {
        val accountBulkOrderCreateResponse =
            AccountBulkOrderCreateResponse.builder()
                .data(
                    listOf(
                        AccountBulkOrderCreateResponse.Data.builder()
                            .submitted(true)
                            .orderId("x")
                            .reason("reason")
                            .build()
                    )
                )
                .rejected(123L)
                .submitted(123L)
                .build()
        assertThat(accountBulkOrderCreateResponse).isNotNull
        assertThat(accountBulkOrderCreateResponse.data())
            .containsExactly(
                AccountBulkOrderCreateResponse.Data.builder()
                    .submitted(true)
                    .orderId("x")
                    .reason("reason")
                    .build()
            )
        assertThat(accountBulkOrderCreateResponse.rejected()).isEqualTo(123L)
        assertThat(accountBulkOrderCreateResponse.submitted()).isEqualTo(123L)
    }
}
