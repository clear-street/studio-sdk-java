// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.clearstreet.studio.core.ExcludeMissing
import io.clearstreet.studio.core.JsonField
import io.clearstreet.studio.core.JsonMissing
import io.clearstreet.studio.core.JsonValue
import io.clearstreet.studio.core.NoAutoDetect
import io.clearstreet.studio.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Position.Builder::class)
@NoAutoDetect
class Position
private constructor(
    private val accountId: JsonField<String>,
    private val symbol: JsonField<String>,
    private val quantity: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Account ID for the account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("account_id"))

    fun symbol(): Optional<String> = Optional.ofNullable(symbol.getNullable("symbol"))

    /** String representation of quantity. */
    fun quantity(): Optional<String> = Optional.ofNullable(quantity.getNullable("quantity"))

    /** Account ID for the account. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("symbol") @ExcludeMissing fun _symbol() = symbol

    /** String representation of quantity. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Position = apply {
        if (!validated) {
            accountId()
            symbol()
            quantity()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Position &&
            this.accountId == other.accountId &&
            this.symbol == other.symbol &&
            this.quantity == other.quantity &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    symbol,
                    quantity,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Position{accountId=$accountId, symbol=$symbol, quantity=$quantity, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var quantity: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(position: Position) = apply {
            this.accountId = position.accountId
            this.symbol = position.symbol
            this.quantity = position.quantity
            additionalProperties(position.additionalProperties)
        }

        /** Account ID for the account. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** Account ID for the account. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        @JsonProperty("symbol")
        @ExcludeMissing
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** String representation of quantity. */
        fun quantity(quantity: String) = quantity(JsonField.of(quantity))

        /** String representation of quantity. */
        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

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

        fun build(): Position =
            Position(
                accountId,
                symbol,
                quantity,
                additionalProperties.toUnmodifiable(),
            )
    }
}
