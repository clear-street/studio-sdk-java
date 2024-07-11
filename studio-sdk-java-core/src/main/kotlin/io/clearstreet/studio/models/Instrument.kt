// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.clearstreet.studio.core.Enum
import io.clearstreet.studio.core.ExcludeMissing
import io.clearstreet.studio.core.JsonField
import io.clearstreet.studio.core.JsonMissing
import io.clearstreet.studio.core.JsonValue
import io.clearstreet.studio.core.NoAutoDetect
import io.clearstreet.studio.core.toUnmodifiable
import io.clearstreet.studio.errors.StudioSdkInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Instrument.Builder::class)
@NoAutoDetect
class Instrument
private constructor(
    private val symbols: JsonField<List<Symbol>>,
    private val assetClass: JsonField<AssetClass>,
    private val primaryExchange: JsonField<String>,
    private val description: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun symbols(): List<Symbol> = symbols.getRequired("symbols")

    /** The asset class of the symbol. */
    fun assetClass(): AssetClass = assetClass.getRequired("asset_class")

    /** The primary exchange for the instrument. */
    fun primaryExchange(): String = primaryExchange.getRequired("primary_exchange")

    /** A description of the instrument. */
    fun description(): String = description.getRequired("description")

    @JsonProperty("symbols") @ExcludeMissing fun _symbols() = symbols

    /** The asset class of the symbol. */
    @JsonProperty("asset_class") @ExcludeMissing fun _assetClass() = assetClass

    /** The primary exchange for the instrument. */
    @JsonProperty("primary_exchange") @ExcludeMissing fun _primaryExchange() = primaryExchange

    /** A description of the instrument. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Instrument = apply {
        if (!validated) {
            symbols().forEach { it.validate() }
            assetClass()
            primaryExchange()
            description()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Instrument &&
            this.symbols == other.symbols &&
            this.assetClass == other.assetClass &&
            this.primaryExchange == other.primaryExchange &&
            this.description == other.description &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    symbols,
                    assetClass,
                    primaryExchange,
                    description,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Instrument{symbols=$symbols, assetClass=$assetClass, primaryExchange=$primaryExchange, description=$description, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var symbols: JsonField<List<Symbol>> = JsonMissing.of()
        private var assetClass: JsonField<AssetClass> = JsonMissing.of()
        private var primaryExchange: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrument: Instrument) = apply {
            this.symbols = instrument.symbols
            this.assetClass = instrument.assetClass
            this.primaryExchange = instrument.primaryExchange
            this.description = instrument.description
            additionalProperties(instrument.additionalProperties)
        }

        fun symbols(symbols: List<Symbol>) = symbols(JsonField.of(symbols))

        @JsonProperty("symbols")
        @ExcludeMissing
        fun symbols(symbols: JsonField<List<Symbol>>) = apply { this.symbols = symbols }

        /** The asset class of the symbol. */
        fun assetClass(assetClass: AssetClass) = assetClass(JsonField.of(assetClass))

        /** The asset class of the symbol. */
        @JsonProperty("asset_class")
        @ExcludeMissing
        fun assetClass(assetClass: JsonField<AssetClass>) = apply { this.assetClass = assetClass }

        /** The primary exchange for the instrument. */
        fun primaryExchange(primaryExchange: String) =
            primaryExchange(JsonField.of(primaryExchange))

        /** The primary exchange for the instrument. */
        @JsonProperty("primary_exchange")
        @ExcludeMissing
        fun primaryExchange(primaryExchange: JsonField<String>) = apply {
            this.primaryExchange = primaryExchange
        }

        /** A description of the instrument. */
        fun description(description: String) = description(JsonField.of(description))

        /** A description of the instrument. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Instrument =
            Instrument(
                symbols.map { it.toUnmodifiable() },
                assetClass,
                primaryExchange,
                description,
                additionalProperties.toUnmodifiable(),
            )
    }

    class AssetClass
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AssetClass && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val OTHER = AssetClass(JsonField.of("other"))

            @JvmField val EQUITY = AssetClass(JsonField.of("equity"))

            @JvmField val OPTION = AssetClass(JsonField.of("option"))

            @JvmField val DEBT = AssetClass(JsonField.of("debt"))

            @JvmStatic fun of(value: String) = AssetClass(JsonField.of(value))
        }

        enum class Known {
            OTHER,
            EQUITY,
            OPTION,
            DEBT,
        }

        enum class Value {
            OTHER,
            EQUITY,
            OPTION,
            DEBT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OTHER -> Value.OTHER
                EQUITY -> Value.EQUITY
                OPTION -> Value.OPTION
                DEBT -> Value.DEBT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OTHER -> Known.OTHER
                EQUITY -> Known.EQUITY
                OPTION -> Known.OPTION
                DEBT -> Known.DEBT
                else -> throw StudioSdkInvalidDataException("Unknown AssetClass: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Symbol.Builder::class)
    @NoAutoDetect
    class Symbol
    private constructor(
        private val symbol: JsonField<String>,
        private val symbolFormat: JsonField<SymbolFormat>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun symbol(): Optional<String> = Optional.ofNullable(symbol.getNullable("symbol"))

        /** Denotes the format of the provided `symbol` field. */
        fun symbolFormat(): Optional<SymbolFormat> =
            Optional.ofNullable(symbolFormat.getNullable("symbol_format"))

        @JsonProperty("symbol") @ExcludeMissing fun _symbol() = symbol

        /** Denotes the format of the provided `symbol` field. */
        @JsonProperty("symbol_format") @ExcludeMissing fun _symbolFormat() = symbolFormat

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Symbol = apply {
            if (!validated) {
                symbol()
                symbolFormat()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Symbol &&
                this.symbol == other.symbol &&
                this.symbolFormat == other.symbolFormat &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        symbol,
                        symbolFormat,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Symbol{symbol=$symbol, symbolFormat=$symbolFormat, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var symbol: JsonField<String> = JsonMissing.of()
            private var symbolFormat: JsonField<SymbolFormat> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(symbol: Symbol) = apply {
                this.symbol = symbol.symbol
                this.symbolFormat = symbol.symbolFormat
                additionalProperties(symbol.additionalProperties)
            }

            fun symbol(symbol: String) = symbol(JsonField.of(symbol))

            @JsonProperty("symbol")
            @ExcludeMissing
            fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

            /** Denotes the format of the provided `symbol` field. */
            fun symbolFormat(symbolFormat: SymbolFormat) = symbolFormat(JsonField.of(symbolFormat))

            /** Denotes the format of the provided `symbol` field. */
            @JsonProperty("symbol_format")
            @ExcludeMissing
            fun symbolFormat(symbolFormat: JsonField<SymbolFormat>) = apply {
                this.symbolFormat = symbolFormat
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Symbol =
                Symbol(
                    symbol,
                    symbolFormat,
                    additionalProperties.toUnmodifiable(),
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
}
