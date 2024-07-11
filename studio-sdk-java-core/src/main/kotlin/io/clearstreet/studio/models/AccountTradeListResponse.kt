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

@JsonDeserialize(builder = AccountTradeListResponse.Builder::class)
@NoAutoDetect
class AccountTradeListResponse
private constructor(
    private val data: JsonField<List<Trade>>,
    private val nextPageToken: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Trade> = data.getRequired("data")

    /** Cursor for the next page of results. */
    fun nextPageToken(): Optional<String> =
        Optional.ofNullable(nextPageToken.getNullable("next_page_token"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    /** Cursor for the next page of results. */
    @JsonProperty("next_page_token") @ExcludeMissing fun _nextPageToken() = nextPageToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountTradeListResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPageToken()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountTradeListResponse &&
            this.data == other.data &&
            this.nextPageToken == other.nextPageToken &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    nextPageToken,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountTradeListResponse{data=$data, nextPageToken=$nextPageToken, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Trade>> = JsonMissing.of()
        private var nextPageToken: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountTradeListResponse: AccountTradeListResponse) = apply {
            this.data = accountTradeListResponse.data
            this.nextPageToken = accountTradeListResponse.nextPageToken
            additionalProperties(accountTradeListResponse.additionalProperties)
        }

        fun data(data: List<Trade>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Trade>>) = apply { this.data = data }

        /** Cursor for the next page of results. */
        fun nextPageToken(nextPageToken: String) = nextPageToken(JsonField.of(nextPageToken))

        /** Cursor for the next page of results. */
        @JsonProperty("next_page_token")
        @ExcludeMissing
        fun nextPageToken(nextPageToken: JsonField<String>) = apply {
            this.nextPageToken = nextPageToken
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

        fun build(): AccountTradeListResponse =
            AccountTradeListResponse(
                data.map { it.toUnmodifiable() },
                nextPageToken,
                additionalProperties.toUnmodifiable(),
            )
    }
}
