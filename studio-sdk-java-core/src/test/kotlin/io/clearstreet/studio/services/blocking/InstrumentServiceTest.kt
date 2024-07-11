// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking

import io.clearstreet.studio.TestServerExtension
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InstrumentServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val instrumentService = client.instruments()
        val instrument =
            instrumentService.retrieve(
                InstrumentRetrieveParams.builder()
                    .symbol("AAPL")
                    .symbolFormat(InstrumentRetrieveParams.SymbolFormat.CMS)
                    .build()
            )
        println(instrument)
        instrument.validate()
    }
}
