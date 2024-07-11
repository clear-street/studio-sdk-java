// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.studio_sdk.api.core.Enum
import com.studio_sdk.api.core.JsonField
import com.studio_sdk.api.core.JsonValue
import com.studio_sdk.api.core.NoAutoDetect
import com.studio_sdk.api.core.toUnmodifiable
import com.studio_sdk.api.errors.StudioSdkInvalidDataException
import com.studio_sdk.api.models.*
import java.util.Objects
import java.util.Optional

class InstrumentRetrieveParams
constructor(
    private val symbol: String,
    private val symbolFormat: SymbolFormat?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun symbol(): String = symbol

    fun symbolFormat(): Optional<SymbolFormat> = Optional.ofNullable(symbolFormat)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.symbolFormat?.let { params.put("symbol_format", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> symbol
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentRetrieveParams &&
            this.symbol == other.symbol &&
            this.symbolFormat == other.symbolFormat &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            symbol,
            symbolFormat,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "InstrumentRetrieveParams{symbol=$symbol, symbolFormat=$symbolFormat, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var symbol: String? = null
        private var symbolFormat: SymbolFormat? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentRetrieveParams: InstrumentRetrieveParams) = apply {
            this.symbol = instrumentRetrieveParams.symbol
            this.symbolFormat = instrumentRetrieveParams.symbolFormat
            additionalQueryParams(instrumentRetrieveParams.additionalQueryParams)
            additionalHeaders(instrumentRetrieveParams.additionalHeaders)
            additionalBodyProperties(instrumentRetrieveParams.additionalBodyProperties)
        }

        fun symbol(symbol: String) = apply { this.symbol = symbol }

        /** The format of the provided symbol. */
        fun symbolFormat(symbolFormat: SymbolFormat) = apply { this.symbolFormat = symbolFormat }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): InstrumentRetrieveParams =
            InstrumentRetrieveParams(
                checkNotNull(symbol) { "`symbol` is required but was not set" },
                symbolFormat,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class SymbolFormat
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SymbolFormat && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CMS = SymbolFormat(JsonField.of("cms"))

            @JvmField val OSI = SymbolFormat(JsonField.of("osi"))

            @JvmStatic fun of(value: String) = SymbolFormat(JsonField.of(value))
        }

        enum class Known {
            CMS,
            OSI,
        }

        enum class Value {
            CMS,
            OSI,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CMS -> Value.CMS
                OSI -> Value.OSI
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CMS -> Known.CMS
                OSI -> Known.OSI
                else -> throw StudioSdkInvalidDataException("Unknown SymbolFormat: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
