// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.TestServerExtension
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OrderServiceTest {

    @Test
    fun callCreate() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.accounts().orders()
        val accountOrderCreateResponse =
            orderService.create(
                AccountOrderCreateParams.builder()
                    .accountId("x")
                    .orderType(AccountOrderCreateParams.OrderType.LIMIT)
                    .quantity("x")
                    .side(AccountOrderCreateParams.Side.BUY)
                    .strategyType(AccountOrderCreateParams.StrategyType.SOR)
                    .symbol("AAPL")
                    .timeInForce(AccountOrderCreateParams.TimeInForce.DAY)
                    .locateBroker("x")
                    .price("x")
                    .referenceId("my-order-id-123")
                    .symbolFormat(AccountOrderCreateParams.SymbolFormat.CMS)
                    .build()
            )
        println(accountOrderCreateResponse)
        accountOrderCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.accounts().orders()
        val accountOrderRetrieveResponse =
            orderService.retrieve(
                AccountOrderRetrieveParams.builder().accountId("x").orderId("x").build()
            )
        println(accountOrderRetrieveResponse)
        accountOrderRetrieveResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.accounts().orders()
        val accountOrderListResponse =
            orderService.list(
                AccountOrderListParams.builder()
                    .accountId("x")
                    .from(1710613560668L)
                    .pageSize(123L)
                    .pageToken("string")
                    .to(1710613560668L)
                    .build()
            )
        println(accountOrderListResponse)
        accountOrderListResponse.validate()
    }

    @Test
    fun callDelete() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.accounts().orders()
        val accountOrderDeleteResponse =
            orderService.delete(
                AccountOrderDeleteParams.builder()
                    .accountId("x")
                    .symbol("AAPL")
                    .symbolFormat(AccountOrderDeleteParams.SymbolFormat.CMS)
                    .build()
            )
        println(accountOrderDeleteResponse)
        accountOrderDeleteResponse.validate()
    }

    @Test
    fun callCancel() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val orderService = client.accounts().orders()
        orderService.cancel(AccountOrderCancelParams.builder().accountId("x").orderId("x").build())
    }
}
