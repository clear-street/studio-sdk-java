// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking.entities

import com.studio_sdk.api.TestServerExtension
import com.studio_sdk.api.client.okhttp.StudioSdkOkHttpClient
import com.studio_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PortfolioMarginServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val portfolioMarginService = client.entities().portfolioMargins()
        val portfolioMargin =
            portfolioMarginService.retrieve(
                EntityPortfolioMarginRetrieveParams.builder().entityId("x").build()
            )
        println(portfolioMargin)
        portfolioMargin.validate()
    }
}
