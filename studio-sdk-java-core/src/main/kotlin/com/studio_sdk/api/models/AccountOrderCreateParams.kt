// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.studio_sdk.api.core.Enum
import com.studio_sdk.api.core.ExcludeMissing
import com.studio_sdk.api.core.JsonField
import com.studio_sdk.api.core.JsonValue
import com.studio_sdk.api.core.NoAutoDetect
import com.studio_sdk.api.core.toUnmodifiable
import com.studio_sdk.api.errors.StudioSdkInvalidDataException
import com.studio_sdk.api.models.*
import java.util.Objects
import java.util.Optional

class AccountOrderCreateParams
constructor(
    private val accountId: String,
    private val orderType: OrderType,
    private val quantity: String,
    private val side: Side,
    private val strategyType: StrategyType,
    private val symbol: String,
    private val timeInForce: TimeInForce,
    private val locateBroker: String?,
    private val price: String?,
    private val referenceId: String?,
    private val symbolFormat: SymbolFormat?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun orderType(): OrderType = orderType

    fun quantity(): String = quantity

    fun side(): Side = side

    fun strategyType(): StrategyType = strategyType

    fun symbol(): String = symbol

    fun timeInForce(): TimeInForce = timeInForce

    fun locateBroker(): Optional<String> = Optional.ofNullable(locateBroker)

    fun price(): Optional<String> = Optional.ofNullable(price)

    fun referenceId(): Optional<String> = Optional.ofNullable(referenceId)

    fun symbolFormat(): Optional<SymbolFormat> = Optional.ofNullable(symbolFormat)

    @JvmSynthetic
    internal fun getBody(): AccountOrderCreateBody {
        return AccountOrderCreateBody(
            orderType,
            quantity,
            side,
            strategyType,
            symbol,
            timeInForce,
            locateBroker,
            price,
            referenceId,
            symbolFormat,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountOrderCreateBody.Builder::class)
    @NoAutoDetect
    class AccountOrderCreateBody
    internal constructor(
        private val orderType: OrderType?,
        private val quantity: String?,
        private val side: Side?,
        private val strategyType: StrategyType?,
        private val symbol: String?,
        private val timeInForce: TimeInForce?,
        private val locateBroker: String?,
        private val price: String?,
        private val referenceId: String?,
        private val symbolFormat: SymbolFormat?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The type of order, can be one of the following:
         * - `limit`: A limit order will execute at-or-better than the limit price you specify
         * - `market`: An order that will execute at the prevailing market prices
         */
        @JsonProperty("order_type") fun orderType(): OrderType? = orderType

        /** The maximum quantity to be executed. */
        @JsonProperty("quantity") fun quantity(): String? = quantity

        /** Buy, sell, sell-short indicator. */
        @JsonProperty("side") fun side(): Side? = side

        /**
         * Strategy type used for execution, can be one of below. Note, we use sensible defaults for
         * strategy parameters at the moment. In future, we will provide a way to provide specify
         * these parameters.
         * - `sor`: Smart order router
         * - `dark`: Dark pool
         * - `ap`: Arrival price
         * - `pov`: Percentage of volume
         * - `twap`: Time weighted average price
         * - `vwap`: Volume weighted average price
         *
         * For more information on these strategies, please refer to our
         * [documentation](https://docs.clearstreet.io/studio/docs/execution-strategies).
         */
        @JsonProperty("strategy_type") fun strategyType(): StrategyType? = strategyType

        /** The symbol this order is for. See `symbol_format` for supported symbol formats. */
        @JsonProperty("symbol") fun symbol(): String? = symbol

        /**
         * The lifecycle enforcement of this order.
         * - `day`: The order will exist for the duration of the current trading session
         * - `ioc`: The order will immediately be executed or cancelled
         * - `day-plus`: The order will exist only for the duration the current trading session plus
         *   extended hours, if applicable
         * - `at-open`: The order will exist only for the opening auction of the next session
         * - `at-close`: The order will exist only for the closing auction of the current session
         */
        @JsonProperty("time_in_force") fun timeInForce(): TimeInForce? = timeInForce

        /**
         * Name of the broker that provided you inventory for a short-sale. Required if `side` is
         * `sell-short`. If you procured inventory through us, you can use `CLST`.
         */
        @JsonProperty("locate_broker") fun locateBroker(): String? = locateBroker

        /** The price to execute at-or-better. */
        @JsonProperty("price") fun price(): String? = price

        /** An ID that you provide. */
        @JsonProperty("reference_id") fun referenceId(): String? = referenceId

        /** Denotes the format of the provided `symbol` field. */
        @JsonProperty("symbol_format") fun symbolFormat(): SymbolFormat? = symbolFormat

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountOrderCreateBody &&
                this.orderType == other.orderType &&
                this.quantity == other.quantity &&
                this.side == other.side &&
                this.strategyType == other.strategyType &&
                this.symbol == other.symbol &&
                this.timeInForce == other.timeInForce &&
                this.locateBroker == other.locateBroker &&
                this.price == other.price &&
                this.referenceId == other.referenceId &&
                this.symbolFormat == other.symbolFormat &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        orderType,
                        quantity,
                        side,
                        strategyType,
                        symbol,
                        timeInForce,
                        locateBroker,
                        price,
                        referenceId,
                        symbolFormat,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountOrderCreateBody{orderType=$orderType, quantity=$quantity, side=$side, strategyType=$strategyType, symbol=$symbol, timeInForce=$timeInForce, locateBroker=$locateBroker, price=$price, referenceId=$referenceId, symbolFormat=$symbolFormat, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var orderType: OrderType? = null
            private var quantity: String? = null
            private var side: Side? = null
            private var strategyType: StrategyType? = null
            private var symbol: String? = null
            private var timeInForce: TimeInForce? = null
            private var locateBroker: String? = null
            private var price: String? = null
            private var referenceId: String? = null
            private var symbolFormat: SymbolFormat? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountOrderCreateBody: AccountOrderCreateBody) = apply {
                this.orderType = accountOrderCreateBody.orderType
                this.quantity = accountOrderCreateBody.quantity
                this.side = accountOrderCreateBody.side
                this.strategyType = accountOrderCreateBody.strategyType
                this.symbol = accountOrderCreateBody.symbol
                this.timeInForce = accountOrderCreateBody.timeInForce
                this.locateBroker = accountOrderCreateBody.locateBroker
                this.price = accountOrderCreateBody.price
                this.referenceId = accountOrderCreateBody.referenceId
                this.symbolFormat = accountOrderCreateBody.symbolFormat
                additionalProperties(accountOrderCreateBody.additionalProperties)
            }

            /**
             * The type of order, can be one of the following:
             * - `limit`: A limit order will execute at-or-better than the limit price you specify
             * - `market`: An order that will execute at the prevailing market prices
             */
            @JsonProperty("order_type")
            fun orderType(orderType: OrderType) = apply { this.orderType = orderType }

            /** The maximum quantity to be executed. */
            @JsonProperty("quantity")
            fun quantity(quantity: String) = apply { this.quantity = quantity }

            /** Buy, sell, sell-short indicator. */
            @JsonProperty("side") fun side(side: Side) = apply { this.side = side }

            /**
             * Strategy type used for execution, can be one of below. Note, we use sensible defaults
             * for strategy parameters at the moment. In future, we will provide a way to provide
             * specify these parameters.
             * - `sor`: Smart order router
             * - `dark`: Dark pool
             * - `ap`: Arrival price
             * - `pov`: Percentage of volume
             * - `twap`: Time weighted average price
             * - `vwap`: Volume weighted average price
             *
             * For more information on these strategies, please refer to our
             * [documentation](https://docs.clearstreet.io/studio/docs/execution-strategies).
             */
            @JsonProperty("strategy_type")
            fun strategyType(strategyType: StrategyType) = apply {
                this.strategyType = strategyType
            }

            /** The symbol this order is for. See `symbol_format` for supported symbol formats. */
            @JsonProperty("symbol") fun symbol(symbol: String) = apply { this.symbol = symbol }

            /**
             * The lifecycle enforcement of this order.
             * - `day`: The order will exist for the duration of the current trading session
             * - `ioc`: The order will immediately be executed or cancelled
             * - `day-plus`: The order will exist only for the duration the current trading session
             *   plus extended hours, if applicable
             * - `at-open`: The order will exist only for the opening auction of the next session
             * - `at-close`: The order will exist only for the closing auction of the current
             *   session
             */
            @JsonProperty("time_in_force")
            fun timeInForce(timeInForce: TimeInForce) = apply { this.timeInForce = timeInForce }

            /**
             * Name of the broker that provided you inventory for a short-sale. Required if `side`
             * is `sell-short`. If you procured inventory through us, you can use `CLST`.
             */
            @JsonProperty("locate_broker")
            fun locateBroker(locateBroker: String) = apply { this.locateBroker = locateBroker }

            /** The price to execute at-or-better. */
            @JsonProperty("price") fun price(price: String) = apply { this.price = price }

            /** An ID that you provide. */
            @JsonProperty("reference_id")
            fun referenceId(referenceId: String) = apply { this.referenceId = referenceId }

            /** Denotes the format of the provided `symbol` field. */
            @JsonProperty("symbol_format")
            fun symbolFormat(symbolFormat: SymbolFormat) = apply {
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

            fun build(): AccountOrderCreateBody =
                AccountOrderCreateBody(
                    checkNotNull(orderType) { "`orderType` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    checkNotNull(side) { "`side` is required but was not set" },
                    checkNotNull(strategyType) { "`strategyType` is required but was not set" },
                    checkNotNull(symbol) { "`symbol` is required but was not set" },
                    checkNotNull(timeInForce) { "`timeInForce` is required but was not set" },
                    locateBroker,
                    price,
                    referenceId,
                    symbolFormat,
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

        return other is AccountOrderCreateParams &&
            this.accountId == other.accountId &&
            this.orderType == other.orderType &&
            this.quantity == other.quantity &&
            this.side == other.side &&
            this.strategyType == other.strategyType &&
            this.symbol == other.symbol &&
            this.timeInForce == other.timeInForce &&
            this.locateBroker == other.locateBroker &&
            this.price == other.price &&
            this.referenceId == other.referenceId &&
            this.symbolFormat == other.symbolFormat &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            orderType,
            quantity,
            side,
            strategyType,
            symbol,
            timeInForce,
            locateBroker,
            price,
            referenceId,
            symbolFormat,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountOrderCreateParams{accountId=$accountId, orderType=$orderType, quantity=$quantity, side=$side, strategyType=$strategyType, symbol=$symbol, timeInForce=$timeInForce, locateBroker=$locateBroker, price=$price, referenceId=$referenceId, symbolFormat=$symbolFormat, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var orderType: OrderType? = null
        private var quantity: String? = null
        private var side: Side? = null
        private var strategyType: StrategyType? = null
        private var symbol: String? = null
        private var timeInForce: TimeInForce? = null
        private var locateBroker: String? = null
        private var price: String? = null
        private var referenceId: String? = null
        private var symbolFormat: SymbolFormat? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountOrderCreateParams: AccountOrderCreateParams) = apply {
            this.accountId = accountOrderCreateParams.accountId
            this.orderType = accountOrderCreateParams.orderType
            this.quantity = accountOrderCreateParams.quantity
            this.side = accountOrderCreateParams.side
            this.strategyType = accountOrderCreateParams.strategyType
            this.symbol = accountOrderCreateParams.symbol
            this.timeInForce = accountOrderCreateParams.timeInForce
            this.locateBroker = accountOrderCreateParams.locateBroker
            this.price = accountOrderCreateParams.price
            this.referenceId = accountOrderCreateParams.referenceId
            this.symbolFormat = accountOrderCreateParams.symbolFormat
            additionalQueryParams(accountOrderCreateParams.additionalQueryParams)
            additionalHeaders(accountOrderCreateParams.additionalHeaders)
            additionalBodyProperties(accountOrderCreateParams.additionalBodyProperties)
        }

        /** Account ID for the account. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /**
         * The type of order, can be one of the following:
         * - `limit`: A limit order will execute at-or-better than the limit price you specify
         * - `market`: An order that will execute at the prevailing market prices
         */
        fun orderType(orderType: OrderType) = apply { this.orderType = orderType }

        /** The maximum quantity to be executed. */
        fun quantity(quantity: String) = apply { this.quantity = quantity }

        /** Buy, sell, sell-short indicator. */
        fun side(side: Side) = apply { this.side = side }

        /**
         * Strategy type used for execution, can be one of below. Note, we use sensible defaults for
         * strategy parameters at the moment. In future, we will provide a way to provide specify
         * these parameters.
         * - `sor`: Smart order router
         * - `dark`: Dark pool
         * - `ap`: Arrival price
         * - `pov`: Percentage of volume
         * - `twap`: Time weighted average price
         * - `vwap`: Volume weighted average price
         *
         * For more information on these strategies, please refer to our
         * [documentation](https://docs.clearstreet.io/studio/docs/execution-strategies).
         */
        fun strategyType(strategyType: StrategyType) = apply { this.strategyType = strategyType }

        /** The symbol this order is for. See `symbol_format` for supported symbol formats. */
        fun symbol(symbol: String) = apply { this.symbol = symbol }

        /**
         * The lifecycle enforcement of this order.
         * - `day`: The order will exist for the duration of the current trading session
         * - `ioc`: The order will immediately be executed or cancelled
         * - `day-plus`: The order will exist only for the duration the current trading session plus
         *   extended hours, if applicable
         * - `at-open`: The order will exist only for the opening auction of the next session
         * - `at-close`: The order will exist only for the closing auction of the current session
         */
        fun timeInForce(timeInForce: TimeInForce) = apply { this.timeInForce = timeInForce }

        /**
         * Name of the broker that provided you inventory for a short-sale. Required if `side` is
         * `sell-short`. If you procured inventory through us, you can use `CLST`.
         */
        fun locateBroker(locateBroker: String) = apply { this.locateBroker = locateBroker }

        /** The price to execute at-or-better. */
        fun price(price: String) = apply { this.price = price }

        /** An ID that you provide. */
        fun referenceId(referenceId: String) = apply { this.referenceId = referenceId }

        /** Denotes the format of the provided `symbol` field. */
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

        fun build(): AccountOrderCreateParams =
            AccountOrderCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(orderType) { "`orderType` is required but was not set" },
                checkNotNull(quantity) { "`quantity` is required but was not set" },
                checkNotNull(side) { "`side` is required but was not set" },
                checkNotNull(strategyType) { "`strategyType` is required but was not set" },
                checkNotNull(symbol) { "`symbol` is required but was not set" },
                checkNotNull(timeInForce) { "`timeInForce` is required but was not set" },
                locateBroker,
                price,
                referenceId,
                symbolFormat,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class OrderType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OrderType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val LIMIT = OrderType(JsonField.of("limit"))

            @JvmField val MARKET = OrderType(JsonField.of("market"))

            @JvmStatic fun of(value: String) = OrderType(JsonField.of(value))
        }

        enum class Known {
            LIMIT,
            MARKET,
        }

        enum class Value {
            LIMIT,
            MARKET,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LIMIT -> Value.LIMIT
                MARKET -> Value.MARKET
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LIMIT -> Known.LIMIT
                MARKET -> Known.MARKET
                else -> throw StudioSdkInvalidDataException("Unknown OrderType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            @JvmField val SELL_SHORT = Side(JsonField.of("sell-short"))

            @JvmStatic fun of(value: String) = Side(JsonField.of(value))
        }

        enum class Known {
            BUY,
            SELL,
            SELL_SHORT,
        }

        enum class Value {
            BUY,
            SELL,
            SELL_SHORT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUY -> Value.BUY
                SELL -> Value.SELL
                SELL_SHORT -> Value.SELL_SHORT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUY -> Known.BUY
                SELL -> Known.SELL
                SELL_SHORT -> Known.SELL_SHORT
                else -> throw StudioSdkInvalidDataException("Unknown Side: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class StrategyType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StrategyType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SOR = StrategyType(JsonField.of("sor"))

            @JvmField val DARK = StrategyType(JsonField.of("dark"))

            @JvmField val AP = StrategyType(JsonField.of("ap"))

            @JvmField val POV = StrategyType(JsonField.of("pov"))

            @JvmField val TWAP = StrategyType(JsonField.of("twap"))

            @JvmField val VWAP = StrategyType(JsonField.of("vwap"))

            @JvmStatic fun of(value: String) = StrategyType(JsonField.of(value))
        }

        enum class Known {
            SOR,
            DARK,
            AP,
            POV,
            TWAP,
            VWAP,
        }

        enum class Value {
            SOR,
            DARK,
            AP,
            POV,
            TWAP,
            VWAP,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SOR -> Value.SOR
                DARK -> Value.DARK
                AP -> Value.AP
                POV -> Value.POV
                TWAP -> Value.TWAP
                VWAP -> Value.VWAP
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SOR -> Known.SOR
                DARK -> Known.DARK
                AP -> Known.AP
                POV -> Known.POV
                TWAP -> Known.TWAP
                VWAP -> Known.VWAP
                else -> throw StudioSdkInvalidDataException("Unknown StrategyType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class TimeInForce
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TimeInForce && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DAY = TimeInForce(JsonField.of("day"))

            @JvmField val IOC = TimeInForce(JsonField.of("ioc"))

            @JvmField val DAY_PLUS = TimeInForce(JsonField.of("day-plus"))

            @JvmField val AT_OPEN = TimeInForce(JsonField.of("at-open"))

            @JvmField val AT_CLOSE = TimeInForce(JsonField.of("at-close"))

            @JvmStatic fun of(value: String) = TimeInForce(JsonField.of(value))
        }

        enum class Known {
            DAY,
            IOC,
            DAY_PLUS,
            AT_OPEN,
            AT_CLOSE,
        }

        enum class Value {
            DAY,
            IOC,
            DAY_PLUS,
            AT_OPEN,
            AT_CLOSE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DAY -> Value.DAY
                IOC -> Value.IOC
                DAY_PLUS -> Value.DAY_PLUS
                AT_OPEN -> Value.AT_OPEN
                AT_CLOSE -> Value.AT_CLOSE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DAY -> Known.DAY
                IOC -> Known.IOC
                DAY_PLUS -> Known.DAY_PLUS
                AT_OPEN -> Known.AT_OPEN
                AT_CLOSE -> Known.AT_CLOSE
                else -> throw StudioSdkInvalidDataException("Unknown TimeInForce: $value")
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
