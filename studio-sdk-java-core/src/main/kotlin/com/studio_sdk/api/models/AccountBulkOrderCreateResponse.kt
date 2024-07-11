// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.studio_sdk.api.core.ExcludeMissing
import com.studio_sdk.api.core.JsonField
import com.studio_sdk.api.core.JsonMissing
import com.studio_sdk.api.core.JsonValue
import com.studio_sdk.api.core.NoAutoDetect
import com.studio_sdk.api.core.toUnmodifiable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AccountBulkOrderCreateResponse.Builder::class)
@NoAutoDetect
class AccountBulkOrderCreateResponse
private constructor(
    private val submitted: JsonField<Long>,
    private val rejected: JsonField<Long>,
    private val data: JsonField<List<Data>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Total number of orders submitted */
    fun submitted(): Long = submitted.getRequired("submitted")

    /** Total number of orders rejected */
    fun rejected(): Long = rejected.getRequired("rejected")

    /**
     * Array indicating whether each respective order was submitted or not. This array is guaranteed
     * to be sorted in the same order as the orders you provided in your request.
     */
    fun data(): List<Data> = data.getRequired("data")

    /** Total number of orders submitted */
    @JsonProperty("submitted") @ExcludeMissing fun _submitted() = submitted

    /** Total number of orders rejected */
    @JsonProperty("rejected") @ExcludeMissing fun _rejected() = rejected

    /**
     * Array indicating whether each respective order was submitted or not. This array is guaranteed
     * to be sorted in the same order as the orders you provided in your request.
     */
    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountBulkOrderCreateResponse = apply {
        if (!validated) {
            submitted()
            rejected()
            data().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountBulkOrderCreateResponse &&
            this.submitted == other.submitted &&
            this.rejected == other.rejected &&
            this.data == other.data &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    submitted,
                    rejected,
                    data,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountBulkOrderCreateResponse{submitted=$submitted, rejected=$rejected, data=$data, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var submitted: JsonField<Long> = JsonMissing.of()
        private var rejected: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountBulkOrderCreateResponse: AccountBulkOrderCreateResponse) = apply {
            this.submitted = accountBulkOrderCreateResponse.submitted
            this.rejected = accountBulkOrderCreateResponse.rejected
            this.data = accountBulkOrderCreateResponse.data
            additionalProperties(accountBulkOrderCreateResponse.additionalProperties)
        }

        /** Total number of orders submitted */
        fun submitted(submitted: Long) = submitted(JsonField.of(submitted))

        /** Total number of orders submitted */
        @JsonProperty("submitted")
        @ExcludeMissing
        fun submitted(submitted: JsonField<Long>) = apply { this.submitted = submitted }

        /** Total number of orders rejected */
        fun rejected(rejected: Long) = rejected(JsonField.of(rejected))

        /** Total number of orders rejected */
        @JsonProperty("rejected")
        @ExcludeMissing
        fun rejected(rejected: JsonField<Long>) = apply { this.rejected = rejected }

        /**
         * Array indicating whether each respective order was submitted or not. This array is
         * guaranteed to be sorted in the same order as the orders you provided in your request.
         */
        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Array indicating whether each respective order was submitted or not. This array is
         * guaranteed to be sorted in the same order as the orders you provided in your request.
         */
        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

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

        fun build(): AccountBulkOrderCreateResponse =
            AccountBulkOrderCreateResponse(
                submitted,
                rejected,
                data.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val submitted: JsonField<Boolean>,
        private val orderId: JsonField<String>,
        private val reason: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** True if the order was submitted successfully, false otherwise. */
        fun submitted(): Boolean = submitted.getRequired("submitted")

        /**
         * If the order was submitted, the order ID assigned to this order. Empty if the order was
         * rejected.
         */
        fun orderId(): Optional<String> = Optional.ofNullable(orderId.getNullable("order_id"))

        /** If the order rejected, the reason for rejection. Empty if the order was accepted. */
        fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

        /** True if the order was submitted successfully, false otherwise. */
        @JsonProperty("submitted") @ExcludeMissing fun _submitted() = submitted

        /**
         * If the order was submitted, the order ID assigned to this order. Empty if the order was
         * rejected.
         */
        @JsonProperty("order_id") @ExcludeMissing fun _orderId() = orderId

        /** If the order rejected, the reason for rejection. Empty if the order was accepted. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                submitted()
                orderId()
                reason()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.submitted == other.submitted &&
                this.orderId == other.orderId &&
                this.reason == other.reason &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        submitted,
                        orderId,
                        reason,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{submitted=$submitted, orderId=$orderId, reason=$reason, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var submitted: JsonField<Boolean> = JsonMissing.of()
            private var orderId: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.submitted = data.submitted
                this.orderId = data.orderId
                this.reason = data.reason
                additionalProperties(data.additionalProperties)
            }

            /** True if the order was submitted successfully, false otherwise. */
            fun submitted(submitted: Boolean) = submitted(JsonField.of(submitted))

            /** True if the order was submitted successfully, false otherwise. */
            @JsonProperty("submitted")
            @ExcludeMissing
            fun submitted(submitted: JsonField<Boolean>) = apply { this.submitted = submitted }

            /**
             * If the order was submitted, the order ID assigned to this order. Empty if the order
             * was rejected.
             */
            fun orderId(orderId: String) = orderId(JsonField.of(orderId))

            /**
             * If the order was submitted, the order ID assigned to this order. Empty if the order
             * was rejected.
             */
            @JsonProperty("order_id")
            @ExcludeMissing
            fun orderId(orderId: JsonField<String>) = apply { this.orderId = orderId }

            /** If the order rejected, the reason for rejection. Empty if the order was accepted. */
            fun reason(reason: String) = reason(JsonField.of(reason))

            /** If the order rejected, the reason for rejection. Empty if the order was accepted. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

            fun build(): Data =
                Data(
                    submitted,
                    orderId,
                    reason,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
