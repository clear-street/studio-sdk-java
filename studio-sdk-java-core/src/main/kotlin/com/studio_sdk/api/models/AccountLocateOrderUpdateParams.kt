// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.studio_sdk.api.core.ExcludeMissing
import com.studio_sdk.api.core.JsonValue
import com.studio_sdk.api.core.NoAutoDetect
import com.studio_sdk.api.core.toUnmodifiable
import com.studio_sdk.api.models.*
import java.util.Objects

class AccountLocateOrderUpdateParams
constructor(
    private val accountId: String,
    private val locateOrderId: String,
    private val accept: Boolean,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun locateOrderId(): String = locateOrderId

    fun accept(): Boolean = accept

    @JvmSynthetic
    internal fun getBody(): AccountLocateOrderUpdateBody {
        return AccountLocateOrderUpdateBody(accept, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountId
            1 -> locateOrderId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountLocateOrderUpdateBody.Builder::class)
    @NoAutoDetect
    class AccountLocateOrderUpdateBody
    internal constructor(
        private val accept: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Accept or decline the locate order. */
        @JsonProperty("accept") fun accept(): Boolean? = accept

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountLocateOrderUpdateBody &&
                this.accept == other.accept &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(accept, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "AccountLocateOrderUpdateBody{accept=$accept, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accept: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountLocateOrderUpdateBody: AccountLocateOrderUpdateBody) = apply {
                this.accept = accountLocateOrderUpdateBody.accept
                additionalProperties(accountLocateOrderUpdateBody.additionalProperties)
            }

            /** Accept or decline the locate order. */
            @JsonProperty("accept") fun accept(accept: Boolean) = apply { this.accept = accept }

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

            fun build(): AccountLocateOrderUpdateBody =
                AccountLocateOrderUpdateBody(
                    checkNotNull(accept) { "`accept` is required but was not set" },
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

        return other is AccountLocateOrderUpdateParams &&
            this.accountId == other.accountId &&
            this.locateOrderId == other.locateOrderId &&
            this.accept == other.accept &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            locateOrderId,
            accept,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountLocateOrderUpdateParams{accountId=$accountId, locateOrderId=$locateOrderId, accept=$accept, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var locateOrderId: String? = null
        private var accept: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountLocateOrderUpdateParams: AccountLocateOrderUpdateParams) = apply {
            this.accountId = accountLocateOrderUpdateParams.accountId
            this.locateOrderId = accountLocateOrderUpdateParams.locateOrderId
            this.accept = accountLocateOrderUpdateParams.accept
            additionalQueryParams(accountLocateOrderUpdateParams.additionalQueryParams)
            additionalHeaders(accountLocateOrderUpdateParams.additionalHeaders)
            additionalBodyProperties(accountLocateOrderUpdateParams.additionalBodyProperties)
        }

        /** Account ID for the account. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** Unique locate ID assigned by us. */
        fun locateOrderId(locateOrderId: String) = apply { this.locateOrderId = locateOrderId }

        /** Accept or decline the locate order. */
        fun accept(accept: Boolean) = apply { this.accept = accept }

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

        fun build(): AccountLocateOrderUpdateParams =
            AccountLocateOrderUpdateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(locateOrderId) { "`locateOrderId` is required but was not set" },
                checkNotNull(accept) { "`accept` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
