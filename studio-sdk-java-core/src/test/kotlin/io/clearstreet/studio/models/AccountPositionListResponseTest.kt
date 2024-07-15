// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountPositionListResponseTest {

    @Test
    fun createAccountPositionListResponse() {
        val accountPositionListResponse =
            AccountPositionListResponse.builder()
                .data(
                    listOf(Position.builder().accountId("x").quantity("x").symbol("AAPL").build())
                )
                .nextPageToken("next_page_token")
                .build()
        assertThat(accountPositionListResponse).isNotNull
        assertThat(accountPositionListResponse.data())
            .containsExactly(Position.builder().accountId("x").quantity("x").symbol("AAPL").build())
        assertThat(accountPositionListResponse.nextPageToken()).contains("next_page_token")
    }
}
