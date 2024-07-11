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

@JsonDeserialize(builder = LocateOrder.Builder::class)
@NoAutoDetect
class LocateOrder
private constructor(
    private val locateOrderId: JsonField<String>,
    private val requestedAt: JsonField<Long>,
    private val updatedAt: JsonField<Long>,
    private val mpid: JsonField<String>,
    private val accountId: JsonField<String>,
    private val symbol: JsonField<String>,
    private val status: JsonField<Status>,
    private val requestedQuantity: JsonField<String>,
    private val locateId: JsonField<String>,
    private val locatedAt: JsonField<Long>,
    private val expiresAt: JsonField<Long>,
    private val borrowRate: JsonField<String>,
    private val locatedQuantity: JsonField<String>,
    private val totalCost: JsonField<String>,
    private val deskComment: JsonField<String>,
    private val traderComment: JsonField<String>,
    private val referenceId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique locate ID assigned by us. */
    fun locateOrderId(): String = locateOrderId.getRequired("locate_order_id")

    /** The timestamp indicating when the locate order was requested. */
    fun requestedAt(): Long = requestedAt.getRequired("requested_at")

    /** The timestamp indicating when the locate order was last updated. */
    fun updatedAt(): Long = updatedAt.getRequired("updated_at")

    /** Unique MPID assigned by us. */
    fun mpid(): String = mpid.getRequired("mpid")

    /** Account ID for the account. */
    fun accountId(): String = accountId.getRequired("account_id")

    fun symbol(): String = symbol.getRequired("symbol")

    /** The status of the locate order. */
    fun status(): Status = status.getRequired("status")

    /** String representation of quantity. */
    fun requestedQuantity(): String = requestedQuantity.getRequired("requested_quantity")

    /** The locate ID, available once the locate order has been offered */
    fun locateId(): Optional<String> = Optional.ofNullable(locateId.getNullable("locate_id"))

    /** The timestamp indicating when the locate-order was located. */
    fun locatedAt(): Optional<Long> = Optional.ofNullable(locatedAt.getNullable("located_at"))

    /** The timestamp indicating when the locate-order will expire. */
    fun expiresAt(): Optional<Long> = Optional.ofNullable(expiresAt.getNullable("expires_at"))

    /** The rate charged if the instrument is held overnight. */
    fun borrowRate(): Optional<String> = Optional.ofNullable(borrowRate.getNullable("borrow_rate"))

    /** The quantity that has been located. */
    fun locatedQuantity(): Optional<String> =
        Optional.ofNullable(locatedQuantity.getNullable("located_quantity"))

    /** The total cost of the locate. */
    fun totalCost(): Optional<String> = Optional.ofNullable(totalCost.getNullable("total_cost"))

    /** Comment from the desk. */
    fun deskComment(): Optional<String> =
        Optional.ofNullable(deskComment.getNullable("desk_comment"))

    /** Comment from the trader. */
    fun traderComment(): Optional<String> =
        Optional.ofNullable(traderComment.getNullable("trader_comment"))

    /** The reference ID provided by you. */
    fun referenceId(): Optional<String> =
        Optional.ofNullable(referenceId.getNullable("reference_id"))

    /** Unique locate ID assigned by us. */
    @JsonProperty("locate_order_id") @ExcludeMissing fun _locateOrderId() = locateOrderId

    /** The timestamp indicating when the locate order was requested. */
    @JsonProperty("requested_at") @ExcludeMissing fun _requestedAt() = requestedAt

    /** The timestamp indicating when the locate order was last updated. */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** Unique MPID assigned by us. */
    @JsonProperty("mpid") @ExcludeMissing fun _mpid() = mpid

    /** Account ID for the account. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    @JsonProperty("symbol") @ExcludeMissing fun _symbol() = symbol

    /** The status of the locate order. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** String representation of quantity. */
    @JsonProperty("requested_quantity") @ExcludeMissing fun _requestedQuantity() = requestedQuantity

    /** The locate ID, available once the locate order has been offered */
    @JsonProperty("locate_id") @ExcludeMissing fun _locateId() = locateId

    /** The timestamp indicating when the locate-order was located. */
    @JsonProperty("located_at") @ExcludeMissing fun _locatedAt() = locatedAt

    /** The timestamp indicating when the locate-order will expire. */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

    /** The rate charged if the instrument is held overnight. */
    @JsonProperty("borrow_rate") @ExcludeMissing fun _borrowRate() = borrowRate

    /** The quantity that has been located. */
    @JsonProperty("located_quantity") @ExcludeMissing fun _locatedQuantity() = locatedQuantity

    /** The total cost of the locate. */
    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost() = totalCost

    /** Comment from the desk. */
    @JsonProperty("desk_comment") @ExcludeMissing fun _deskComment() = deskComment

    /** Comment from the trader. */
    @JsonProperty("trader_comment") @ExcludeMissing fun _traderComment() = traderComment

    /** The reference ID provided by you. */
    @JsonProperty("reference_id") @ExcludeMissing fun _referenceId() = referenceId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LocateOrder = apply {
        if (!validated) {
            locateOrderId()
            requestedAt()
            updatedAt()
            mpid()
            accountId()
            symbol()
            status()
            requestedQuantity()
            locateId()
            locatedAt()
            expiresAt()
            borrowRate()
            locatedQuantity()
            totalCost()
            deskComment()
            traderComment()
            referenceId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LocateOrder &&
            this.locateOrderId == other.locateOrderId &&
            this.requestedAt == other.requestedAt &&
            this.updatedAt == other.updatedAt &&
            this.mpid == other.mpid &&
            this.accountId == other.accountId &&
            this.symbol == other.symbol &&
            this.status == other.status &&
            this.requestedQuantity == other.requestedQuantity &&
            this.locateId == other.locateId &&
            this.locatedAt == other.locatedAt &&
            this.expiresAt == other.expiresAt &&
            this.borrowRate == other.borrowRate &&
            this.locatedQuantity == other.locatedQuantity &&
            this.totalCost == other.totalCost &&
            this.deskComment == other.deskComment &&
            this.traderComment == other.traderComment &&
            this.referenceId == other.referenceId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    locateOrderId,
                    requestedAt,
                    updatedAt,
                    mpid,
                    accountId,
                    symbol,
                    status,
                    requestedQuantity,
                    locateId,
                    locatedAt,
                    expiresAt,
                    borrowRate,
                    locatedQuantity,
                    totalCost,
                    deskComment,
                    traderComment,
                    referenceId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LocateOrder{locateOrderId=$locateOrderId, requestedAt=$requestedAt, updatedAt=$updatedAt, mpid=$mpid, accountId=$accountId, symbol=$symbol, status=$status, requestedQuantity=$requestedQuantity, locateId=$locateId, locatedAt=$locatedAt, expiresAt=$expiresAt, borrowRate=$borrowRate, locatedQuantity=$locatedQuantity, totalCost=$totalCost, deskComment=$deskComment, traderComment=$traderComment, referenceId=$referenceId, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var locateOrderId: JsonField<String> = JsonMissing.of()
        private var requestedAt: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<Long> = JsonMissing.of()
        private var mpid: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var requestedQuantity: JsonField<String> = JsonMissing.of()
        private var locateId: JsonField<String> = JsonMissing.of()
        private var locatedAt: JsonField<Long> = JsonMissing.of()
        private var expiresAt: JsonField<Long> = JsonMissing.of()
        private var borrowRate: JsonField<String> = JsonMissing.of()
        private var locatedQuantity: JsonField<String> = JsonMissing.of()
        private var totalCost: JsonField<String> = JsonMissing.of()
        private var deskComment: JsonField<String> = JsonMissing.of()
        private var traderComment: JsonField<String> = JsonMissing.of()
        private var referenceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(locateOrder: LocateOrder) = apply {
            this.locateOrderId = locateOrder.locateOrderId
            this.requestedAt = locateOrder.requestedAt
            this.updatedAt = locateOrder.updatedAt
            this.mpid = locateOrder.mpid
            this.accountId = locateOrder.accountId
            this.symbol = locateOrder.symbol
            this.status = locateOrder.status
            this.requestedQuantity = locateOrder.requestedQuantity
            this.locateId = locateOrder.locateId
            this.locatedAt = locateOrder.locatedAt
            this.expiresAt = locateOrder.expiresAt
            this.borrowRate = locateOrder.borrowRate
            this.locatedQuantity = locateOrder.locatedQuantity
            this.totalCost = locateOrder.totalCost
            this.deskComment = locateOrder.deskComment
            this.traderComment = locateOrder.traderComment
            this.referenceId = locateOrder.referenceId
            additionalProperties(locateOrder.additionalProperties)
        }

        /** Unique locate ID assigned by us. */
        fun locateOrderId(locateOrderId: String) = locateOrderId(JsonField.of(locateOrderId))

        /** Unique locate ID assigned by us. */
        @JsonProperty("locate_order_id")
        @ExcludeMissing
        fun locateOrderId(locateOrderId: JsonField<String>) = apply {
            this.locateOrderId = locateOrderId
        }

        /** The timestamp indicating when the locate order was requested. */
        fun requestedAt(requestedAt: Long) = requestedAt(JsonField.of(requestedAt))

        /** The timestamp indicating when the locate order was requested. */
        @JsonProperty("requested_at")
        @ExcludeMissing
        fun requestedAt(requestedAt: JsonField<Long>) = apply { this.requestedAt = requestedAt }

        /** The timestamp indicating when the locate order was last updated. */
        fun updatedAt(updatedAt: Long) = updatedAt(JsonField.of(updatedAt))

        /** The timestamp indicating when the locate order was last updated. */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<Long>) = apply { this.updatedAt = updatedAt }

        /** Unique MPID assigned by us. */
        fun mpid(mpid: String) = mpid(JsonField.of(mpid))

        /** Unique MPID assigned by us. */
        @JsonProperty("mpid")
        @ExcludeMissing
        fun mpid(mpid: JsonField<String>) = apply { this.mpid = mpid }

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

        /** The status of the locate order. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the locate order. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** String representation of quantity. */
        fun requestedQuantity(requestedQuantity: String) =
            requestedQuantity(JsonField.of(requestedQuantity))

        /** String representation of quantity. */
        @JsonProperty("requested_quantity")
        @ExcludeMissing
        fun requestedQuantity(requestedQuantity: JsonField<String>) = apply {
            this.requestedQuantity = requestedQuantity
        }

        /** The locate ID, available once the locate order has been offered */
        fun locateId(locateId: String) = locateId(JsonField.of(locateId))

        /** The locate ID, available once the locate order has been offered */
        @JsonProperty("locate_id")
        @ExcludeMissing
        fun locateId(locateId: JsonField<String>) = apply { this.locateId = locateId }

        /** The timestamp indicating when the locate-order was located. */
        fun locatedAt(locatedAt: Long) = locatedAt(JsonField.of(locatedAt))

        /** The timestamp indicating when the locate-order was located. */
        @JsonProperty("located_at")
        @ExcludeMissing
        fun locatedAt(locatedAt: JsonField<Long>) = apply { this.locatedAt = locatedAt }

        /** The timestamp indicating when the locate-order will expire. */
        fun expiresAt(expiresAt: Long) = expiresAt(JsonField.of(expiresAt))

        /** The timestamp indicating when the locate-order will expire. */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun expiresAt(expiresAt: JsonField<Long>) = apply { this.expiresAt = expiresAt }

        /** The rate charged if the instrument is held overnight. */
        fun borrowRate(borrowRate: String) = borrowRate(JsonField.of(borrowRate))

        /** The rate charged if the instrument is held overnight. */
        @JsonProperty("borrow_rate")
        @ExcludeMissing
        fun borrowRate(borrowRate: JsonField<String>) = apply { this.borrowRate = borrowRate }

        /** The quantity that has been located. */
        fun locatedQuantity(locatedQuantity: String) =
            locatedQuantity(JsonField.of(locatedQuantity))

        /** The quantity that has been located. */
        @JsonProperty("located_quantity")
        @ExcludeMissing
        fun locatedQuantity(locatedQuantity: JsonField<String>) = apply {
            this.locatedQuantity = locatedQuantity
        }

        /** The total cost of the locate. */
        fun totalCost(totalCost: String) = totalCost(JsonField.of(totalCost))

        /** The total cost of the locate. */
        @JsonProperty("total_cost")
        @ExcludeMissing
        fun totalCost(totalCost: JsonField<String>) = apply { this.totalCost = totalCost }

        /** Comment from the desk. */
        fun deskComment(deskComment: String) = deskComment(JsonField.of(deskComment))

        /** Comment from the desk. */
        @JsonProperty("desk_comment")
        @ExcludeMissing
        fun deskComment(deskComment: JsonField<String>) = apply { this.deskComment = deskComment }

        /** Comment from the trader. */
        fun traderComment(traderComment: String) = traderComment(JsonField.of(traderComment))

        /** Comment from the trader. */
        @JsonProperty("trader_comment")
        @ExcludeMissing
        fun traderComment(traderComment: JsonField<String>) = apply {
            this.traderComment = traderComment
        }

        /** The reference ID provided by you. */
        fun referenceId(referenceId: String) = referenceId(JsonField.of(referenceId))

        /** The reference ID provided by you. */
        @JsonProperty("reference_id")
        @ExcludeMissing
        fun referenceId(referenceId: JsonField<String>) = apply { this.referenceId = referenceId }

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

        fun build(): LocateOrder =
            LocateOrder(
                locateOrderId,
                requestedAt,
                updatedAt,
                mpid,
                accountId,
                symbol,
                status,
                requestedQuantity,
                locateId,
                locatedAt,
                expiresAt,
                borrowRate,
                locatedQuantity,
                totalCost,
                deskComment,
                traderComment,
                referenceId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val OFFERED = Status(JsonField.of("offered"))

            @JvmField val FILLED = Status(JsonField.of("filled"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmField val DECLINED = Status(JsonField.of("declined"))

            @JvmField val EXPIRED = Status(JsonField.of("expired"))

            @JvmField val CANCELLED = Status(JsonField.of("cancelled"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            OFFERED,
            FILLED,
            REJECTED,
            DECLINED,
            EXPIRED,
            CANCELLED,
        }

        enum class Value {
            PENDING,
            OFFERED,
            FILLED,
            REJECTED,
            DECLINED,
            EXPIRED,
            CANCELLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                OFFERED -> Value.OFFERED
                FILLED -> Value.FILLED
                REJECTED -> Value.REJECTED
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                CANCELLED -> Value.CANCELLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                OFFERED -> Known.OFFERED
                FILLED -> Known.FILLED
                REJECTED -> Known.REJECTED
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                CANCELLED -> Known.CANCELLED
                else -> throw StudioSdkInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
