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
import io.clearstreet.studio.core.JsonValue
import io.clearstreet.studio.core.NoAutoDetect
import io.clearstreet.studio.core.toUnmodifiable
import io.clearstreet.studio.errors.StudioSdkInvalidDataException
import io.clearstreet.studio.models.*
import java.util.Objects
import java.util.Optional

class EntityRegtMarginSimulationCreateParams
constructor(
    private val entityId: String,
    private val name: String,
    private val ignoreExisting: Boolean?,
    private val prices: List<Price>?,
    private val trades: List<Trade>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun entityId(): String = entityId

    fun name(): String = name

    fun ignoreExisting(): Optional<Boolean> = Optional.ofNullable(ignoreExisting)

    fun prices(): Optional<List<Price>> = Optional.ofNullable(prices)

    fun trades(): Optional<List<Trade>> = Optional.ofNullable(trades)

    @JvmSynthetic
    internal fun getBody(): EntityRegtMarginSimulationCreateBody {
        return EntityRegtMarginSimulationCreateBody(
            name,
            ignoreExisting,
            prices,
            trades,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> entityId
            else -> ""
        }
    }

    @JsonDeserialize(builder = EntityRegtMarginSimulationCreateBody.Builder::class)
    @NoAutoDetect
    class EntityRegtMarginSimulationCreateBody
    internal constructor(
        private val name: String?,
        private val ignoreExisting: Boolean?,
        private val prices: List<Price>?,
        private val trades: List<Trade>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** A name for this simulation for reference. */
        @JsonProperty("name") fun name(): String? = name

        /**
         * If true, the simulation will ignore any existing positions and balances in the account.
         * Set to true if you want to simulate from a clean slate, i.e. an empty account.
         */
        @JsonProperty("ignore_existing") fun ignoreExisting(): Boolean? = ignoreExisting

        /**
         * List of prices to use in the simulation, i.e. fair-market-values you specify for each
         * symbol. If this is not provided, current market prices will be used, if they are
         * available.
         */
        @JsonProperty("prices") fun prices(): List<Price>? = prices

        /** List of hypothetical trades to include in the simulation, if any. */
        @JsonProperty("trades") fun trades(): List<Trade>? = trades

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EntityRegtMarginSimulationCreateBody &&
                this.name == other.name &&
                this.ignoreExisting == other.ignoreExisting &&
                this.prices == other.prices &&
                this.trades == other.trades &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        ignoreExisting,
                        prices,
                        trades,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "EntityRegtMarginSimulationCreateBody{name=$name, ignoreExisting=$ignoreExisting, prices=$prices, trades=$trades, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var ignoreExisting: Boolean? = null
            private var prices: List<Price>? = null
            private var trades: List<Trade>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                entityRegtMarginSimulationCreateBody: EntityRegtMarginSimulationCreateBody
            ) = apply {
                this.name = entityRegtMarginSimulationCreateBody.name
                this.ignoreExisting = entityRegtMarginSimulationCreateBody.ignoreExisting
                this.prices = entityRegtMarginSimulationCreateBody.prices
                this.trades = entityRegtMarginSimulationCreateBody.trades
                additionalProperties(entityRegtMarginSimulationCreateBody.additionalProperties)
            }

            /** A name for this simulation for reference. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * If true, the simulation will ignore any existing positions and balances in the
             * account. Set to true if you want to simulate from a clean slate, i.e. an empty
             * account.
             */
            @JsonProperty("ignore_existing")
            fun ignoreExisting(ignoreExisting: Boolean) = apply {
                this.ignoreExisting = ignoreExisting
            }

            /**
             * List of prices to use in the simulation, i.e. fair-market-values you specify for each
             * symbol. If this is not provided, current market prices will be used, if they are
             * available.
             */
            @JsonProperty("prices") fun prices(prices: List<Price>) = apply { this.prices = prices }

            /** List of hypothetical trades to include in the simulation, if any. */
            @JsonProperty("trades") fun trades(trades: List<Trade>) = apply { this.trades = trades }

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

            fun build(): EntityRegtMarginSimulationCreateBody =
                EntityRegtMarginSimulationCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    ignoreExisting,
                    prices?.toUnmodifiable(),
                    trades?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityRegtMarginSimulationCreateParams &&
            this.entityId == other.entityId &&
            this.name == other.name &&
            this.ignoreExisting == other.ignoreExisting &&
            this.prices == other.prices &&
            this.trades == other.trades &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            entityId,
            name,
            ignoreExisting,
            prices,
            trades,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EntityRegtMarginSimulationCreateParams{entityId=$entityId, name=$name, ignoreExisting=$ignoreExisting, prices=$prices, trades=$trades, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var entityId: String? = null
        private var name: String? = null
        private var ignoreExisting: Boolean? = null
        private var prices: MutableList<Price> = mutableListOf()
        private var trades: MutableList<Trade> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            entityRegtMarginSimulationCreateParams: EntityRegtMarginSimulationCreateParams
        ) = apply {
            this.entityId = entityRegtMarginSimulationCreateParams.entityId
            this.name = entityRegtMarginSimulationCreateParams.name
            this.ignoreExisting = entityRegtMarginSimulationCreateParams.ignoreExisting
            this.prices(entityRegtMarginSimulationCreateParams.prices ?: listOf())
            this.trades(entityRegtMarginSimulationCreateParams.trades ?: listOf())
            additionalQueryParams(entityRegtMarginSimulationCreateParams.additionalQueryParams)
            additionalHeaders(entityRegtMarginSimulationCreateParams.additionalHeaders)
            additionalBodyProperties(
                entityRegtMarginSimulationCreateParams.additionalBodyProperties
            )
        }

        /** Entity ID for the legal entity. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /** A name for this simulation for reference. */
        fun name(name: String) = apply { this.name = name }

        /**
         * If true, the simulation will ignore any existing positions and balances in the account.
         * Set to true if you want to simulate from a clean slate, i.e. an empty account.
         */
        fun ignoreExisting(ignoreExisting: Boolean) = apply { this.ignoreExisting = ignoreExisting }

        /**
         * List of prices to use in the simulation, i.e. fair-market-values you specify for each
         * symbol. If this is not provided, current market prices will be used, if they are
         * available.
         */
        fun prices(prices: List<Price>) = apply {
            this.prices.clear()
            this.prices.addAll(prices)
        }

        /**
         * List of prices to use in the simulation, i.e. fair-market-values you specify for each
         * symbol. If this is not provided, current market prices will be used, if they are
         * available.
         */
        fun addPrice(price: Price) = apply { this.prices.add(price) }

        /** List of hypothetical trades to include in the simulation, if any. */
        fun trades(trades: List<Trade>) = apply {
            this.trades.clear()
            this.trades.addAll(trades)
        }

        /** List of hypothetical trades to include in the simulation, if any. */
        fun addTrade(trade: Trade) = apply { this.trades.add(trade) }

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

        fun build(): EntityRegtMarginSimulationCreateParams =
            EntityRegtMarginSimulationCreateParams(
                checkNotNull(entityId) { "`entityId` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                ignoreExisting,
                if (prices.size == 0) null else prices.toUnmodifiable(),
                if (trades.size == 0) null else trades.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Price.Builder::class)
    @NoAutoDetect
    class Price
    private constructor(
        private val symbol: String?,
        private val symbolFormat: SymbolFormat?,
        private val price: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The symbol for the instrument. */
        @JsonProperty("symbol") fun symbol(): String? = symbol

        /** Denotes the format of the provided `symbol` field. */
        @JsonProperty("symbol_format") fun symbolFormat(): SymbolFormat? = symbolFormat

        /** The price to use in the simulation. */
        @JsonProperty("price") fun price(): String? = price

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Price &&
                this.symbol == other.symbol &&
                this.symbolFormat == other.symbolFormat &&
                this.price == other.price &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        symbol,
                        symbolFormat,
                        price,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Price{symbol=$symbol, symbolFormat=$symbolFormat, price=$price, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var symbol: String? = null
            private var symbolFormat: SymbolFormat? = null
            private var price: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(price: Price) = apply {
                this.symbol = price.symbol
                this.symbolFormat = price.symbolFormat
                this.price = price.price
                additionalProperties(price.additionalProperties)
            }

            /** The symbol for the instrument. */
            @JsonProperty("symbol") fun symbol(symbol: String) = apply { this.symbol = symbol }

            /** Denotes the format of the provided `symbol` field. */
            @JsonProperty("symbol_format")
            fun symbolFormat(symbolFormat: SymbolFormat) = apply {
                this.symbolFormat = symbolFormat
            }

            /** The price to use in the simulation. */
            @JsonProperty("price") fun price(price: String) = apply { this.price = price }

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

            fun build(): Price =
                Price(
                    checkNotNull(symbol) { "`symbol` is required but was not set" },
                    symbolFormat,
                    checkNotNull(price) { "`price` is required but was not set" },
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

    @JsonDeserialize(builder = Trade.Builder::class)
    @NoAutoDetect
    class Trade
    private constructor(
        private val symbol: String?,
        private val symbolFormat: SymbolFormat?,
        private val side: Side?,
        private val quantity: String?,
        private val price: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The symbol for the instrument. */
        @JsonProperty("symbol") fun symbol(): String? = symbol

        /** Denotes the format of the provided `symbol` field. */
        @JsonProperty("symbol_format") fun symbolFormat(): SymbolFormat? = symbolFormat

        /** The side of the simulated trade. */
        @JsonProperty("side") fun side(): Side? = side

        /** The quantity of the simulated trade. */
        @JsonProperty("quantity") fun quantity(): String? = quantity

        /** The price of the simulated trade. */
        @JsonProperty("price") fun price(): String? = price

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Trade &&
                this.symbol == other.symbol &&
                this.symbolFormat == other.symbolFormat &&
                this.side == other.side &&
                this.quantity == other.quantity &&
                this.price == other.price &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        symbol,
                        symbolFormat,
                        side,
                        quantity,
                        price,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Trade{symbol=$symbol, symbolFormat=$symbolFormat, side=$side, quantity=$quantity, price=$price, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var symbol: String? = null
            private var symbolFormat: SymbolFormat? = null
            private var side: Side? = null
            private var quantity: String? = null
            private var price: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trade: Trade) = apply {
                this.symbol = trade.symbol
                this.symbolFormat = trade.symbolFormat
                this.side = trade.side
                this.quantity = trade.quantity
                this.price = trade.price
                additionalProperties(trade.additionalProperties)
            }

            /** The symbol for the instrument. */
            @JsonProperty("symbol") fun symbol(symbol: String) = apply { this.symbol = symbol }

            /** Denotes the format of the provided `symbol` field. */
            @JsonProperty("symbol_format")
            fun symbolFormat(symbolFormat: SymbolFormat) = apply {
                this.symbolFormat = symbolFormat
            }

            /** The side of the simulated trade. */
            @JsonProperty("side") fun side(side: Side) = apply { this.side = side }

            /** The quantity of the simulated trade. */
            @JsonProperty("quantity")
            fun quantity(quantity: String) = apply { this.quantity = quantity }

            /** The price of the simulated trade. */
            @JsonProperty("price") fun price(price: String) = apply { this.price = price }

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

            fun build(): Trade =
                Trade(
                    checkNotNull(symbol) { "`symbol` is required but was not set" },
                    symbolFormat,
                    checkNotNull(side) { "`side` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    checkNotNull(price) { "`price` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Side
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Side && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val BUY = Side(JsonField.of("buy"))

                @JvmField val SELL = Side(JsonField.of("sell"))

                @JvmStatic fun of(value: String) = Side(JsonField.of(value))
            }

            enum class Known {
                BUY,
                SELL,
            }

            enum class Value {
                BUY,
                SELL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BUY -> Value.BUY
                    SELL -> Value.SELL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BUY -> Known.BUY
                    SELL -> Known.SELL
                    else -> throw StudioSdkInvalidDataException("Unknown Side: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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
