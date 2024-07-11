// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.clearstreet.studio.core.ExcludeMissing
import io.clearstreet.studio.core.JsonValue
import io.clearstreet.studio.core.NoAutoDetect
import io.clearstreet.studio.core.toUnmodifiable
import io.clearstreet.studio.models.*
import java.util.Objects
import java.util.Optional

class AccountLocateOrderCreateParams
constructor(
    private val accountId: String,
    private val mpid: String,
    private val quantity: String,
    private val referenceId: String,
    private val symbol: String,
    private val comments: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun mpid(): String = mpid

    fun quantity(): String = quantity

    fun referenceId(): String = referenceId

    fun symbol(): String = symbol

    fun comments(): Optional<String> = Optional.ofNullable(comments)

    @JvmSynthetic
    internal fun getBody(): AccountLocateOrderCreateBody {
        return AccountLocateOrderCreateBody(
            mpid,
            quantity,
            referenceId,
            symbol,
            comments,
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

    @JsonDeserialize(builder = AccountLocateOrderCreateBody.Builder::class)
    @NoAutoDetect
    class AccountLocateOrderCreateBody
    internal constructor(
        private val mpid: String?,
        private val quantity: String?,
        private val referenceId: String?,
        private val symbol: String?,
        private val comments: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The market participant where the locate will be sent. */
        @JsonProperty("mpid") fun mpid(): String? = mpid

        /** String representation of quantity. */
        @JsonProperty("quantity") fun quantity(): String? = quantity

        /** Your unique ID for this locate order. */
        @JsonProperty("reference_id") fun referenceId(): String? = referenceId

        @JsonProperty("symbol") fun symbol(): String? = symbol

        /** Any additional comments for the locate request. */
        @JsonProperty("comments") fun comments(): String? = comments

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountLocateOrderCreateBody &&
                this.mpid == other.mpid &&
                this.quantity == other.quantity &&
                this.referenceId == other.referenceId &&
                this.symbol == other.symbol &&
                this.comments == other.comments &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        mpid,
                        quantity,
                        referenceId,
                        symbol,
                        comments,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountLocateOrderCreateBody{mpid=$mpid, quantity=$quantity, referenceId=$referenceId, symbol=$symbol, comments=$comments, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var mpid: String? = null
            private var quantity: String? = null
            private var referenceId: String? = null
            private var symbol: String? = null
            private var comments: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountLocateOrderCreateBody: AccountLocateOrderCreateBody) = apply {
                this.mpid = accountLocateOrderCreateBody.mpid
                this.quantity = accountLocateOrderCreateBody.quantity
                this.referenceId = accountLocateOrderCreateBody.referenceId
                this.symbol = accountLocateOrderCreateBody.symbol
                this.comments = accountLocateOrderCreateBody.comments
                additionalProperties(accountLocateOrderCreateBody.additionalProperties)
            }

            /** The market participant where the locate will be sent. */
            @JsonProperty("mpid") fun mpid(mpid: String) = apply { this.mpid = mpid }

            /** String representation of quantity. */
            @JsonProperty("quantity")
            fun quantity(quantity: String) = apply { this.quantity = quantity }

            /** Your unique ID for this locate order. */
            @JsonProperty("reference_id")
            fun referenceId(referenceId: String) = apply { this.referenceId = referenceId }

            @JsonProperty("symbol") fun symbol(symbol: String) = apply { this.symbol = symbol }

            /** Any additional comments for the locate request. */
            @JsonProperty("comments")
            fun comments(comments: String) = apply { this.comments = comments }

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

            fun build(): AccountLocateOrderCreateBody =
                AccountLocateOrderCreateBody(
                    checkNotNull(mpid) { "`mpid` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    checkNotNull(referenceId) { "`referenceId` is required but was not set" },
                    checkNotNull(symbol) { "`symbol` is required but was not set" },
                    comments,
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

        return other is AccountLocateOrderCreateParams &&
            this.accountId == other.accountId &&
            this.mpid == other.mpid &&
            this.quantity == other.quantity &&
            this.referenceId == other.referenceId &&
            this.symbol == other.symbol &&
            this.comments == other.comments &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            mpid,
            quantity,
            referenceId,
            symbol,
            comments,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountLocateOrderCreateParams{accountId=$accountId, mpid=$mpid, quantity=$quantity, referenceId=$referenceId, symbol=$symbol, comments=$comments, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var mpid: String? = null
        private var quantity: String? = null
        private var referenceId: String? = null
        private var symbol: String? = null
        private var comments: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountLocateOrderCreateParams: AccountLocateOrderCreateParams) = apply {
            this.accountId = accountLocateOrderCreateParams.accountId
            this.mpid = accountLocateOrderCreateParams.mpid
            this.quantity = accountLocateOrderCreateParams.quantity
            this.referenceId = accountLocateOrderCreateParams.referenceId
            this.symbol = accountLocateOrderCreateParams.symbol
            this.comments = accountLocateOrderCreateParams.comments
            additionalQueryParams(accountLocateOrderCreateParams.additionalQueryParams)
            additionalHeaders(accountLocateOrderCreateParams.additionalHeaders)
            additionalBodyProperties(accountLocateOrderCreateParams.additionalBodyProperties)
        }

        /** Account ID for the account. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The market participant where the locate will be sent. */
        fun mpid(mpid: String) = apply { this.mpid = mpid }

        /** String representation of quantity. */
        fun quantity(quantity: String) = apply { this.quantity = quantity }

        /** Your unique ID for this locate order. */
        fun referenceId(referenceId: String) = apply { this.referenceId = referenceId }

        fun symbol(symbol: String) = apply { this.symbol = symbol }

        /** Any additional comments for the locate request. */
        fun comments(comments: String) = apply { this.comments = comments }

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

        fun build(): AccountLocateOrderCreateParams =
            AccountLocateOrderCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(mpid) { "`mpid` is required but was not set" },
                checkNotNull(quantity) { "`quantity` is required but was not set" },
                checkNotNull(referenceId) { "`referenceId` is required but was not set" },
                checkNotNull(symbol) { "`symbol` is required but was not set" },
                comments,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
