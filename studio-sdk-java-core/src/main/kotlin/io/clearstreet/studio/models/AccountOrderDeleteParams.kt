// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import com.fasterxml.jackson.annotation.JsonCreator
import io.clearstreet.studio.core.Enum
import io.clearstreet.studio.core.JsonField
import io.clearstreet.studio.core.JsonValue
import io.clearstreet.studio.core.NoAutoDetect
import io.clearstreet.studio.core.toUnmodifiable
import io.clearstreet.studio.errors.StudioSdkInvalidDataException
import io.clearstreet.studio.models.*
import java.util.Objects
import java.util.Optional

class AccountOrderDeleteParams
constructor(
    private val accountId: String,
    private val symbol: String?,
    private val symbolFormat: SymbolFormat?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun symbol(): Optional<String> = Optional.ofNullable(symbol)

    fun symbolFormat(): Optional<SymbolFormat> = Optional.ofNullable(symbolFormat)

    @JvmSynthetic
    internal fun getBody(): Optional<Map<String, JsonValue>> {
        return Optional.ofNullable(additionalBodyProperties.ifEmpty { null })
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.symbol?.let { params.put("symbol", listOf(it.toString())) }
        this.symbolFormat?.let { params.put("symbol_format", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountId
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

        return other is AccountOrderDeleteParams &&
            this.accountId == other.accountId &&
            this.symbol == other.symbol &&
            this.symbolFormat == other.symbolFormat &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            symbol,
            symbolFormat,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountOrderDeleteParams{accountId=$accountId, symbol=$symbol, symbolFormat=$symbolFormat, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var symbol: String? = null
        private var symbolFormat: SymbolFormat? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountOrderDeleteParams: AccountOrderDeleteParams) = apply {
            this.accountId = accountOrderDeleteParams.accountId
            this.symbol = accountOrderDeleteParams.symbol
            this.symbolFormat = accountOrderDeleteParams.symbolFormat
            additionalQueryParams(accountOrderDeleteParams.additionalQueryParams)
            additionalHeaders(accountOrderDeleteParams.additionalHeaders)
            additionalBodyProperties(accountOrderDeleteParams.additionalBodyProperties)
        }

        /** Account ID for the account. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /**
         * Cancel orders only for this specific symbol. If this is omitted, all open orders will be
         * cancelled.
         */
        fun symbol(symbol: String) = apply { this.symbol = symbol }

        /** Format of the provided symbol. */
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

        fun build(): AccountOrderDeleteParams =
            AccountOrderDeleteParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                symbol,
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
