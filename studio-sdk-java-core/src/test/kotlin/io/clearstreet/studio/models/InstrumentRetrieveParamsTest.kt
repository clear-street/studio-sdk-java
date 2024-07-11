// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InstrumentRetrieveParamsTest {

    @Test
    fun createInstrumentRetrieveParams() {
        InstrumentRetrieveParams.builder()
            .symbol("AAPL")
            .symbolFormat(InstrumentRetrieveParams.SymbolFormat.CMS)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            InstrumentRetrieveParams.builder()
                .symbol("AAPL")
                .symbolFormat(InstrumentRetrieveParams.SymbolFormat.CMS)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("symbol_format", listOf(InstrumentRetrieveParams.SymbolFormat.CMS.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = InstrumentRetrieveParams.builder().symbol("AAPL").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = InstrumentRetrieveParams.builder().symbol("AAPL").build()
        assertThat(params).isNotNull
        // path param "symbol"
        assertThat(params.getPathParam(0)).isEqualTo("AAPL")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
