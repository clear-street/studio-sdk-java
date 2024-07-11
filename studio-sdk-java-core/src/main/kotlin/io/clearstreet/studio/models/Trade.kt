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

@JsonDeserialize(builder = Trade.Builder::class)
@NoAutoDetect
class Trade
private constructor(
    private val createdAt: JsonField<Long>,
    private val accountId: JsonField<String>,
    private val tradeId: JsonField<String>,
    private val orderId: JsonField<String>,
    private val symbol: JsonField<String>,
    private val side: JsonField<Side>,
    private val quantity: JsonField<String>,
    private val price: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** When this trade happened in milliseconds since epoch. */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /** Account ID for the account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("account_id"))

    /** Unique trade ID assigned by us. */
    fun tradeId(): String = tradeId.getRequired("trade_id")

    /** The order ID of the order this trade occurred on. */
    fun orderId(): String = orderId.getRequired("order_id")

    /** The symbol this trade was for. */
    fun symbol(): Optional<String> = Optional.ofNullable(symbol.getNullable("symbol"))

    /** The side this trade occurred on. */
    fun side(): Side = side.getRequired("side")

    /** The amount that was traded. */
    fun quantity(): String = quantity.getRequired("quantity")

    /** The traded price. */
    fun price(): String = price.getRequired("price")

    /** When this trade happened in milliseconds since epoch. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** Account ID for the account. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** Unique trade ID assigned by us. */
    @JsonProperty("trade_id") @ExcludeMissing fun _tradeId() = tradeId

    /** The order ID of the order this trade occurred on. */
    @JsonProperty("order_id") @ExcludeMissing fun _orderId() = orderId

    /** The symbol this trade was for. */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol() = symbol

    /** The side this trade occurred on. */
    @JsonProperty("side") @ExcludeMissing fun _side() = side

    /** The amount that was traded. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /** The traded price. */
    @JsonProperty("price") @ExcludeMissing fun _price() = price

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Trade = apply {
        if (!validated) {
            createdAt()
            accountId()
            tradeId()
            orderId()
            symbol()
            side()
            quantity()
            price()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Trade &&
            this.createdAt == other.createdAt &&
            this.accountId == other.accountId &&
            this.tradeId == other.tradeId &&
            this.orderId == other.orderId &&
            this.symbol == other.symbol &&
            this.side == other.side &&
            this.quantity == other.quantity &&
            this.price == other.price &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    createdAt,
                    accountId,
                    tradeId,
                    orderId,
                    symbol,
                    side,
                    quantity,
                    price,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Trade{createdAt=$createdAt, accountId=$accountId, tradeId=$tradeId, orderId=$orderId, symbol=$symbol, side=$side, quantity=$quantity, price=$price, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var tradeId: JsonField<String> = JsonMissing.of()
        private var orderId: JsonField<String> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var side: JsonField<Side> = JsonMissing.of()
        private var quantity: JsonField<String> = JsonMissing.of()
        private var price: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(trade: Trade) = apply {
            this.createdAt = trade.createdAt
            this.accountId = trade.accountId
            this.tradeId = trade.tradeId
            this.orderId = trade.orderId
            this.symbol = trade.symbol
            this.side = trade.side
            this.quantity = trade.quantity
            this.price = trade.price
            additionalProperties(trade.additionalProperties)
        }

        /** When this trade happened in milliseconds since epoch. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /** When this trade happened in milliseconds since epoch. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** Account ID for the account. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** Account ID for the account. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** Unique trade ID assigned by us. */
        fun tradeId(tradeId: String) = tradeId(JsonField.of(tradeId))

        /** Unique trade ID assigned by us. */
        @JsonProperty("trade_id")
        @ExcludeMissing
        fun tradeId(tradeId: JsonField<String>) = apply { this.tradeId = tradeId }

        /** The order ID of the order this trade occurred on. */
        fun orderId(orderId: String) = orderId(JsonField.of(orderId))

        /** The order ID of the order this trade occurred on. */
        @JsonProperty("order_id")
        @ExcludeMissing
        fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

        /** The symbol this trade was for. */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /** The symbol this trade was for. */
        @JsonProperty("symbol")
        @ExcludeMissing
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** The side this trade occurred on. */
        fun side(side: Side) = side(JsonField.of(side))

        /** The side this trade occurred on. */
        @JsonProperty("side")
        @ExcludeMissing
        fun side(side: JsonField<Side>) = apply { this.side = side }

        /** The amount that was traded. */
        fun quantity(quantity: String) = quantity(JsonField.of(quantity))

        /** The amount that was traded. */
        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

        /** The traded price. */
        fun price(price: String) = price(JsonField.of(price))

        /** The traded price. */
        @JsonProperty("price")
        @ExcludeMissing
        fun price(price: JsonField<String>) = apply { this.price = price }

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
                createdAt,
                accountId,
                tradeId,
                orderId,
                symbol,
                side,
                quantity,
                price,
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
}
