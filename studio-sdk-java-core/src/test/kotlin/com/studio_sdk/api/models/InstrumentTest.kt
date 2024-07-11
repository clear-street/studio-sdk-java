// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InstrumentTest {

    @Test
    fun createInstrument() {
        val instrument =
            Instrument.builder()
                .assetClass(Instrument.AssetClass.OTHER)
                .description("Apple Inc.")
                .primaryExchange("NASDAQ")
                .symbols(
                    listOf(
                        Instrument.Symbol.builder()
                            .symbol("AAPL")
                            .symbolFormat(Instrument.Symbol.SymbolFormat.CMS)
                            .build()
                    )
                )
                .build()
        assertThat(instrument).isNotNull
        assertThat(instrument.assetClass()).isEqualTo(Instrument.AssetClass.OTHER)
        assertThat(instrument.description()).isEqualTo("Apple Inc.")
        assertThat(instrument.primaryExchange()).isEqualTo("NASDAQ")
        assertThat(instrument.symbols())
            .containsExactly(
                Instrument.Symbol.builder()
                    .symbol("AAPL")
                    .symbolFormat(Instrument.Symbol.SymbolFormat.CMS)
                    .build()
            )
    }
}
