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

@JsonDeserialize(builder = AccountOrderDeleteResponse.Builder::class)
@NoAutoDetect
class AccountOrderDeleteResponse
private constructor(
    private val data: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Array of order IDs that were attempted to be cancelled. */
    fun data(): List<String> = data.getRequired("data")

    /** Array of order IDs that were attempted to be cancelled. */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountOrderDeleteResponse = apply {
        if (!validated) {
            data()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountOrderDeleteResponse &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(data, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "AccountOrderDeleteResponse{data=$data, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountOrderDeleteResponse: AccountOrderDeleteResponse) = apply {
            this.data = accountOrderDeleteResponse.data
            additionalProperties(accountOrderDeleteResponse.additionalProperties)
        }

        /** Array of order IDs that were attempted to be cancelled. */
        fun data(data: List<String>) = data(JsonField.of(data))

        /** Array of order IDs that were attempted to be cancelled. */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<String>>) = apply { this.data = data }

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

        fun build(): AccountOrderDeleteResponse =
            AccountOrderDeleteResponse(
                data.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }
}
