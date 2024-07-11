// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.studio_sdk.api.core.JsonValue
import com.studio_sdk.api.core.NoAutoDetect
import com.studio_sdk.api.core.toUnmodifiable
import com.studio_sdk.api.models.*
import java.util.Objects
import java.util.Optional

class AccountOrderListParams
constructor(
    private val accountId: String,
    private val from: Long?,
    private val pageSize: Long?,
    private val pageToken: String?,
    private val to: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun from(): Optional<Long> = Optional.ofNullable(from)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun pageToken(): Optional<String> = Optional.ofNullable(pageToken)

    fun to(): Optional<Long> = Optional.ofNullable(to)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.from?.let { params.put("from", listOf(it.toString())) }
        this.pageSize?.let { params.put("page_size", listOf(it.toString())) }
        this.pageToken?.let { params.put("page_token", listOf(it.toString())) }
        this.to?.let { params.put("to", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountOrderListParams &&
            this.accountId == other.accountId &&
            this.from == other.from &&
            this.pageSize == other.pageSize &&
            this.pageToken == other.pageToken &&
            this.to == other.to &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            from,
            pageSize,
            pageToken,
            to,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountOrderListParams{accountId=$accountId, from=$from, pageSize=$pageSize, pageToken=$pageToken, to=$to, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var from: Long? = null
        private var pageSize: Long? = null
        private var pageToken: String? = null
        private var to: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountOrderListParams: AccountOrderListParams) = apply {
            this.accountId = accountOrderListParams.accountId
            this.from = accountOrderListParams.from
            this.pageSize = accountOrderListParams.pageSize
            this.pageToken = accountOrderListParams.pageToken
            this.to = accountOrderListParams.to
            additionalQueryParams(accountOrderListParams.additionalQueryParams)
            additionalHeaders(accountOrderListParams.additionalHeaders)
            additionalBodyProperties(accountOrderListParams.additionalBodyProperties)
        }

        /** Account ID for the account. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /**
         * Milliseconds since epoch timestamp. This will constrain the search for orders created
         * after this timestamp, inclusively. Timestamps for orders prior the current trading day
         * will be ignored.
         */
        fun from(from: Long) = apply { this.from = from }

        /** Number of orders to return per page. */
        fun pageSize(pageSize: Long) = apply { this.pageSize = pageSize }

        /** Cursor for the page to return. */
        fun pageToken(pageToken: String) = apply { this.pageToken = pageToken }

        /**
         * Milliseconds since epoch timestamp. This will constrain the search for orders created
         * before this timestamp, inclusively. Timestamps for orders beyond the current trading day
         * will be ignored.
         */
        fun to(to: Long) = apply { this.to = to }

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

        fun build(): AccountOrderListParams =
            AccountOrderListParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                from,
                pageSize,
                pageToken,
                to,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
