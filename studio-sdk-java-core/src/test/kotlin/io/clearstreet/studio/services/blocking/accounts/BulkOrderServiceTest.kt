// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.TestServerExtension
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BulkOrderServiceTest {

    @Test
    fun callCreate() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val bulkOrderService = client.accounts().bulkOrders()
        val accountBulkOrderCreateResponse =
            bulkOrderService.create(
                AccountBulkOrderCreateParams.builder()
                    .accountId("x")
                    .orders(
                        listOf(
                            AccountBulkOrderCreateParams.Order.builder()
                                .orderType(AccountBulkOrderCreateParams.Order.OrderType.LIMIT)
                                .quantity("x")
                                .side(AccountBulkOrderCreateParams.Order.Side.BUY)
                                .strategyType(AccountBulkOrderCreateParams.Order.StrategyType.SOR)
                                .symbol("AAPL")
                                .timeInForce(AccountBulkOrderCreateParams.Order.TimeInForce.DAY)
                                .locateBroker("x")
                                .price("x")
                                .referenceId("my-order-id-123")
                                .symbolFormat(AccountBulkOrderCreateParams.Order.SymbolFormat.CMS)
                                .build()
                        )
                    )
                    .build()
            )
        println(accountBulkOrderCreateResponse)
        accountBulkOrderCreateResponse.validate()
    }
}
