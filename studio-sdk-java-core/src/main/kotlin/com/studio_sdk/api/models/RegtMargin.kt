// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.studio_sdk.api.core.Enum
import com.studio_sdk.api.core.ExcludeMissing
import com.studio_sdk.api.core.JsonField
import com.studio_sdk.api.core.JsonMissing
import com.studio_sdk.api.core.JsonValue
import com.studio_sdk.api.core.NoAutoDetect
import com.studio_sdk.api.core.toUnmodifiable
import com.studio_sdk.api.errors.StudioSdkInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = RegtMargin.Builder::class)
@NoAutoDetect
class RegtMargin
private constructor(
    private val version: JsonField<String>,
    private val timestamp: JsonField<Long>,
    private val netMarketValue: JsonField<Double>,
    private val effectiveRequirement: JsonField<Double>,
    private val effectiveExcess: JsonField<Double>,
    private val houseRequirement: JsonField<Double>,
    private val houseExcess: JsonField<Double>,
    private val exchangeRequirement: JsonField<Double>,
    private val exchangeExcess: JsonField<Double>,
    private val sma: JsonField<Double>,
    private val sodBuyingPower: JsonField<Double>,
    private val overnightBuyingPower: JsonField<Double>,
    private val dayTradeBuyingPower: JsonField<Double>,
    private val groups: JsonField<List<Group>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for this margin calculation. */
    fun version(): String = version.getRequired("version")

    /** Timestamp of when this margin was calculated. */
    fun timestamp(): Long = timestamp.getRequired("timestamp")

    /** Market value net of long and short market values. */
    fun netMarketValue(): Double = netMarketValue.getRequired("net_market_value")

    /** The enforced margin requirement in effect. */
    fun effectiveRequirement(): Double = effectiveRequirement.getRequired("effective_requirement")

    /**
     * The maring amount by taking the difference between total equity and the effective
     * requirement. A negative number reflects an effective margin deficit.
     */
    fun effectiveExcess(): Optional<Double> =
        Optional.ofNullable(effectiveExcess.getNullable("effective_excess"))

    /** Margin requirements based on Clear Street's house margin methodology. */
    fun houseRequirement(): Double = houseRequirement.getRequired("house_requirement")

    /**
     * The margin amount by taking the difference between total equity and the house requirement. A
     * negative number reflects a house margin deficit.
     */
    fun houseExcess(): Double = houseExcess.getRequired("house_excess")

    /** Margin requirements based on regulatory rules. */
    fun exchangeRequirement(): Double = exchangeRequirement.getRequired("exchange_requirement")

    /**
     * The margin amount by taking the difference between total equity and the exchange requirement.
     * A negative number reflects an regulatory margin deficit.
     */
    fun exchangeExcess(): Optional<Double> =
        Optional.ofNullable(exchangeExcess.getNullable("exchange_excess"))

    /**
     * Special Memorandum Account (SMA). The regulatory line of credit amount for margin trading
     * based on market value, trading activity, and available cash.
     */
    fun sma(): Double = sma.getRequired("sma")

    /**
     * The limit, or "up-to" amount, of securities value that can be day-traded for a given trading
     * day.
     */
    fun sodBuyingPower(): Double = sodBuyingPower.getRequired("sod_buying_power")

    /**
     * The limit, or "up-to" amount, of securities value that can be purchased and held overnight.
     */
    fun overnightBuyingPower(): Double = overnightBuyingPower.getRequired("overnight_buying_power")

    /** The remaining amount of start_of_day_buying_power that captures any day-trading activity. */
    fun dayTradeBuyingPower(): Double = dayTradeBuyingPower.getRequired("day_trade_buying_power")

    /** Reg-T margin groups */
    fun groups(): List<Group> = groups.getRequired("groups")

    /** Unique identifier for this margin calculation. */
    @JsonProperty("version") @ExcludeMissing fun _version() = version

    /** Timestamp of when this margin was calculated. */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

    /** Market value net of long and short market values. */
    @JsonProperty("net_market_value") @ExcludeMissing fun _netMarketValue() = netMarketValue

    /** The enforced margin requirement in effect. */
    @JsonProperty("effective_requirement")
    @ExcludeMissing
    fun _effectiveRequirement() = effectiveRequirement

    /**
     * The maring amount by taking the difference between total equity and the effective
     * requirement. A negative number reflects an effective margin deficit.
     */
    @JsonProperty("effective_excess") @ExcludeMissing fun _effectiveExcess() = effectiveExcess

    /** Margin requirements based on Clear Street's house margin methodology. */
    @JsonProperty("house_requirement") @ExcludeMissing fun _houseRequirement() = houseRequirement

    /**
     * The margin amount by taking the difference between total equity and the house requirement. A
     * negative number reflects a house margin deficit.
     */
    @JsonProperty("house_excess") @ExcludeMissing fun _houseExcess() = houseExcess

    /** Margin requirements based on regulatory rules. */
    @JsonProperty("exchange_requirement")
    @ExcludeMissing
    fun _exchangeRequirement() = exchangeRequirement

    /**
     * The margin amount by taking the difference between total equity and the exchange requirement.
     * A negative number reflects an regulatory margin deficit.
     */
    @JsonProperty("exchange_excess") @ExcludeMissing fun _exchangeExcess() = exchangeExcess

    /**
     * Special Memorandum Account (SMA). The regulatory line of credit amount for margin trading
     * based on market value, trading activity, and available cash.
     */
    @JsonProperty("sma") @ExcludeMissing fun _sma() = sma

    /**
     * The limit, or "up-to" amount, of securities value that can be day-traded for a given trading
     * day.
     */
    @JsonProperty("sod_buying_power") @ExcludeMissing fun _sodBuyingPower() = sodBuyingPower

    /**
     * The limit, or "up-to" amount, of securities value that can be purchased and held overnight.
     */
    @JsonProperty("overnight_buying_power")
    @ExcludeMissing
    fun _overnightBuyingPower() = overnightBuyingPower

    /** The remaining amount of start_of_day_buying_power that captures any day-trading activity. */
    @JsonProperty("day_trade_buying_power")
    @ExcludeMissing
    fun _dayTradeBuyingPower() = dayTradeBuyingPower

    /** Reg-T margin groups */
    @JsonProperty("groups") @ExcludeMissing fun _groups() = groups

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RegtMargin = apply {
        if (!validated) {
            version()
            timestamp()
            netMarketValue()
            effectiveRequirement()
            effectiveExcess()
            houseRequirement()
            houseExcess()
            exchangeRequirement()
            exchangeExcess()
            sma()
            sodBuyingPower()
            overnightBuyingPower()
            dayTradeBuyingPower()
            groups().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RegtMargin &&
            this.version == other.version &&
            this.timestamp == other.timestamp &&
            this.netMarketValue == other.netMarketValue &&
            this.effectiveRequirement == other.effectiveRequirement &&
            this.effectiveExcess == other.effectiveExcess &&
            this.houseRequirement == other.houseRequirement &&
            this.houseExcess == other.houseExcess &&
            this.exchangeRequirement == other.exchangeRequirement &&
            this.exchangeExcess == other.exchangeExcess &&
            this.sma == other.sma &&
            this.sodBuyingPower == other.sodBuyingPower &&
            this.overnightBuyingPower == other.overnightBuyingPower &&
            this.dayTradeBuyingPower == other.dayTradeBuyingPower &&
            this.groups == other.groups &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    version,
                    timestamp,
                    netMarketValue,
                    effectiveRequirement,
                    effectiveExcess,
                    houseRequirement,
                    houseExcess,
                    exchangeRequirement,
                    exchangeExcess,
                    sma,
                    sodBuyingPower,
                    overnightBuyingPower,
                    dayTradeBuyingPower,
                    groups,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RegtMargin{version=$version, timestamp=$timestamp, netMarketValue=$netMarketValue, effectiveRequirement=$effectiveRequirement, effectiveExcess=$effectiveExcess, houseRequirement=$houseRequirement, houseExcess=$houseExcess, exchangeRequirement=$exchangeRequirement, exchangeExcess=$exchangeExcess, sma=$sma, sodBuyingPower=$sodBuyingPower, overnightBuyingPower=$overnightBuyingPower, dayTradeBuyingPower=$dayTradeBuyingPower, groups=$groups, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var version: JsonField<String> = JsonMissing.of()
        private var timestamp: JsonField<Long> = JsonMissing.of()
        private var netMarketValue: JsonField<Double> = JsonMissing.of()
        private var effectiveRequirement: JsonField<Double> = JsonMissing.of()
        private var effectiveExcess: JsonField<Double> = JsonMissing.of()
        private var houseRequirement: JsonField<Double> = JsonMissing.of()
        private var houseExcess: JsonField<Double> = JsonMissing.of()
        private var exchangeRequirement: JsonField<Double> = JsonMissing.of()
        private var exchangeExcess: JsonField<Double> = JsonMissing.of()
        private var sma: JsonField<Double> = JsonMissing.of()
        private var sodBuyingPower: JsonField<Double> = JsonMissing.of()
        private var overnightBuyingPower: JsonField<Double> = JsonMissing.of()
        private var dayTradeBuyingPower: JsonField<Double> = JsonMissing.of()
        private var groups: JsonField<List<Group>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(regtMargin: RegtMargin) = apply {
            this.version = regtMargin.version
            this.timestamp = regtMargin.timestamp
            this.netMarketValue = regtMargin.netMarketValue
            this.effectiveRequirement = regtMargin.effectiveRequirement
            this.effectiveExcess = regtMargin.effectiveExcess
            this.houseRequirement = regtMargin.houseRequirement
            this.houseExcess = regtMargin.houseExcess
            this.exchangeRequirement = regtMargin.exchangeRequirement
            this.exchangeExcess = regtMargin.exchangeExcess
            this.sma = regtMargin.sma
            this.sodBuyingPower = regtMargin.sodBuyingPower
            this.overnightBuyingPower = regtMargin.overnightBuyingPower
            this.dayTradeBuyingPower = regtMargin.dayTradeBuyingPower
            this.groups = regtMargin.groups
            additionalProperties(regtMargin.additionalProperties)
        }

        /** Unique identifier for this margin calculation. */
        fun version(version: String) = version(JsonField.of(version))

        /** Unique identifier for this margin calculation. */
        @JsonProperty("version")
        @ExcludeMissing
        fun version(version: JsonField<String>) = apply { this.version = version }

        /** Timestamp of when this margin was calculated. */
        fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

        /** Timestamp of when this margin was calculated. */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

        /** Market value net of long and short market values. */
        fun netMarketValue(netMarketValue: Double) = netMarketValue(JsonField.of(netMarketValue))

        /** Market value net of long and short market values. */
        @JsonProperty("net_market_value")
        @ExcludeMissing
        fun netMarketValue(netMarketValue: JsonField<Double>) = apply {
            this.netMarketValue = netMarketValue
        }

        /** The enforced margin requirement in effect. */
        fun effectiveRequirement(effectiveRequirement: Double) =
            effectiveRequirement(JsonField.of(effectiveRequirement))

        /** The enforced margin requirement in effect. */
        @JsonProperty("effective_requirement")
        @ExcludeMissing
        fun effectiveRequirement(effectiveRequirement: JsonField<Double>) = apply {
            this.effectiveRequirement = effectiveRequirement
        }

        /**
         * The maring amount by taking the difference between total equity and the effective
         * requirement. A negative number reflects an effective margin deficit.
         */
        fun effectiveExcess(effectiveExcess: Double) =
            effectiveExcess(JsonField.of(effectiveExcess))

        /**
         * The maring amount by taking the difference between total equity and the effective
         * requirement. A negative number reflects an effective margin deficit.
         */
        @JsonProperty("effective_excess")
        @ExcludeMissing
        fun effectiveExcess(effectiveExcess: JsonField<Double>) = apply {
            this.effectiveExcess = effectiveExcess
        }

        /** Margin requirements based on Clear Street's house margin methodology. */
        fun houseRequirement(houseRequirement: Double) =
            houseRequirement(JsonField.of(houseRequirement))

        /** Margin requirements based on Clear Street's house margin methodology. */
        @JsonProperty("house_requirement")
        @ExcludeMissing
        fun houseRequirement(houseRequirement: JsonField<Double>) = apply {
            this.houseRequirement = houseRequirement
        }

        /**
         * The margin amount by taking the difference between total equity and the house
         * requirement. A negative number reflects a house margin deficit.
         */
        fun houseExcess(houseExcess: Double) = houseExcess(JsonField.of(houseExcess))

        /**
         * The margin amount by taking the difference between total equity and the house
         * requirement. A negative number reflects a house margin deficit.
         */
        @JsonProperty("house_excess")
        @ExcludeMissing
        fun houseExcess(houseExcess: JsonField<Double>) = apply { this.houseExcess = houseExcess }

        /** Margin requirements based on regulatory rules. */
        fun exchangeRequirement(exchangeRequirement: Double) =
            exchangeRequirement(JsonField.of(exchangeRequirement))

        /** Margin requirements based on regulatory rules. */
        @JsonProperty("exchange_requirement")
        @ExcludeMissing
        fun exchangeRequirement(exchangeRequirement: JsonField<Double>) = apply {
            this.exchangeRequirement = exchangeRequirement
        }

        /**
         * The margin amount by taking the difference between total equity and the exchange
         * requirement. A negative number reflects an regulatory margin deficit.
         */
        fun exchangeExcess(exchangeExcess: Double) = exchangeExcess(JsonField.of(exchangeExcess))

        /**
         * The margin amount by taking the difference between total equity and the exchange
         * requirement. A negative number reflects an regulatory margin deficit.
         */
        @JsonProperty("exchange_excess")
        @ExcludeMissing
        fun exchangeExcess(exchangeExcess: JsonField<Double>) = apply {
            this.exchangeExcess = exchangeExcess
        }

        /**
         * Special Memorandum Account (SMA). The regulatory line of credit amount for margin trading
         * based on market value, trading activity, and available cash.
         */
        fun sma(sma: Double) = sma(JsonField.of(sma))

        /**
         * Special Memorandum Account (SMA). The regulatory line of credit amount for margin trading
         * based on market value, trading activity, and available cash.
         */
        @JsonProperty("sma")
        @ExcludeMissing
        fun sma(sma: JsonField<Double>) = apply { this.sma = sma }

        /**
         * The limit, or "up-to" amount, of securities value that can be day-traded for a given
         * trading day.
         */
        fun sodBuyingPower(sodBuyingPower: Double) = sodBuyingPower(JsonField.of(sodBuyingPower))

        /**
         * The limit, or "up-to" amount, of securities value that can be day-traded for a given
         * trading day.
         */
        @JsonProperty("sod_buying_power")
        @ExcludeMissing
        fun sodBuyingPower(sodBuyingPower: JsonField<Double>) = apply {
            this.sodBuyingPower = sodBuyingPower
        }

        /**
         * The limit, or "up-to" amount, of securities value that can be purchased and held
         * overnight.
         */
        fun overnightBuyingPower(overnightBuyingPower: Double) =
            overnightBuyingPower(JsonField.of(overnightBuyingPower))

        /**
         * The limit, or "up-to" amount, of securities value that can be purchased and held
         * overnight.
         */
        @JsonProperty("overnight_buying_power")
        @ExcludeMissing
        fun overnightBuyingPower(overnightBuyingPower: JsonField<Double>) = apply {
            this.overnightBuyingPower = overnightBuyingPower
        }

        /**
         * The remaining amount of start_of_day_buying_power that captures any day-trading activity.
         */
        fun dayTradeBuyingPower(dayTradeBuyingPower: Double) =
            dayTradeBuyingPower(JsonField.of(dayTradeBuyingPower))

        /**
         * The remaining amount of start_of_day_buying_power that captures any day-trading activity.
         */
        @JsonProperty("day_trade_buying_power")
        @ExcludeMissing
        fun dayTradeBuyingPower(dayTradeBuyingPower: JsonField<Double>) = apply {
            this.dayTradeBuyingPower = dayTradeBuyingPower
        }

        /** Reg-T margin groups */
        fun groups(groups: List<Group>) = groups(JsonField.of(groups))

        /** Reg-T margin groups */
        @JsonProperty("groups")
        @ExcludeMissing
        fun groups(groups: JsonField<List<Group>>) = apply { this.groups = groups }

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

        fun build(): RegtMargin =
            RegtMargin(
                version,
                timestamp,
                netMarketValue,
                effectiveRequirement,
                effectiveExcess,
                houseRequirement,
                houseExcess,
                exchangeRequirement,
                exchangeExcess,
                sma,
                sodBuyingPower,
                overnightBuyingPower,
                dayTradeBuyingPower,
                groups.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Group.Builder::class)
    @NoAutoDetect
    class Group
    private constructor(
        private val name: JsonField<String>,
        private val marketValue: JsonField<Double>,
        private val marketValuePercent: JsonField<Double>,
        private val effectiveRequirement: JsonField<Double>,
        private val houseRequirement: JsonField<Double>,
        private val exchangeRequirement: JsonField<Double>,
        private val marginPercent: JsonField<Double>,
        private val marginPercentContribution: JsonField<Double>,
        private val members: JsonField<List<Member>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Unique name of the group, typically the symbol of the underlier. */
        fun name(): String = name.getRequired("name")

        /** The aggregated market value of all instruments for the symbol group. */
        fun marketValue(): Double = marketValue.getRequired("market_value")

        /**
         * The percentage market value of the symbol group in terms of the total net_market_value of
         * all positions. Formula: `(market_value / net_market_value)`
         */
        fun marketValuePercent(): Double = marketValuePercent.getRequired("market_value_percent")

        /** The enforced margin requirement in effect for the symbol group. */
        fun effectiveRequirement(): Double =
            effectiveRequirement.getRequired("effective_requirement")

        /**
         * Margin requirements based on Clear Street's house margin methodology for the symbol
         * group.
         */
        fun houseRequirement(): Double = houseRequirement.getRequired("house_requirement")

        /** Margin requirements based on regulatory rules for the symbol group. */
        fun exchangeRequirement(): Double = exchangeRequirement.getRequired("exchange_requirement")

        /**
         * The percentage effective margin requirement in terms of the symbol group market value.
         * Formula: `(effective_requirement / net_market_value)`
         */
        fun marginPercent(): Double = marginPercent.getRequired("margin_percent")

        /**
         * The percentage effective margin requirement in terms of the total effective requirement.
         * Formula: `(effective_requirement / sum(effective_requirement))`
         */
        fun marginPercentContribution(): Double =
            marginPercentContribution.getRequired("margin_percent_contribution")

        /** A list of securities that comprise this group. */
        fun members(): List<Member> = members.getRequired("members")

        /** Unique name of the group, typically the symbol of the underlier. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The aggregated market value of all instruments for the symbol group. */
        @JsonProperty("market_value") @ExcludeMissing fun _marketValue() = marketValue

        /**
         * The percentage market value of the symbol group in terms of the total net_market_value of
         * all positions. Formula: `(market_value / net_market_value)`
         */
        @JsonProperty("market_value_percent")
        @ExcludeMissing
        fun _marketValuePercent() = marketValuePercent

        /** The enforced margin requirement in effect for the symbol group. */
        @JsonProperty("effective_requirement")
        @ExcludeMissing
        fun _effectiveRequirement() = effectiveRequirement

        /**
         * Margin requirements based on Clear Street's house margin methodology for the symbol
         * group.
         */
        @JsonProperty("house_requirement")
        @ExcludeMissing
        fun _houseRequirement() = houseRequirement

        /** Margin requirements based on regulatory rules for the symbol group. */
        @JsonProperty("exchange_requirement")
        @ExcludeMissing
        fun _exchangeRequirement() = exchangeRequirement

        /**
         * The percentage effective margin requirement in terms of the symbol group market value.
         * Formula: `(effective_requirement / net_market_value)`
         */
        @JsonProperty("margin_percent") @ExcludeMissing fun _marginPercent() = marginPercent

        /**
         * The percentage effective margin requirement in terms of the total effective requirement.
         * Formula: `(effective_requirement / sum(effective_requirement))`
         */
        @JsonProperty("margin_percent_contribution")
        @ExcludeMissing
        fun _marginPercentContribution() = marginPercentContribution

        /** A list of securities that comprise this group. */
        @JsonProperty("members") @ExcludeMissing fun _members() = members

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Group = apply {
            if (!validated) {
                name()
                marketValue()
                marketValuePercent()
                effectiveRequirement()
                houseRequirement()
                exchangeRequirement()
                marginPercent()
                marginPercentContribution()
                members().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Group &&
                this.name == other.name &&
                this.marketValue == other.marketValue &&
                this.marketValuePercent == other.marketValuePercent &&
                this.effectiveRequirement == other.effectiveRequirement &&
                this.houseRequirement == other.houseRequirement &&
                this.exchangeRequirement == other.exchangeRequirement &&
                this.marginPercent == other.marginPercent &&
                this.marginPercentContribution == other.marginPercentContribution &&
                this.members == other.members &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        marketValue,
                        marketValuePercent,
                        effectiveRequirement,
                        houseRequirement,
                        exchangeRequirement,
                        marginPercent,
                        marginPercentContribution,
                        members,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Group{name=$name, marketValue=$marketValue, marketValuePercent=$marketValuePercent, effectiveRequirement=$effectiveRequirement, houseRequirement=$houseRequirement, exchangeRequirement=$exchangeRequirement, marginPercent=$marginPercent, marginPercentContribution=$marginPercentContribution, members=$members, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var marketValue: JsonField<Double> = JsonMissing.of()
            private var marketValuePercent: JsonField<Double> = JsonMissing.of()
            private var effectiveRequirement: JsonField<Double> = JsonMissing.of()
            private var houseRequirement: JsonField<Double> = JsonMissing.of()
            private var exchangeRequirement: JsonField<Double> = JsonMissing.of()
            private var marginPercent: JsonField<Double> = JsonMissing.of()
            private var marginPercentContribution: JsonField<Double> = JsonMissing.of()
            private var members: JsonField<List<Member>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(group: Group) = apply {
                this.name = group.name
                this.marketValue = group.marketValue
                this.marketValuePercent = group.marketValuePercent
                this.effectiveRequirement = group.effectiveRequirement
                this.houseRequirement = group.houseRequirement
                this.exchangeRequirement = group.exchangeRequirement
                this.marginPercent = group.marginPercent
                this.marginPercentContribution = group.marginPercentContribution
                this.members = group.members
                additionalProperties(group.additionalProperties)
            }

            /** Unique name of the group, typically the symbol of the underlier. */
            fun name(name: String) = name(JsonField.of(name))

            /** Unique name of the group, typically the symbol of the underlier. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The aggregated market value of all instruments for the symbol group. */
            fun marketValue(marketValue: Double) = marketValue(JsonField.of(marketValue))

            /** The aggregated market value of all instruments for the symbol group. */
            @JsonProperty("market_value")
            @ExcludeMissing
            fun marketValue(marketValue: JsonField<Double>) = apply {
                this.marketValue = marketValue
            }

            /**
             * The percentage market value of the symbol group in terms of the total
             * net_market_value of all positions. Formula: `(market_value / net_market_value)`
             */
            fun marketValuePercent(marketValuePercent: Double) =
                marketValuePercent(JsonField.of(marketValuePercent))

            /**
             * The percentage market value of the symbol group in terms of the total
             * net_market_value of all positions. Formula: `(market_value / net_market_value)`
             */
            @JsonProperty("market_value_percent")
            @ExcludeMissing
            fun marketValuePercent(marketValuePercent: JsonField<Double>) = apply {
                this.marketValuePercent = marketValuePercent
            }

            /** The enforced margin requirement in effect for the symbol group. */
            fun effectiveRequirement(effectiveRequirement: Double) =
                effectiveRequirement(JsonField.of(effectiveRequirement))

            /** The enforced margin requirement in effect for the symbol group. */
            @JsonProperty("effective_requirement")
            @ExcludeMissing
            fun effectiveRequirement(effectiveRequirement: JsonField<Double>) = apply {
                this.effectiveRequirement = effectiveRequirement
            }

            /**
             * Margin requirements based on Clear Street's house margin methodology for the symbol
             * group.
             */
            fun houseRequirement(houseRequirement: Double) =
                houseRequirement(JsonField.of(houseRequirement))

            /**
             * Margin requirements based on Clear Street's house margin methodology for the symbol
             * group.
             */
            @JsonProperty("house_requirement")
            @ExcludeMissing
            fun houseRequirement(houseRequirement: JsonField<Double>) = apply {
                this.houseRequirement = houseRequirement
            }

            /** Margin requirements based on regulatory rules for the symbol group. */
            fun exchangeRequirement(exchangeRequirement: Double) =
                exchangeRequirement(JsonField.of(exchangeRequirement))

            /** Margin requirements based on regulatory rules for the symbol group. */
            @JsonProperty("exchange_requirement")
            @ExcludeMissing
            fun exchangeRequirement(exchangeRequirement: JsonField<Double>) = apply {
                this.exchangeRequirement = exchangeRequirement
            }

            /**
             * The percentage effective margin requirement in terms of the symbol group market
             * value. Formula: `(effective_requirement / net_market_value)`
             */
            fun marginPercent(marginPercent: Double) = marginPercent(JsonField.of(marginPercent))

            /**
             * The percentage effective margin requirement in terms of the symbol group market
             * value. Formula: `(effective_requirement / net_market_value)`
             */
            @JsonProperty("margin_percent")
            @ExcludeMissing
            fun marginPercent(marginPercent: JsonField<Double>) = apply {
                this.marginPercent = marginPercent
            }

            /**
             * The percentage effective margin requirement in terms of the total effective
             * requirement. Formula: `(effective_requirement / sum(effective_requirement))`
             */
            fun marginPercentContribution(marginPercentContribution: Double) =
                marginPercentContribution(JsonField.of(marginPercentContribution))

            /**
             * The percentage effective margin requirement in terms of the total effective
             * requirement. Formula: `(effective_requirement / sum(effective_requirement))`
             */
            @JsonProperty("margin_percent_contribution")
            @ExcludeMissing
            fun marginPercentContribution(marginPercentContribution: JsonField<Double>) = apply {
                this.marginPercentContribution = marginPercentContribution
            }

            /** A list of securities that comprise this group. */
            fun members(members: List<Member>) = members(JsonField.of(members))

            /** A list of securities that comprise this group. */
            @JsonProperty("members")
            @ExcludeMissing
            fun members(members: JsonField<List<Member>>) = apply { this.members = members }

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

            fun build(): Group =
                Group(
                    name,
                    marketValue,
                    marketValuePercent,
                    effectiveRequirement,
                    houseRequirement,
                    exchangeRequirement,
                    marginPercent,
                    marginPercentContribution,
                    members.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Member.Builder::class)
        @NoAutoDetect
        class Member
        private constructor(
            private val symbol: JsonField<String>,
            private val assetClass: JsonField<AssetClass>,
            private val quantity: JsonField<String>,
            private val marketValue: JsonField<Double>,
            private val marketValuePercent: JsonField<Double>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The symbol for the instrument. */
            fun symbol(): String = symbol.getRequired("symbol")

            /** The asset class of the symbol. */
            fun assetClass(): AssetClass = assetClass.getRequired("asset_class")

            /** The quantity held for this instrument. */
            fun quantity(): String = quantity.getRequired("quantity")

            /** Market value of the instrument. */
            fun marketValue(): Double = marketValue.getRequired("market_value")

            /**
             * The percentage market value of the instrument in terms of the total
             * `net_market_value` of all positions held. Formula: `market_value / net_market_value`
             */
            fun marketValuePercent(): Double =
                marketValuePercent.getRequired("market_value_percent")

            /** The symbol for the instrument. */
            @JsonProperty("symbol") @ExcludeMissing fun _symbol() = symbol

            /** The asset class of the symbol. */
            @JsonProperty("asset_class") @ExcludeMissing fun _assetClass() = assetClass

            /** The quantity held for this instrument. */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            /** Market value of the instrument. */
            @JsonProperty("market_value") @ExcludeMissing fun _marketValue() = marketValue

            /**
             * The percentage market value of the instrument in terms of the total
             * `net_market_value` of all positions held. Formula: `market_value / net_market_value`
             */
            @JsonProperty("market_value_percent")
            @ExcludeMissing
            fun _marketValuePercent() = marketValuePercent

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Member = apply {
                if (!validated) {
                    symbol()
                    assetClass()
                    quantity()
                    marketValue()
                    marketValuePercent()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Member &&
                    this.symbol == other.symbol &&
                    this.assetClass == other.assetClass &&
                    this.quantity == other.quantity &&
                    this.marketValue == other.marketValue &&
                    this.marketValuePercent == other.marketValuePercent &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            symbol,
                            assetClass,
                            quantity,
                            marketValue,
                            marketValuePercent,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Member{symbol=$symbol, assetClass=$assetClass, quantity=$quantity, marketValue=$marketValue, marketValuePercent=$marketValuePercent, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var symbol: JsonField<String> = JsonMissing.of()
                private var assetClass: JsonField<AssetClass> = JsonMissing.of()
                private var quantity: JsonField<String> = JsonMissing.of()
                private var marketValue: JsonField<Double> = JsonMissing.of()
                private var marketValuePercent: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(member: Member) = apply {
                    this.symbol = member.symbol
                    this.assetClass = member.assetClass
                    this.quantity = member.quantity
                    this.marketValue = member.marketValue
                    this.marketValuePercent = member.marketValuePercent
                    additionalProperties(member.additionalProperties)
                }

                /** The symbol for the instrument. */
                fun symbol(symbol: String) = symbol(JsonField.of(symbol))

                /** The symbol for the instrument. */
                @JsonProperty("symbol")
                @ExcludeMissing
                fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

                /** The asset class of the symbol. */
                fun assetClass(assetClass: AssetClass) = assetClass(JsonField.of(assetClass))

                /** The asset class of the symbol. */
                @JsonProperty("asset_class")
                @ExcludeMissing
                fun assetClass(assetClass: JsonField<AssetClass>) = apply {
                    this.assetClass = assetClass
                }

                /** The quantity held for this instrument. */
                fun quantity(quantity: String) = quantity(JsonField.of(quantity))

                /** The quantity held for this instrument. */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

                /** Market value of the instrument. */
                fun marketValue(marketValue: Double) = marketValue(JsonField.of(marketValue))

                /** Market value of the instrument. */
                @JsonProperty("market_value")
                @ExcludeMissing
                fun marketValue(marketValue: JsonField<Double>) = apply {
                    this.marketValue = marketValue
                }

                /**
                 * The percentage market value of the instrument in terms of the total
                 * `net_market_value` of all positions held. Formula: `market_value /
                 * net_market_value`
                 */
                fun marketValuePercent(marketValuePercent: Double) =
                    marketValuePercent(JsonField.of(marketValuePercent))

                /**
                 * The percentage market value of the instrument in terms of the total
                 * `net_market_value` of all positions held. Formula: `market_value /
                 * net_market_value`
                 */
                @JsonProperty("market_value_percent")
                @ExcludeMissing
                fun marketValuePercent(marketValuePercent: JsonField<Double>) = apply {
                    this.marketValuePercent = marketValuePercent
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Member =
                    Member(
                        symbol,
                        assetClass,
                        quantity,
                        marketValue,
                        marketValuePercent,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class AssetClass
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AssetClass && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val OTHER = AssetClass(JsonField.of("other"))

                    @JvmField val EQUITY = AssetClass(JsonField.of("equity"))

                    @JvmField val OPTION = AssetClass(JsonField.of("option"))

                    @JvmField val DEBT = AssetClass(JsonField.of("debt"))

                    @JvmStatic fun of(value: String) = AssetClass(JsonField.of(value))
                }

                enum class Known {
                    OTHER,
                    EQUITY,
                    OPTION,
                    DEBT,
                }

                enum class Value {
                    OTHER,
                    EQUITY,
                    OPTION,
                    DEBT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        OTHER -> Value.OTHER
                        EQUITY -> Value.EQUITY
                        OPTION -> Value.OPTION
                        DEBT -> Value.DEBT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        OTHER -> Known.OTHER
                        EQUITY -> Known.EQUITY
                        OPTION -> Known.OPTION
                        DEBT -> Known.DEBT
                        else -> throw StudioSdkInvalidDataException("Unknown AssetClass: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }
}
