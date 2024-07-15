// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.TestServerExtension
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PositionServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val positionService = client.accounts().positions()
        val position =
            positionService.retrieve(
                AccountPositionRetrieveParams.builder().accountId("x").symbol("AAPL").build()
            )
        println(position)
        position.validate()
    }

    @Test
    fun callList() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val positionService = client.accounts().positions()
        val accountPositionListResponse =
            positionService.list(
                AccountPositionListParams.builder()
                    .accountId("x")
                    .pageSize(123L)
                    .pageToken("page_token")
                    .build()
            )
        println(accountPositionListResponse)
        accountPositionListResponse.validate()
    }
}
