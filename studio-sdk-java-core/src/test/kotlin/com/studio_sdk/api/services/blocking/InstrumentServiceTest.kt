// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking

import com.studio_sdk.api.TestServerExtension
import com.studio_sdk.api.client.okhttp.StudioSdkOkHttpClient
import com.studio_sdk.api.models.*
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
