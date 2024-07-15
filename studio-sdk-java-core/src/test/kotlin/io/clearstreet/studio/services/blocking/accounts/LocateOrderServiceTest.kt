// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.TestServerExtension
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LocateOrderServiceTest {

    @Test
    fun callCreate() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val locateOrderService = client.accounts().locateOrders()
        val locateOrder =
            locateOrderService.create(
                AccountLocateOrderCreateParams.builder()
                    .accountId("x")
                    .mpid("x")
                    .quantity("x")
                    .referenceId("my-order-id-123")
                    .symbol("AAPL")
                    .comments("comments")
                    .build()
            )
        println(locateOrder)
        locateOrder.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val locateOrderService = client.accounts().locateOrders()
        val locateOrder =
            locateOrderService.retrieve(
                AccountLocateOrderRetrieveParams.builder().accountId("x").locateOrderId("x").build()
            )
        println(locateOrder)
        locateOrder.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val locateOrderService = client.accounts().locateOrders()
        locateOrderService.update(
            AccountLocateOrderUpdateParams.builder()
                .accountId("x")
                .locateOrderId("x")
                .accept(true)
                .build()
        )
    }

    @Test
    fun callList() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val locateOrderService = client.accounts().locateOrders()
        val accountLocateOrderListResponse =
            locateOrderService.list(AccountLocateOrderListParams.builder().accountId("x").build())
        println(accountLocateOrderListResponse)
        accountLocateOrderListResponse.validate()
    }
}
