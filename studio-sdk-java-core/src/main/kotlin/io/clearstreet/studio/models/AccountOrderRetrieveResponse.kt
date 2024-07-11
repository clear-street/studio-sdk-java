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

@JsonDeserialize(builder = AccountOrderRetrieveResponse.Builder::class)
@NoAutoDetect
class AccountOrderRetrieveResponse
private constructor(
    private val order: JsonField<Order>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun order(): Order = order.getRequired("order")

    @JsonProperty("order") @ExcludeMissing fun _order() = order

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountOrderRetrieveResponse = apply {
        if (!validated) {
            order().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountOrderRetrieveResponse &&
            this.order == other.order &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(order, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "AccountOrderRetrieveResponse{order=$order, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var order: JsonField<Order> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountOrderRetrieveResponse: AccountOrderRetrieveResponse) = apply {
            this.order = accountOrderRetrieveResponse.order
            additionalProperties(accountOrderRetrieveResponse.additionalProperties)
        }

        fun order(order: Order) = order(JsonField.of(order))

        @JsonProperty("order")
        @ExcludeMissing
        fun order(order: JsonField<Order>) = apply { this.order = order }

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

        fun build(): AccountOrderRetrieveResponse =
            AccountOrderRetrieveResponse(order, additionalProperties.toUnmodifiable())
    }
}
