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

@JsonDeserialize(builder = AccountOrderCreateResponse.Builder::class)
@NoAutoDetect
class AccountOrderCreateResponse
private constructor(
    private val orderId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** An internally generated unique ID for this order. */
    fun orderId(): String = orderId.getRequired("order_id")

    /** An internally generated unique ID for this order. */
    @JsonProperty("order_id") @ExcludeMissing fun _orderId() = orderId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountOrderCreateResponse = apply {
        if (!validated) {
            orderId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountOrderCreateResponse &&
            this.orderId == other.orderId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(orderId, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "AccountOrderCreateResponse{orderId=$orderId, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var orderId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountOrderCreateResponse: AccountOrderCreateResponse) = apply {
            this.orderId = accountOrderCreateResponse.orderId
            additionalProperties(accountOrderCreateResponse.additionalProperties)
        }

        /** An internally generated unique ID for this order. */
        fun orderId(orderId: String) = orderId(JsonField.of(orderId))

        /** An internally generated unique ID for this order. */
        @JsonProperty("order_id")
        @ExcludeMissing
        fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

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

        fun build(): AccountOrderCreateResponse =
            AccountOrderCreateResponse(orderId, additionalProperties.toUnmodifiable())
    }
}
