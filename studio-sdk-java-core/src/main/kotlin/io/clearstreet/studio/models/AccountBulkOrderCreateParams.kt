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

class AccountBulkOrderCreateParams
constructor(
    private val accountId: String,
    private val orders: List<Order>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun orders(): List<Order> = orders

    @JvmSynthetic
    internal fun getBody(): AccountBulkOrderCreateBody {
        return AccountBulkOrderCreateBody(orders, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountBulkOrderCreateBody.Builder::class)
    @NoAutoDetect
    class AccountBulkOrderCreateBody
    internal constructor(
        private val orders: List<Order>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** An array of orders to create. */
        @JsonProperty("orders") fun orders(): List<Order>? = orders

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountBulkOrderCreateBody &&
                this.orders == other.orders &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(orders, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "AccountBulkOrderCreateBody{orders=$orders, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var orders: List<Order>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountBulkOrderCreateBody: AccountBulkOrderCreateBody) = apply {
                this.orders = accountBulkOrderCreateBody.orders
                additionalProperties(accountBulkOrderCreateBody.additionalProperties)
            }

            /** An array of orders to create. */
            @JsonProperty("orders") fun orders(orders: List<Order>) = apply { this.orders = orders }

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

            fun build(): AccountBulkOrderCreateBody =
                AccountBulkOrderCreateBody(
                    checkNotNull(orders) { "`orders` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
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

        return other is AccountBulkOrderCreateParams &&
            this.accountId == other.accountId &&
            this.orders == other.orders &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            orders,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountBulkOrderCreateParams{accountId=$accountId, orders=$orders, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var orders: MutableList<Order> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountBulkOrderCreateParams: AccountBulkOrderCreateParams) = apply {
            this.accountId = accountBulkOrderCreateParams.accountId
            this.orders(accountBulkOrderCreateParams.orders)
            additionalQueryParams(accountBulkOrderCreateParams.additionalQueryParams)
            additionalHeaders(accountBulkOrderCreateParams.additionalHeaders)
            additionalBodyProperties(accountBulkOrderCreateParams.additionalBodyProperties)
        }

        /** Account ID for the account. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** An array of orders to create. */
        fun orders(orders: List<Order>) = apply {
            this.orders.clear()
            this.orders.addAll(orders)
        }

        /** An array of orders to create. */
        fun addOrder(order: Order) = apply { this.orders.add(order) }

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

        fun build(): AccountBulkOrderCreateParams =
            AccountBulkOrderCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(orders) { "`orders` is required but was not set" }.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Order.Builder::class)
    @NoAutoDetect
    class Order
    private constructor(
        private val referenceId: String?,
        private val orderType: OrderType?,
        private val side: Side?,
        private val quantity: String?,
        private val price: String?,
        private val timeInForce: TimeInForce?,
        private val strategyType: StrategyType?,
        private val locateBroker: String?,
        private val symbol: String?,
        private val symbolFormat: SymbolFormat?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** An ID that you provide. */
        @JsonProperty("reference_id") fun referenceId(): String? = referenceId

        /**
         * The type of order, can be one of the following:
         * - `limit`: A limit order will execute at-or-better than the limit price you specify
         * - `market`: An order that will execute at the prevailing market prices
         */
        @JsonProperty("order_type") fun orderType(): OrderType? = orderType

        /** Buy, sell, sell-short indicator. */
        @JsonProperty("side") fun side(): Side? = side

        /** The maximum quantity to be executed. */
        @JsonProperty("quantity") fun quantity(): String? = quantity

        /** The price to execute at-or-better. */
        @JsonProperty("price") fun price(): String? = price

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

        /**
         * Name of the broker that provided you inventory for a short-sale. Required if `side` is
         * `sell-short`. If you procured inventory through us, you can use `CLST`.
         */
        @JsonProperty("locate_broker") fun locateBroker(): String? = locateBroker

        /** The symbol this order is for. See `symbol_format` for supported symbol formats. */
        @JsonProperty("symbol") fun symbol(): String? = symbol

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

            return other is Order &&
                this.referenceId == other.referenceId &&
                this.orderType == other.orderType &&
                this.side == other.side &&
                this.quantity == other.quantity &&
                this.price == other.price &&
                this.timeInForce == other.timeInForce &&
                this.strategyType == other.strategyType &&
                this.locateBroker == other.locateBroker &&
                this.symbol == other.symbol &&
                this.symbolFormat == other.symbolFormat &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        referenceId,
                        orderType,
                        side,
                        quantity,
                        price,
                        timeInForce,
                        strategyType,
                        locateBroker,
                        symbol,
                        symbolFormat,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Order{referenceId=$referenceId, orderType=$orderType, side=$side, quantity=$quantity, price=$price, timeInForce=$timeInForce, strategyType=$strategyType, locateBroker=$locateBroker, symbol=$symbol, symbolFormat=$symbolFormat, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var referenceId: String? = null
            private var orderType: OrderType? = null
            private var side: Side? = null
            private var quantity: String? = null
            private var price: String? = null
            private var timeInForce: TimeInForce? = null
            private var strategyType: StrategyType? = null
            private var locateBroker: String? = null
            private var symbol: String? = null
            private var symbolFormat: SymbolFormat? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(order: Order) = apply {
                this.referenceId = order.referenceId
                this.orderType = order.orderType
                this.side = order.side
                this.quantity = order.quantity
                this.price = order.price
                this.timeInForce = order.timeInForce
                this.strategyType = order.strategyType
                this.locateBroker = order.locateBroker
                this.symbol = order.symbol
                this.symbolFormat = order.symbolFormat
                additionalProperties(order.additionalProperties)
            }

            /** An ID that you provide. */
            @JsonProperty("reference_id")
            fun referenceId(referenceId: String) = apply { this.referenceId = referenceId }

            /**
             * The type of order, can be one of the following:
             * - `limit`: A limit order will execute at-or-better than the limit price you specify
             * - `market`: An order that will execute at the prevailing market prices
             */
            @JsonProperty("order_type")
            fun orderType(orderType: OrderType) = apply { this.orderType = orderType }

            /** Buy, sell, sell-short indicator. */
            @JsonProperty("side") fun side(side: Side) = apply { this.side = side }

            /** The maximum quantity to be executed. */
            @JsonProperty("quantity")
            fun quantity(quantity: String) = apply { this.quantity = quantity }

            /** The price to execute at-or-better. */
            @JsonProperty("price") fun price(price: String) = apply { this.price = price }

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

            /**
             * Name of the broker that provided you inventory for a short-sale. Required if `side`
             * is `sell-short`. If you procured inventory through us, you can use `CLST`.
             */
            @JsonProperty("locate_broker")
            fun locateBroker(locateBroker: String) = apply { this.locateBroker = locateBroker }

            /** The symbol this order is for. See `symbol_format` for supported symbol formats. */
            @JsonProperty("symbol") fun symbol(symbol: String) = apply { this.symbol = symbol }

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

            fun build(): Order =
                Order(
                    referenceId,
                    checkNotNull(orderType) { "`orderType` is required but was not set" },
                    checkNotNull(side) { "`side` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    price,
                    checkNotNull(timeInForce) { "`timeInForce` is required but was not set" },
                    checkNotNull(strategyType) { "`strategyType` is required but was not set" },
                    locateBroker,
                    checkNotNull(symbol) { "`symbol` is required but was not set" },
                    symbolFormat,
                    additionalProperties.toUnmodifiable(),
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
}
