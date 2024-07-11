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

@JsonDeserialize(builder = PnlSummary.Builder::class)
@NoAutoDetect
class PnlSummary
private constructor(
    private val timestamp: JsonField<Long>,
    private val entityId: JsonField<String>,
    private val sodEquity: JsonField<Double>,
    private val equity: JsonField<Double>,
    private val sodGrossMarketValue: JsonField<Double>,
    private val grossMarketValue: JsonField<Double>,
    private val netMarketValue: JsonField<Double>,
    private val longMarketValue: JsonField<Double>,
    private val shortMarketValue: JsonField<Double>,
    private val sodLongMarketValue: JsonField<Double>,
    private val sodShortMarketValue: JsonField<Double>,
    private val overnightPnl: JsonField<Double>,
    private val dayPnl: JsonField<Double>,
    private val realizedPnl: JsonField<Double>,
    private val unrealizedPnl: JsonField<Double>,
    private val totalPnl: JsonField<Double>,
    private val netPnl: JsonField<Double>,
    private val totalFees: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Milliseconds since epoch. */
    fun timestamp(): Long = timestamp.getRequired("timestamp")

    /** Entity ID for the legal entity. */
    fun entityId(): String = entityId.getRequired("entity_id")

    /** Net value of instruments held in the portfolio at the start of a trading day. */
    fun sodEquity(): Double = sodEquity.getRequired("sod_equity")

    /** Net value of instruments held in the portfolio. */
    fun equity(): Double = equity.getRequired("equity")

    /** Absolute market value at the start of a trading day. */
    fun sodGrossMarketValue(): Double = sodGrossMarketValue.getRequired("sod_gross_market_value")

    /** Absolute market value of long and short market values. */
    fun grossMarketValue(): Double = grossMarketValue.getRequired("gross_market_value")

    /** Market value net of long and short market values. */
    fun netMarketValue(): Double = netMarketValue.getRequired("net_market_value")

    /** Market value of securities positioned long. */
    fun longMarketValue(): Double = longMarketValue.getRequired("long_market_value")

    /** Market value of securities positioned short. */
    fun shortMarketValue(): Double = shortMarketValue.getRequired("short_market_value")

    /** Market value of securities positioned long at the start of a trading day. */
    fun sodLongMarketValue(): Double = sodLongMarketValue.getRequired("sod_long_market_value")

    /** Market value of securities positioned short at the start of a trading day. */
    fun sodShortMarketValue(): Double = sodShortMarketValue.getRequired("sod_short_market_value")

    /** Profit and loss from previous trading date. */
    fun overnightPnl(): Double = overnightPnl.getRequired("overnight_pnl")

    /** Profit and loss from intraday trading activities. */
    fun dayPnl(): Double = dayPnl.getRequired("day_pnl")

    /** Profit and loss realized from position closing trading activity */
    fun realizedPnl(): Double = realizedPnl.getRequired("realized_pnl")

    /** Profit and loss from market changes. */
    fun unrealizedPnl(): Double = unrealizedPnl.getRequired("unrealized_pnl")

    /** `realized_pnl + unrealized_pnl` */
    fun totalPnl(): Double = totalPnl.getRequired("total_pnl")

    /** `total_pnl + total_fees` */
    fun netPnl(): Double = netPnl.getRequired("net_pnl")

    /** Total fees incurred from trading activities. */
    fun totalFees(): Double = totalFees.getRequired("total_fees")

    /** Milliseconds since epoch. */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

    /** Entity ID for the legal entity. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

    /** Net value of instruments held in the portfolio at the start of a trading day. */
    @JsonProperty("sod_equity") @ExcludeMissing fun _sodEquity() = sodEquity

    /** Net value of instruments held in the portfolio. */
    @JsonProperty("equity") @ExcludeMissing fun _equity() = equity

    /** Absolute market value at the start of a trading day. */
    @JsonProperty("sod_gross_market_value")
    @ExcludeMissing
    fun _sodGrossMarketValue() = sodGrossMarketValue

    /** Absolute market value of long and short market values. */
    @JsonProperty("gross_market_value") @ExcludeMissing fun _grossMarketValue() = grossMarketValue

    /** Market value net of long and short market values. */
    @JsonProperty("net_market_value") @ExcludeMissing fun _netMarketValue() = netMarketValue

    /** Market value of securities positioned long. */
    @JsonProperty("long_market_value") @ExcludeMissing fun _longMarketValue() = longMarketValue

    /** Market value of securities positioned short. */
    @JsonProperty("short_market_value") @ExcludeMissing fun _shortMarketValue() = shortMarketValue

    /** Market value of securities positioned long at the start of a trading day. */
    @JsonProperty("sod_long_market_value")
    @ExcludeMissing
    fun _sodLongMarketValue() = sodLongMarketValue

    /** Market value of securities positioned short at the start of a trading day. */
    @JsonProperty("sod_short_market_value")
    @ExcludeMissing
    fun _sodShortMarketValue() = sodShortMarketValue

    /** Profit and loss from previous trading date. */
    @JsonProperty("overnight_pnl") @ExcludeMissing fun _overnightPnl() = overnightPnl

    /** Profit and loss from intraday trading activities. */
    @JsonProperty("day_pnl") @ExcludeMissing fun _dayPnl() = dayPnl

    /** Profit and loss realized from position closing trading activity */
    @JsonProperty("realized_pnl") @ExcludeMissing fun _realizedPnl() = realizedPnl

    /** Profit and loss from market changes. */
    @JsonProperty("unrealized_pnl") @ExcludeMissing fun _unrealizedPnl() = unrealizedPnl

    /** `realized_pnl + unrealized_pnl` */
    @JsonProperty("total_pnl") @ExcludeMissing fun _totalPnl() = totalPnl

    /** `total_pnl + total_fees` */
    @JsonProperty("net_pnl") @ExcludeMissing fun _netPnl() = netPnl

    /** Total fees incurred from trading activities. */
    @JsonProperty("total_fees") @ExcludeMissing fun _totalFees() = totalFees

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PnlSummary = apply {
        if (!validated) {
            timestamp()
            entityId()
            sodEquity()
            equity()
            sodGrossMarketValue()
            grossMarketValue()
            netMarketValue()
            longMarketValue()
            shortMarketValue()
            sodLongMarketValue()
            sodShortMarketValue()
            overnightPnl()
            dayPnl()
            realizedPnl()
            unrealizedPnl()
            totalPnl()
            netPnl()
            totalFees()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PnlSummary &&
            this.timestamp == other.timestamp &&
            this.entityId == other.entityId &&
            this.sodEquity == other.sodEquity &&
            this.equity == other.equity &&
            this.sodGrossMarketValue == other.sodGrossMarketValue &&
            this.grossMarketValue == other.grossMarketValue &&
            this.netMarketValue == other.netMarketValue &&
            this.longMarketValue == other.longMarketValue &&
            this.shortMarketValue == other.shortMarketValue &&
            this.sodLongMarketValue == other.sodLongMarketValue &&
            this.sodShortMarketValue == other.sodShortMarketValue &&
            this.overnightPnl == other.overnightPnl &&
            this.dayPnl == other.dayPnl &&
            this.realizedPnl == other.realizedPnl &&
            this.unrealizedPnl == other.unrealizedPnl &&
            this.totalPnl == other.totalPnl &&
            this.netPnl == other.netPnl &&
            this.totalFees == other.totalFees &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    timestamp,
                    entityId,
                    sodEquity,
                    equity,
                    sodGrossMarketValue,
                    grossMarketValue,
                    netMarketValue,
                    longMarketValue,
                    shortMarketValue,
                    sodLongMarketValue,
                    sodShortMarketValue,
                    overnightPnl,
                    dayPnl,
                    realizedPnl,
                    unrealizedPnl,
                    totalPnl,
                    netPnl,
                    totalFees,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PnlSummary{timestamp=$timestamp, entityId=$entityId, sodEquity=$sodEquity, equity=$equity, sodGrossMarketValue=$sodGrossMarketValue, grossMarketValue=$grossMarketValue, netMarketValue=$netMarketValue, longMarketValue=$longMarketValue, shortMarketValue=$shortMarketValue, sodLongMarketValue=$sodLongMarketValue, sodShortMarketValue=$sodShortMarketValue, overnightPnl=$overnightPnl, dayPnl=$dayPnl, realizedPnl=$realizedPnl, unrealizedPnl=$unrealizedPnl, totalPnl=$totalPnl, netPnl=$netPnl, totalFees=$totalFees, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var timestamp: JsonField<Long> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var sodEquity: JsonField<Double> = JsonMissing.of()
        private var equity: JsonField<Double> = JsonMissing.of()
        private var sodGrossMarketValue: JsonField<Double> = JsonMissing.of()
        private var grossMarketValue: JsonField<Double> = JsonMissing.of()
        private var netMarketValue: JsonField<Double> = JsonMissing.of()
        private var longMarketValue: JsonField<Double> = JsonMissing.of()
        private var shortMarketValue: JsonField<Double> = JsonMissing.of()
        private var sodLongMarketValue: JsonField<Double> = JsonMissing.of()
        private var sodShortMarketValue: JsonField<Double> = JsonMissing.of()
        private var overnightPnl: JsonField<Double> = JsonMissing.of()
        private var dayPnl: JsonField<Double> = JsonMissing.of()
        private var realizedPnl: JsonField<Double> = JsonMissing.of()
        private var unrealizedPnl: JsonField<Double> = JsonMissing.of()
        private var totalPnl: JsonField<Double> = JsonMissing.of()
        private var netPnl: JsonField<Double> = JsonMissing.of()
        private var totalFees: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pnlSummary: PnlSummary) = apply {
            this.timestamp = pnlSummary.timestamp
            this.entityId = pnlSummary.entityId
            this.sodEquity = pnlSummary.sodEquity
            this.equity = pnlSummary.equity
            this.sodGrossMarketValue = pnlSummary.sodGrossMarketValue
            this.grossMarketValue = pnlSummary.grossMarketValue
            this.netMarketValue = pnlSummary.netMarketValue
            this.longMarketValue = pnlSummary.longMarketValue
            this.shortMarketValue = pnlSummary.shortMarketValue
            this.sodLongMarketValue = pnlSummary.sodLongMarketValue
            this.sodShortMarketValue = pnlSummary.sodShortMarketValue
            this.overnightPnl = pnlSummary.overnightPnl
            this.dayPnl = pnlSummary.dayPnl
            this.realizedPnl = pnlSummary.realizedPnl
            this.unrealizedPnl = pnlSummary.unrealizedPnl
            this.totalPnl = pnlSummary.totalPnl
            this.netPnl = pnlSummary.netPnl
            this.totalFees = pnlSummary.totalFees
            additionalProperties(pnlSummary.additionalProperties)
        }

        /** Milliseconds since epoch. */
        fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

        /** Milliseconds since epoch. */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

        /** Entity ID for the legal entity. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** Entity ID for the legal entity. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** Net value of instruments held in the portfolio at the start of a trading day. */
        fun sodEquity(sodEquity: Double) = sodEquity(JsonField.of(sodEquity))

        /** Net value of instruments held in the portfolio at the start of a trading day. */
        @JsonProperty("sod_equity")
        @ExcludeMissing
        fun sodEquity(sodEquity: JsonField<Double>) = apply { this.sodEquity = sodEquity }

        /** Net value of instruments held in the portfolio. */
        fun equity(equity: Double) = equity(JsonField.of(equity))

        /** Net value of instruments held in the portfolio. */
        @JsonProperty("equity")
        @ExcludeMissing
        fun equity(equity: JsonField<Double>) = apply { this.equity = equity }

        /** Absolute market value at the start of a trading day. */
        fun sodGrossMarketValue(sodGrossMarketValue: Double) =
            sodGrossMarketValue(JsonField.of(sodGrossMarketValue))

        /** Absolute market value at the start of a trading day. */
        @JsonProperty("sod_gross_market_value")
        @ExcludeMissing
        fun sodGrossMarketValue(sodGrossMarketValue: JsonField<Double>) = apply {
            this.sodGrossMarketValue = sodGrossMarketValue
        }

        /** Absolute market value of long and short market values. */
        fun grossMarketValue(grossMarketValue: Double) =
            grossMarketValue(JsonField.of(grossMarketValue))

        /** Absolute market value of long and short market values. */
        @JsonProperty("gross_market_value")
        @ExcludeMissing
        fun grossMarketValue(grossMarketValue: JsonField<Double>) = apply {
            this.grossMarketValue = grossMarketValue
        }

        /** Market value net of long and short market values. */
        fun netMarketValue(netMarketValue: Double) = netMarketValue(JsonField.of(netMarketValue))

        /** Market value net of long and short market values. */
        @JsonProperty("net_market_value")
        @ExcludeMissing
        fun netMarketValue(netMarketValue: JsonField<Double>) = apply {
            this.netMarketValue = netMarketValue
        }

        /** Market value of securities positioned long. */
        fun longMarketValue(longMarketValue: Double) =
            longMarketValue(JsonField.of(longMarketValue))

        /** Market value of securities positioned long. */
        @JsonProperty("long_market_value")
        @ExcludeMissing
        fun longMarketValue(longMarketValue: JsonField<Double>) = apply {
            this.longMarketValue = longMarketValue
        }

        /** Market value of securities positioned short. */
        fun shortMarketValue(shortMarketValue: Double) =
            shortMarketValue(JsonField.of(shortMarketValue))

        /** Market value of securities positioned short. */
        @JsonProperty("short_market_value")
        @ExcludeMissing
        fun shortMarketValue(shortMarketValue: JsonField<Double>) = apply {
            this.shortMarketValue = shortMarketValue
        }

        /** Market value of securities positioned long at the start of a trading day. */
        fun sodLongMarketValue(sodLongMarketValue: Double) =
            sodLongMarketValue(JsonField.of(sodLongMarketValue))

        /** Market value of securities positioned long at the start of a trading day. */
        @JsonProperty("sod_long_market_value")
        @ExcludeMissing
        fun sodLongMarketValue(sodLongMarketValue: JsonField<Double>) = apply {
            this.sodLongMarketValue = sodLongMarketValue
        }

        /** Market value of securities positioned short at the start of a trading day. */
        fun sodShortMarketValue(sodShortMarketValue: Double) =
            sodShortMarketValue(JsonField.of(sodShortMarketValue))

        /** Market value of securities positioned short at the start of a trading day. */
        @JsonProperty("sod_short_market_value")
        @ExcludeMissing
        fun sodShortMarketValue(sodShortMarketValue: JsonField<Double>) = apply {
            this.sodShortMarketValue = sodShortMarketValue
        }

        /** Profit and loss from previous trading date. */
        fun overnightPnl(overnightPnl: Double) = overnightPnl(JsonField.of(overnightPnl))

        /** Profit and loss from previous trading date. */
        @JsonProperty("overnight_pnl")
        @ExcludeMissing
        fun overnightPnl(overnightPnl: JsonField<Double>) = apply {
            this.overnightPnl = overnightPnl
        }

        /** Profit and loss from intraday trading activities. */
        fun dayPnl(dayPnl: Double) = dayPnl(JsonField.of(dayPnl))

        /** Profit and loss from intraday trading activities. */
        @JsonProperty("day_pnl")
        @ExcludeMissing
        fun dayPnl(dayPnl: JsonField<Double>) = apply { this.dayPnl = dayPnl }

        /** Profit and loss realized from position closing trading activity */
        fun realizedPnl(realizedPnl: Double) = realizedPnl(JsonField.of(realizedPnl))

        /** Profit and loss realized from position closing trading activity */
        @JsonProperty("realized_pnl")
        @ExcludeMissing
        fun realizedPnl(realizedPnl: JsonField<Double>) = apply { this.realizedPnl = realizedPnl }

        /** Profit and loss from market changes. */
        fun unrealizedPnl(unrealizedPnl: Double) = unrealizedPnl(JsonField.of(unrealizedPnl))

        /** Profit and loss from market changes. */
        @JsonProperty("unrealized_pnl")
        @ExcludeMissing
        fun unrealizedPnl(unrealizedPnl: JsonField<Double>) = apply {
            this.unrealizedPnl = unrealizedPnl
        }

        /** `realized_pnl + unrealized_pnl` */
        fun totalPnl(totalPnl: Double) = totalPnl(JsonField.of(totalPnl))

        /** `realized_pnl + unrealized_pnl` */
        @JsonProperty("total_pnl")
        @ExcludeMissing
        fun totalPnl(totalPnl: JsonField<Double>) = apply { this.totalPnl = totalPnl }

        /** `total_pnl + total_fees` */
        fun netPnl(netPnl: Double) = netPnl(JsonField.of(netPnl))

        /** `total_pnl + total_fees` */
        @JsonProperty("net_pnl")
        @ExcludeMissing
        fun netPnl(netPnl: JsonField<Double>) = apply { this.netPnl = netPnl }

        /** Total fees incurred from trading activities. */
        fun totalFees(totalFees: Double) = totalFees(JsonField.of(totalFees))

        /** Total fees incurred from trading activities. */
        @JsonProperty("total_fees")
        @ExcludeMissing
        fun totalFees(totalFees: JsonField<Double>) = apply { this.totalFees = totalFees }

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

        fun build(): PnlSummary =
            PnlSummary(
                timestamp,
                entityId,
                sodEquity,
                equity,
                sodGrossMarketValue,
                grossMarketValue,
                netMarketValue,
                longMarketValue,
                shortMarketValue,
                sodLongMarketValue,
                sodShortMarketValue,
                overnightPnl,
                dayPnl,
                realizedPnl,
                unrealizedPnl,
                totalPnl,
                netPnl,
                totalFees,
                additionalProperties.toUnmodifiable(),
            )
    }
}
