// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.TestServerExtension
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.models.*
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
