// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking.accounts

import com.studio_sdk.api.TestServerExtension
import com.studio_sdk.api.client.okhttp.StudioSdkOkHttpClient
import com.studio_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TradeServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tradeService = client.accounts().trades()
        val trade =
            tradeService.retrieve(
                AccountTradeRetrieveParams.builder().accountId("x").tradeId("x").build()
            )
        println(trade)
        trade.validate()
    }

    @Test
    fun callList() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val tradeService = client.accounts().trades()
        val accountTradeListResponse =
            tradeService.list(
                AccountTradeListParams.builder()
                    .accountId("x")
                    .pageSize(123L)
                    .pageToken("string")
                    .build()
            )
        println(accountTradeListResponse)
        accountTradeListResponse.validate()
    }
}
