// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking.accounts

import com.studio_sdk.api.TestServerExtension
import com.studio_sdk.api.client.okhttp.StudioSdkOkHttpClient
import com.studio_sdk.api.models.*
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
                    .pageToken("string")
                    .build()
            )
        println(accountPositionListResponse)
        accountPositionListResponse.validate()
    }
}
