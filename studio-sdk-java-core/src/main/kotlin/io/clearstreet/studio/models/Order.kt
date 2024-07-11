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

@JsonDeserialize(builder = Order.Builder::class)
@NoAutoDetect
class Order
private constructor(
    private val createdAt: JsonField<Long>,
    private val updatedAt: JsonField<Long>,
    private val orderId: JsonField<String>,
    private val referenceId: JsonField<String>,
    private val version: JsonField<Long>,
    private val accountId: JsonField<String>,
    private val state: JsonField<State>,
    private val status: JsonField<Status>,
    private val symbol: JsonField<String>,
    private val orderType: JsonField<OrderType>,
    private val side: JsonField<Side>,
    private val quantity: JsonField<String>,
    private val price: JsonField<String>,
    private val timeInForce: JsonField<TimeInForce>,
    private val strategyType: JsonField<StrategyType>,
    private val averagePrice: JsonField<Double>,
    private val filledQuantity: JsonField<String>,
    private val orderUpdateReason: JsonField<OrderUpdateReason>,
    private val text: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** When the order was created in milliseconds since epoch. */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /** When the order was updated in milliseconds since epoch. */
    fun updatedAt(): Long = updatedAt.getRequired("updated_at")

    /** An internally generated unique ID for this order. */
    fun orderId(): String = orderId.getRequired("order_id")

    /** The ID you provided when creating this order. */
    fun referenceId(): Optional<String> =
        Optional.ofNullable(referenceId.getNullable("reference_id"))

    /**
     * A monotonically increasing number indicating the version of this order. A higher number
     * indicates a more recent version of the order.
     */
    fun version(): Long = version.getRequired("version")

    /** Account ID for the account. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * Simplified order state, which is inferred from `OrderStatus`. Makes it easier to determine
     * whether an order can be executed against.
     * - `open`: Order _can_ potentially be executed against.
     * - `rejected`: Order _cannot_ be executed against because it was rejected. This is a terminal
     *   state.
     * - `closed`: Order _cannot_ be executed against. This is a terminal state.
     */
    fun state(): State = state.getRequired("state")

    /**
     * Granular order status using
     * [standard values come FIX tag 39](https://www.fixtrading.org/online-specification/order-state-changes).
     */
    fun status(): Status = status.getRequired("status")

    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * The type of order, can be one of the following:
     * - `limit`: A limit order will execute at-or-better than the limit price you specify
     * - `market`: An order that will execute at the prevailing market prices
     */
    fun orderType(): OrderType = orderType.getRequired("order_type")

    /** Buy, sell, sell-short indicator. */
    fun side(): Side = side.getRequired("side")

    /** The requested quantity on this order. */
    fun quantity(): String = quantity.getRequired("quantity")

    /** The requsted limit price on this order. */
    fun price(): Optional<String> = Optional.ofNullable(price.getNullable("price"))

    /**
     * The lifecycle enforcement of this order.
     * - `day`: The order will exist for the duration of the current trading session
     * - `ioc`: The order will immediately be executed or cancelled
     * - `day-plus`: The order will exist only for the duration the current trading session plus
     *   extended hours, if applicable
     * - `at-open`: The order will exist only for the opening auction of the next session
     * - `at-close`: The order will exist only for the closing auction of the current session
     */
    fun timeInForce(): TimeInForce = timeInForce.getRequired("time_in_force")

    /**
     * Strategy type used for execution, can be one of below. Note, we use sensible defaults for
     * strategy parameters at the moment. In future, we will provide a way to provide specify these
     * parameters.
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
    fun strategyType(): StrategyType = strategyType.getRequired("strategy_type")

    /** Calculated average price of all fills on this order. */
    fun averagePrice(): Optional<Double> =
        Optional.ofNullable(averagePrice.getNullable("average_price"))

    /** The quantity that has been filled. */
    fun filledQuantity(): String = filledQuantity.getRequired("filled_quantity")

    /** The last reason why this order was updated */
    fun orderUpdateReason(): Optional<OrderUpdateReason> =
        Optional.ofNullable(orderUpdateReason.getNullable("order_update_reason"))

    /** Free form text typically contains reasons for a reject. */
    fun text(): Optional<String> = Optional.ofNullable(text.getNullable("text"))

    /** When the order was created in milliseconds since epoch. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** When the order was updated in milliseconds since epoch. */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** An internally generated unique ID for this order. */
    @JsonProperty("order_id") @ExcludeMissing fun _orderId() = orderId

    /** The ID you provided when creating this order. */
    @JsonProperty("reference_id") @ExcludeMissing fun _referenceId() = referenceId

    /**
     * A monotonically increasing number indicating the version of this order. A higher number
     * indicates a more recent version of the order.
     */
    @JsonProperty("version") @ExcludeMissing fun _version() = version

    /** Account ID for the account. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * Simplified order state, which is inferred from `OrderStatus`. Makes it easier to determine
     * whether an order can be executed against.
     * - `open`: Order _can_ potentially be executed against.
     * - `rejected`: Order _cannot_ be executed against because it was rejected. This is a terminal
     *   state.
     * - `closed`: Order _cannot_ be executed against. This is a terminal state.
     */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /**
     * Granular order status using
     * [standard values come FIX tag 39](https://www.fixtrading.org/online-specification/order-state-changes).
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("symbol") @ExcludeMissing fun _symbol() = symbol

    /**
     * The type of order, can be one of the following:
     * - `limit`: A limit order will execute at-or-better than the limit price you specify
     * - `market`: An order that will execute at the prevailing market prices
     */
    @JsonProperty("order_type") @ExcludeMissing fun _orderType() = orderType

    /** Buy, sell, sell-short indicator. */
    @JsonProperty("side") @ExcludeMissing fun _side() = side

    /** The requested quantity on this order. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /** The requsted limit price on this order. */
    @JsonProperty("price") @ExcludeMissing fun _price() = price

    /**
     * The lifecycle enforcement of this order.
     * - `day`: The order will exist for the duration of the current trading session
     * - `ioc`: The order will immediately be executed or cancelled
     * - `day-plus`: The order will exist only for the duration the current trading session plus
     *   extended hours, if applicable
     * - `at-open`: The order will exist only for the opening auction of the next session
     * - `at-close`: The order will exist only for the closing auction of the current session
     */
    @JsonProperty("time_in_force") @ExcludeMissing fun _timeInForce() = timeInForce

    /**
     * Strategy type used for execution, can be one of below. Note, we use sensible defaults for
     * strategy parameters at the moment. In future, we will provide a way to provide specify these
     * parameters.
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
    @JsonProperty("strategy_type") @ExcludeMissing fun _strategyType() = strategyType

    /** Calculated average price of all fills on this order. */
    @JsonProperty("average_price") @ExcludeMissing fun _averagePrice() = averagePrice

    /** The quantity that has been filled. */
    @JsonProperty("filled_quantity") @ExcludeMissing fun _filledQuantity() = filledQuantity

    /** The last reason why this order was updated */
    @JsonProperty("order_update_reason")
    @ExcludeMissing
    fun _orderUpdateReason() = orderUpdateReason

    /** Free form text typically contains reasons for a reject. */
    @JsonProperty("text") @ExcludeMissing fun _text() = text

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Order = apply {
        if (!validated) {
            createdAt()
            updatedAt()
            orderId()
            referenceId()
            version()
            accountId()
            state()
            status()
            symbol()
            orderType()
            side()
            quantity()
            price()
            timeInForce()
            strategyType()
            averagePrice()
            filledQuantity()
            orderUpdateReason()
            text()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Order &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.orderId == other.orderId &&
            this.referenceId == other.referenceId &&
            this.version == other.version &&
            this.accountId == other.accountId &&
            this.state == other.state &&
            this.status == other.status &&
            this.symbol == other.symbol &&
            this.orderType == other.orderType &&
            this.side == other.side &&
            this.quantity == other.quantity &&
            this.price == other.price &&
            this.timeInForce == other.timeInForce &&
            this.strategyType == other.strategyType &&
            this.averagePrice == other.averagePrice &&
            this.filledQuantity == other.filledQuantity &&
            this.orderUpdateReason == other.orderUpdateReason &&
            this.text == other.text &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    createdAt,
                    updatedAt,
                    orderId,
                    referenceId,
                    version,
                    accountId,
                    state,
                    status,
                    symbol,
                    orderType,
                    side,
                    quantity,
                    price,
                    timeInForce,
                    strategyType,
                    averagePrice,
                    filledQuantity,
                    orderUpdateReason,
                    text,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Order{createdAt=$createdAt, updatedAt=$updatedAt, orderId=$orderId, referenceId=$referenceId, version=$version, accountId=$accountId, state=$state, status=$status, symbol=$symbol, orderType=$orderType, side=$side, quantity=$quantity, price=$price, timeInForce=$timeInForce, strategyType=$strategyType, averagePrice=$averagePrice, filledQuantity=$filledQuantity, orderUpdateReason=$orderUpdateReason, text=$text, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<Long> = JsonMissing.of()
        private var orderId: JsonField<String> = JsonMissing.of()
        private var referenceId: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var orderType: JsonField<OrderType> = JsonMissing.of()
        private var side: JsonField<Side> = JsonMissing.of()
        private var quantity: JsonField<String> = JsonMissing.of()
        private var price: JsonField<String> = JsonMissing.of()
        private var timeInForce: JsonField<TimeInForce> = JsonMissing.of()
        private var strategyType: JsonField<StrategyType> = JsonMissing.of()
        private var averagePrice: JsonField<Double> = JsonMissing.of()
        private var filledQuantity: JsonField<String> = JsonMissing.of()
        private var orderUpdateReason: JsonField<OrderUpdateReason> = JsonMissing.of()
        private var text: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(order: Order) = apply {
            this.createdAt = order.createdAt
            this.updatedAt = order.updatedAt
            this.orderId = order.orderId
            this.referenceId = order.referenceId
            this.version = order.version
            this.accountId = order.accountId
            this.state = order.state
            this.status = order.status
            this.symbol = order.symbol
            this.orderType = order.orderType
            this.side = order.side
            this.quantity = order.quantity
            this.price = order.price
            this.timeInForce = order.timeInForce
            this.strategyType = order.strategyType
            this.averagePrice = order.averagePrice
            this.filledQuantity = order.filledQuantity
            this.orderUpdateReason = order.orderUpdateReason
            this.text = order.text
            additionalProperties(order.additionalProperties)
        }

        /** When the order was created in milliseconds since epoch. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /** When the order was created in milliseconds since epoch. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** When the order was updated in milliseconds since epoch. */
        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /** When the order was updated in milliseconds since epoch. */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

        /** An internally generated unique ID for this order. */
        fun orderId(orderId: String) = orderId(JsonField.of(orderId))

        /** An internally generated unique ID for this order. */
        @JsonProperty("order_id")
        @ExcludeMissing
        fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

        /** The ID you provided when creating this order. */
        fun referenceId(referenceId: String) = referenceId(JsonField.of(referenceId))

        /** The ID you provided when creating this order. */
        @JsonProperty("reference_id")
        @ExcludeMissing
        fun referenceId(referenceId: JsonField<String>) = apply { this.referenceId = referenceId }

        /**
         * A monotonically increasing number indicating the version of this order. A higher number
         * indicates a more recent version of the order.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * A monotonically increasing number indicating the version of this order. A higher number
         * indicates a more recent version of the order.
         */
        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<Long>) = apply { this.version = version }

        /** Account ID for the account. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** Account ID for the account. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * Simplified order state, which is inferred from `OrderStatus`. Makes it easier to
         * determine whether an order can be executed against.
         * - `open`: Order _can_ potentially be executed against.
         * - `rejected`: Order _cannot_ be executed against because it was rejected. This is a
         *   terminal state.
         * - `closed`: Order _cannot_ be executed against. This is a terminal state.
         */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Simplified order state, which is inferred from `OrderStatus`. Makes it easier to
         * determine whether an order can be executed against.
         * - `open`: Order _can_ potentially be executed against.
         * - `rejected`: Order _cannot_ be executed against because it was rejected. This is a
         *   terminal state.
         * - `closed`: Order _cannot_ be executed against. This is a terminal state.
         */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /**
         * Granular order status using
         * [standard values come FIX tag 39](https://www.fixtrading.org/online-specification/order-state-changes).
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Granular order status using
         * [standard values come FIX tag 39](https://www.fixtrading.org/online-specification/order-state-changes).
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        @JsonProperty("symbol")
        @ExcludeMissing
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /**
         * The type of order, can be one of the following:
         * - `limit`: A limit order will execute at-or-better than the limit price you specify
         * - `market`: An order that will execute at the prevailing market prices
         */
        fun orderType(orderType: OrderType) = orderType(JsonField.of(orderType))

        /**
         * The type of order, can be one of the following:
         * - `limit`: A limit order will execute at-or-better than the limit price you specify
         * - `market`: An order that will execute at the prevailing market prices
         */
        @JsonProperty("order_type")
        @ExcludeMissing
        fun orderType(orderType: JsonField<OrderType>) = apply { this.orderType = orderType }

        /** Buy, sell, sell-short indicator. */
        fun side(side: Side) = side(JsonField.of(side))

        /** Buy, sell, sell-short indicator. */
        @JsonProperty("side")
        @ExcludeMissing
        fun side(side: JsonField<Side>) = apply { this.side = side }

        /** The requested quantity on this order. */
        fun quantity(quantity: String) = quantity(JsonField.of(quantity))

        /** The requested quantity on this order. */
        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

        /** The requsted limit price on this order. */
        fun price(price: String) = price(JsonField.of(price))

        /** The requsted limit price on this order. */
        @JsonProperty("price")
        @ExcludeMissing
        fun price(price: JsonField<String>) = apply { this.price = price }

        /**
         * The lifecycle enforcement of this order.
         * - `day`: The order will exist for the duration of the current trading session
         * - `ioc`: The order will immediately be executed or cancelled
         * - `day-plus`: The order will exist only for the duration the current trading session plus
         *   extended hours, if applicable
         * - `at-open`: The order will exist only for the opening auction of the next session
         * - `at-close`: The order will exist only for the closing auction of the current session
         */
        fun timeInForce(timeInForce: TimeInForce) = timeInForce(JsonField.of(timeInForce))

        /**
         * The lifecycle enforcement of this order.
         * - `day`: The order will exist for the duration of the current trading session
         * - `ioc`: The order will immediately be executed or cancelled
         * - `day-plus`: The order will exist only for the duration the current trading session plus
         *   extended hours, if applicable
         * - `at-open`: The order will exist only for the opening auction of the next session
         * - `at-close`: The order will exist only for the closing auction of the current session
         */
        @JsonProperty("time_in_force")
        @ExcludeMissing
        fun timeInForce(timeInForce: JsonField<TimeInForce>) = apply {
            this.timeInForce = timeInForce
        }

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
        fun strategyType(strategyType: StrategyType) = strategyType(JsonField.of(strategyType))

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
        @JsonProperty("strategy_type")
        @ExcludeMissing
        fun strategyType(strategyType: JsonField<StrategyType>) = apply {
            this.strategyType = strategyType
        }

        /** Calculated average price of all fills on this order. */
        fun averagePrice(averagePrice: Double) = averagePrice(JsonField.of(averagePrice))

        /** Calculated average price of all fills on this order. */
        @JsonProperty("average_price")
        @ExcludeMissing
        fun averagePrice(averagePrice: JsonField<Double>) = apply {
            this.averagePrice = averagePrice
        }

        /** The quantity that has been filled. */
        fun filledQuantity(filledQuantity: String) = filledQuantity(JsonField.of(filledQuantity))

        /** The quantity that has been filled. */
        @JsonProperty("filled_quantity")
        @ExcludeMissing
        fun filledQuantity(filledQuantity: JsonField<String>) = apply {
            this.filledQuantity = filledQuantity
        }

        /** The last reason why this order was updated */
        fun orderUpdateReason(orderUpdateReason: OrderUpdateReason) =
            orderUpdateReason(JsonField.of(orderUpdateReason))

        /** The last reason why this order was updated */
        @JsonProperty("order_update_reason")
        @ExcludeMissing
        fun orderUpdateReason(orderUpdateReason: JsonField<OrderUpdateReason>) = apply {
            this.orderUpdateReason = orderUpdateReason
        }

        /** Free form text typically contains reasons for a reject. */
        fun text(text: String) = text(JsonField.of(text))

        /** Free form text typically contains reasons for a reject. */
        @JsonProperty("text")
        @ExcludeMissing
        fun text(text: JsonField<String>) = apply { this.text = text }

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
                createdAt,
                updatedAt,
                orderId,
                referenceId,
                version,
                accountId,
                state,
                status,
                symbol,
                orderType,
                side,
                quantity,
                price,
                timeInForce,
                strategyType,
                averagePrice,
                filledQuantity,
                orderUpdateReason,
                text,
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

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val OPEN = State(JsonField.of("open"))

            @JvmField val REJECTED = State(JsonField.of("rejected"))

            @JvmField val CLOSED = State(JsonField.of("closed"))

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            OPEN,
            REJECTED,
            CLOSED,
        }

        enum class Value {
            OPEN,
            REJECTED,
            CLOSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OPEN -> Value.OPEN
                REJECTED -> Value.REJECTED
                CLOSED -> Value.CLOSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OPEN -> Known.OPEN
                REJECTED -> Known.REJECTED
                CLOSED -> Known.CLOSED
                else -> throw StudioSdkInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val NEW = Status(JsonField.of("new"))

            @JvmField val PARTIALLY_FILLED = Status(JsonField.of("partially-filled"))

            @JvmField val FILLED = Status(JsonField.of("filled"))

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

            @JvmField val REPLACED = Status(JsonField.of("replaced"))

            @JvmField val PENDING_CANCEL = Status(JsonField.of("pending-cancel"))

            @JvmField val STOPPED = Status(JsonField.of("stopped"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmField val SUSPENDED = Status(JsonField.of("suspended"))

            @JvmField val PENDING_NEW = Status(JsonField.of("pending-new"))

            @JvmField val CALCULATED = Status(JsonField.of("calculated"))

            @JvmField val EXPIRED = Status(JsonField.of("expired"))

            @JvmField val ACCEPTED_FOR_BIDDING = Status(JsonField.of("accepted-for-bidding"))

            @JvmField val PENDING_REPLACE = Status(JsonField.of("pending-replace"))

            @JvmField val DONE_FOR_DAY = Status(JsonField.of("done-for-day"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            NEW,
            PARTIALLY_FILLED,
            FILLED,
            CANCELED,
            REPLACED,
            PENDING_CANCEL,
            STOPPED,
            REJECTED,
            SUSPENDED,
            PENDING_NEW,
            CALCULATED,
            EXPIRED,
            ACCEPTED_FOR_BIDDING,
            PENDING_REPLACE,
            DONE_FOR_DAY,
        }

        enum class Value {
            NEW,
            PARTIALLY_FILLED,
            FILLED,
            CANCELED,
            REPLACED,
            PENDING_CANCEL,
            STOPPED,
            REJECTED,
            SUSPENDED,
            PENDING_NEW,
            CALCULATED,
            EXPIRED,
            ACCEPTED_FOR_BIDDING,
            PENDING_REPLACE,
            DONE_FOR_DAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NEW -> Value.NEW
                PARTIALLY_FILLED -> Value.PARTIALLY_FILLED
                FILLED -> Value.FILLED
                CANCELED -> Value.CANCELED
                REPLACED -> Value.REPLACED
                PENDING_CANCEL -> Value.PENDING_CANCEL
                STOPPED -> Value.STOPPED
                REJECTED -> Value.REJECTED
                SUSPENDED -> Value.SUSPENDED
                PENDING_NEW -> Value.PENDING_NEW
                CALCULATED -> Value.CALCULATED
                EXPIRED -> Value.EXPIRED
                ACCEPTED_FOR_BIDDING -> Value.ACCEPTED_FOR_BIDDING
                PENDING_REPLACE -> Value.PENDING_REPLACE
                DONE_FOR_DAY -> Value.DONE_FOR_DAY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NEW -> Known.NEW
                PARTIALLY_FILLED -> Known.PARTIALLY_FILLED
                FILLED -> Known.FILLED
                CANCELED -> Known.CANCELED
                REPLACED -> Known.REPLACED
                PENDING_CANCEL -> Known.PENDING_CANCEL
                STOPPED -> Known.STOPPED
                REJECTED -> Known.REJECTED
                SUSPENDED -> Known.SUSPENDED
                PENDING_NEW -> Known.PENDING_NEW
                CALCULATED -> Known.CALCULATED
                EXPIRED -> Known.EXPIRED
                ACCEPTED_FOR_BIDDING -> Known.ACCEPTED_FOR_BIDDING
                PENDING_REPLACE -> Known.PENDING_REPLACE
                DONE_FOR_DAY -> Known.DONE_FOR_DAY
                else -> throw StudioSdkInvalidDataException("Unknown Status: $value")
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

    class OrderUpdateReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OrderUpdateReason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PLACE = OrderUpdateReason(JsonField.of("place"))

            @JvmField val MODIFY = OrderUpdateReason(JsonField.of("modify"))

            @JvmField val CANCEL = OrderUpdateReason(JsonField.of("cancel"))

            @JvmField val EXECUTION_REPORT = OrderUpdateReason(JsonField.of("execution-report"))

            @JvmField val CANCEL_REJECT = OrderUpdateReason(JsonField.of("cancel-reject"))

            @JvmStatic fun of(value: String) = OrderUpdateReason(JsonField.of(value))
        }

        enum class Known {
            PLACE,
            MODIFY,
            CANCEL,
            EXECUTION_REPORT,
            CANCEL_REJECT,
        }

        enum class Value {
            PLACE,
            MODIFY,
            CANCEL,
            EXECUTION_REPORT,
            CANCEL_REJECT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PLACE -> Value.PLACE
                MODIFY -> Value.MODIFY
                CANCEL -> Value.CANCEL
                EXECUTION_REPORT -> Value.EXECUTION_REPORT
                CANCEL_REJECT -> Value.CANCEL_REJECT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PLACE -> Known.PLACE
                MODIFY -> Known.MODIFY
                CANCEL -> Known.CANCEL
                EXECUTION_REPORT -> Known.EXECUTION_REPORT
                CANCEL_REJECT -> Known.CANCEL_REJECT
                else -> throw StudioSdkInvalidDataException("Unknown OrderUpdateReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
