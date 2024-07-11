// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

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
                .nextPageToken("string")
                .build()
        assertThat(accountPositionListResponse).isNotNull
        assertThat(accountPositionListResponse.data())
            .containsExactly(Position.builder().accountId("x").quantity("x").symbol("AAPL").build())
        assertThat(accountPositionListResponse.nextPageToken()).contains("string")
    }
}
