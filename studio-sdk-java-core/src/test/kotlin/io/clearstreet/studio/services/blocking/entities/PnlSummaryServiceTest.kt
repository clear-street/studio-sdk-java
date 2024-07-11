// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.entities

import io.clearstreet.studio.TestServerExtension
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PnlSummaryServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val pnlSummaryService = client.entities().pnlSummaries()
        val pnlSummary =
            pnlSummaryService.retrieve(
                EntityPnlSummaryRetrieveParams.builder().entityId("x").build()
            )
        println(pnlSummary)
        pnlSummary.validate()
    }
}
