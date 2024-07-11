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

@JsonDeserialize(builder = PortfolioMargin.Builder::class)
@NoAutoDetect
class PortfolioMargin
private constructor(
    private val version: JsonField<String>,
    private val timestamp: JsonField<Long>,
    private val netMarketValue: JsonField<Double>,
    private val effectiveRequirement: JsonField<Double>,
    private val effeciveExcess: JsonField<Double>,
    private val houseRequirement: JsonField<Double>,
    private val houseExcess: JsonField<Double>,
    private val riskBasedRequirement: JsonField<Double>,
    private val riskBasedRequirementPercent: JsonField<Double>,
    private val nonMarginableRequirement: JsonField<Double>,
    private val nonMarginableRequirementPercent: JsonField<Double>,
    private val addOnRequirement: JsonField<Double>,
    private val addOnRequirementPercent: JsonField<Double>,
    private val liquidityAddOn: JsonField<Double>,
    private val liquidityAddOnPercent: JsonField<Double>,
    private val concentrationAddOn: JsonField<Double>,
    private val concentrationAddOnPercent: JsonField<Double>,
    private val discretionaryRequirement: JsonField<Double>,
    private val discretionaryRequirementPercent: JsonField<Double>,
    private val vegaRequirement: JsonField<Double>,
    private val groups: JsonField<List<Group>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique identifier for this margin calculation. */
    fun version(): Optional<String> = Optional.ofNullable(version.getNullable("version"))

    /** Timestamp of when this margin was calculated. */
    fun timestamp(): Optional<Long> = Optional.ofNullable(timestamp.getNullable("timestamp"))

    /** Sum of market values across all positions. */
    fun netMarketValue(): Optional<Double> =
        Optional.ofNullable(netMarketValue.getNullable("net_market_value"))

    /** The enforced margin requirement in effect. */
    fun effectiveRequirement(): Optional<Double> =
        Optional.ofNullable(effectiveRequirement.getNullable("effective_requirement"))

    /**
     * The maring amount by taking the difference between total equity and the effective
     * requirement. A negative number reflects an effective margin deficit.
     */
    fun effeciveExcess(): Optional<Double> =
        Optional.ofNullable(effeciveExcess.getNullable("effecive_excess"))

    /** Margin requirements based on Clear Street's house margin methodology. */
    fun houseRequirement(): Optional<Double> =
        Optional.ofNullable(houseRequirement.getNullable("house_requirement"))

    /**
     * The margin amount by taking the difference between total equity and the house requirement. A
     * negative number reflects a house margin deficit.
     */
    fun houseExcess(): Optional<Double> =
        Optional.ofNullable(houseExcess.getNullable("house_excess"))

    /**
     * A component margin requirement that captures base-case risk under house margin methodology.
     */
    fun riskBasedRequirement(): Optional<Double> =
        Optional.ofNullable(riskBasedRequirement.getNullable("risk_based_requirement"))

    /**
     * The percentage risk_base margin requirement in terms of total house requirement Formula:
     * `risk_based_requirement / house_requirement`
     */
    fun riskBasedRequirementPercent(): Optional<Double> =
        Optional.ofNullable(
            riskBasedRequirementPercent.getNullable("risk_based_requirement_percent")
        )

    /**
     * A component margin requirement that captures risk for security instruments that are not
     * margin eligible.
     */
    fun nonMarginableRequirement(): Optional<Double> =
        Optional.ofNullable(nonMarginableRequirement.getNullable("non_marginable_requirement"))

    /**
     * The percentage non-marginable requirement in terms of total house requirement Formula:
     * `non_marginable_requirement / house_requirement`
     */
    fun nonMarginableRequirementPercent(): Optional<Double> =
        Optional.ofNullable(
            nonMarginableRequirementPercent.getNullable("non_marginable_requirement_percent")
        )

    /**
     * Sum of add-on margin requirements. Formula: `liquidity_add_on + concentration_add_on +
     * discretionary_requirement`
     */
    fun addOnRequirement(): Optional<Double> =
        Optional.ofNullable(addOnRequirement.getNullable("add_on_requirement"))

    /**
     * The percentage add-on margin requirements in terms of total house requirement. Formula:
     * `add_on_requirement / house_requirement`
     */
    fun addOnRequirementPercent(): Optional<Double> =
        Optional.ofNullable(addOnRequirementPercent.getNullable("add_on_requirement_percent"))

    /**
     * A component margin requirement that captures risk based on liquidity, Market Cap, and Average
     * Daily Volume factors.
     */
    fun liquidityAddOn(): Optional<Double> =
        Optional.ofNullable(liquidityAddOn.getNullable("liquidity_add_on"))

    /**
     * The percentage liquidity add-on margin requirements in terms of total house requirement.
     * Formula: `liquidity_add_on / house_requirement`
     */
    fun liquidityAddOnPercent(): Optional<Double> =
        Optional.ofNullable(liquidityAddOnPercent.getNullable("liquidity_add_on_percent"))

    /**
     * A component margin requirement that captures risk based on gross exposure to total equity.
     */
    fun concentrationAddOn(): Optional<Double> =
        Optional.ofNullable(concentrationAddOn.getNullable("concentration_add_on"))

    /**
     * The percentage concentration add-on margin requirements in terms of total house requirement.
     * Formula: `concentration_add_on / house_requirement`
     */
    fun concentrationAddOnPercent(): Optional<Double> =
        Optional.ofNullable(concentrationAddOnPercent.getNullable("concentration_add_on_percent"))

    /** A component margin requirement that captures miscellaneous risk factors. */
    fun discretionaryRequirement(): Optional<Double> =
        Optional.ofNullable(discretionaryRequirement.getNullable("discretionary_requirement"))

    /**
     * The percentage discretionary margin requirements in terms of total house requirement Formula:
     * `discretionary_requirement / house_requirement`
     */
    fun discretionaryRequirementPercent(): Optional<Double> =
        Optional.ofNullable(
            discretionaryRequirementPercent.getNullable("discretionary_requirement_percent")
        )

    /** A component margin requirement that captures risk based on vega. */
    fun vegaRequirement(): Optional<Double> =
        Optional.ofNullable(vegaRequirement.getNullable("vega_requirement"))

    /** Portfolio margin groups */
    fun groups(): Optional<List<Group>> = Optional.ofNullable(groups.getNullable("groups"))

    /** Unique identifier for this margin calculation. */
    @JsonProperty("version") @ExcludeMissing fun _version() = version

    /** Timestamp of when this margin was calculated. */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

    /** Sum of market values across all positions. */
    @JsonProperty("net_market_value") @ExcludeMissing fun _netMarketValue() = netMarketValue

    /** The enforced margin requirement in effect. */
    @JsonProperty("effective_requirement")
    @ExcludeMissing
    fun _effectiveRequirement() = effectiveRequirement

    /**
     * The maring amount by taking the difference between total equity and the effective
     * requirement. A negative number reflects an effective margin deficit.
     */
    @JsonProperty("effecive_excess") @ExcludeMissing fun _effeciveExcess() = effeciveExcess

    /** Margin requirements based on Clear Street's house margin methodology. */
    @JsonProperty("house_requirement") @ExcludeMissing fun _houseRequirement() = houseRequirement

    /**
     * The margin amount by taking the difference between total equity and the house requirement. A
     * negative number reflects a house margin deficit.
     */
    @JsonProperty("house_excess") @ExcludeMissing fun _houseExcess() = houseExcess

    /**
     * A component margin requirement that captures base-case risk under house margin methodology.
     */
    @JsonProperty("risk_based_requirement")
    @ExcludeMissing
    fun _riskBasedRequirement() = riskBasedRequirement

    /**
     * The percentage risk_base margin requirement in terms of total house requirement Formula:
     * `risk_based_requirement / house_requirement`
     */
    @JsonProperty("risk_based_requirement_percent")
    @ExcludeMissing
    fun _riskBasedRequirementPercent() = riskBasedRequirementPercent

    /**
     * A component margin requirement that captures risk for security instruments that are not
     * margin eligible.
     */
    @JsonProperty("non_marginable_requirement")
    @ExcludeMissing
    fun _nonMarginableRequirement() = nonMarginableRequirement

    /**
     * The percentage non-marginable requirement in terms of total house requirement Formula:
     * `non_marginable_requirement / house_requirement`
     */
    @JsonProperty("non_marginable_requirement_percent")
    @ExcludeMissing
    fun _nonMarginableRequirementPercent() = nonMarginableRequirementPercent

    /**
     * Sum of add-on margin requirements. Formula: `liquidity_add_on + concentration_add_on +
     * discretionary_requirement`
     */
    @JsonProperty("add_on_requirement") @ExcludeMissing fun _addOnRequirement() = addOnRequirement

    /**
     * The percentage add-on margin requirements in terms of total house requirement. Formula:
     * `add_on_requirement / house_requirement`
     */
    @JsonProperty("add_on_requirement_percent")
    @ExcludeMissing
    fun _addOnRequirementPercent() = addOnRequirementPercent

    /**
     * A component margin requirement that captures risk based on liquidity, Market Cap, and Average
     * Daily Volume factors.
     */
    @JsonProperty("liquidity_add_on") @ExcludeMissing fun _liquidityAddOn() = liquidityAddOn

    /**
     * The percentage liquidity add-on margin requirements in terms of total house requirement.
     * Formula: `liquidity_add_on / house_requirement`
     */
    @JsonProperty("liquidity_add_on_percent")
    @ExcludeMissing
    fun _liquidityAddOnPercent() = liquidityAddOnPercent

    /**
     * A component margin requirement that captures risk based on gross exposure to total equity.
     */
    @JsonProperty("concentration_add_on")
    @ExcludeMissing
    fun _concentrationAddOn() = concentrationAddOn

    /**
     * The percentage concentration add-on margin requirements in terms of total house requirement.
     * Formula: `concentration_add_on / house_requirement`
     */
    @JsonProperty("concentration_add_on_percent")
    @ExcludeMissing
    fun _concentrationAddOnPercent() = concentrationAddOnPercent

    /** A component margin requirement that captures miscellaneous risk factors. */
    @JsonProperty("discretionary_requirement")
    @ExcludeMissing
    fun _discretionaryRequirement() = discretionaryRequirement

    /**
     * The percentage discretionary margin requirements in terms of total house requirement Formula:
     * `discretionary_requirement / house_requirement`
     */
    @JsonProperty("discretionary_requirement_percent")
    @ExcludeMissing
    fun _discretionaryRequirementPercent() = discretionaryRequirementPercent

    /** A component margin requirement that captures risk based on vega. */
    @JsonProperty("vega_requirement") @ExcludeMissing fun _vegaRequirement() = vegaRequirement

    /** Portfolio margin groups */
    @JsonProperty("groups") @ExcludeMissing fun _groups() = groups

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PortfolioMargin = apply {
        if (!validated) {
            version()
            timestamp()
            netMarketValue()
            effectiveRequirement()
            effeciveExcess()
            houseRequirement()
            houseExcess()
            riskBasedRequirement()
            riskBasedRequirementPercent()
            nonMarginableRequirement()
            nonMarginableRequirementPercent()
            addOnRequirement()
            addOnRequirementPercent()
            liquidityAddOn()
            liquidityAddOnPercent()
            concentrationAddOn()
            concentrationAddOnPercent()
            discretionaryRequirement()
            discretionaryRequirementPercent()
            vegaRequirement()
            groups().map { it.forEach { it.validate() } }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortfolioMargin &&
            this.version == other.version &&
            this.timestamp == other.timestamp &&
            this.netMarketValue == other.netMarketValue &&
            this.effectiveRequirement == other.effectiveRequirement &&
            this.effeciveExcess == other.effeciveExcess &&
            this.houseRequirement == other.houseRequirement &&
            this.houseExcess == other.houseExcess &&
            this.riskBasedRequirement == other.riskBasedRequirement &&
            this.riskBasedRequirementPercent == other.riskBasedRequirementPercent &&
            this.nonMarginableRequirement == other.nonMarginableRequirement &&
            this.nonMarginableRequirementPercent == other.nonMarginableRequirementPercent &&
            this.addOnRequirement == other.addOnRequirement &&
            this.addOnRequirementPercent == other.addOnRequirementPercent &&
            this.liquidityAddOn == other.liquidityAddOn &&
            this.liquidityAddOnPercent == other.liquidityAddOnPercent &&
            this.concentrationAddOn == other.concentrationAddOn &&
            this.concentrationAddOnPercent == other.concentrationAddOnPercent &&
            this.discretionaryRequirement == other.discretionaryRequirement &&
            this.discretionaryRequirementPercent == other.discretionaryRequirementPercent &&
            this.vegaRequirement == other.vegaRequirement &&
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
                    effeciveExcess,
                    houseRequirement,
                    houseExcess,
                    riskBasedRequirement,
                    riskBasedRequirementPercent,
                    nonMarginableRequirement,
                    nonMarginableRequirementPercent,
                    addOnRequirement,
                    addOnRequirementPercent,
                    liquidityAddOn,
                    liquidityAddOnPercent,
                    concentrationAddOn,
                    concentrationAddOnPercent,
                    discretionaryRequirement,
                    discretionaryRequirementPercent,
                    vegaRequirement,
                    groups,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PortfolioMargin{version=$version, timestamp=$timestamp, netMarketValue=$netMarketValue, effectiveRequirement=$effectiveRequirement, effeciveExcess=$effeciveExcess, houseRequirement=$houseRequirement, houseExcess=$houseExcess, riskBasedRequirement=$riskBasedRequirement, riskBasedRequirementPercent=$riskBasedRequirementPercent, nonMarginableRequirement=$nonMarginableRequirement, nonMarginableRequirementPercent=$nonMarginableRequirementPercent, addOnRequirement=$addOnRequirement, addOnRequirementPercent=$addOnRequirementPercent, liquidityAddOn=$liquidityAddOn, liquidityAddOnPercent=$liquidityAddOnPercent, concentrationAddOn=$concentrationAddOn, concentrationAddOnPercent=$concentrationAddOnPercent, discretionaryRequirement=$discretionaryRequirement, discretionaryRequirementPercent=$discretionaryRequirementPercent, vegaRequirement=$vegaRequirement, groups=$groups, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var version: JsonField<String> = JsonMissing.of()
        private var timestamp: JsonField<Long> = JsonMissing.of()
        private var netMarketValue: JsonField<Double> = JsonMissing.of()
        private var effectiveRequirement: JsonField<Double> = JsonMissing.of()
        private var effeciveExcess: JsonField<Double> = JsonMissing.of()
        private var houseRequirement: JsonField<Double> = JsonMissing.of()
        private var houseExcess: JsonField<Double> = JsonMissing.of()
        private var riskBasedRequirement: JsonField<Double> = JsonMissing.of()
        private var riskBasedRequirementPercent: JsonField<Double> = JsonMissing.of()
        private var nonMarginableRequirement: JsonField<Double> = JsonMissing.of()
        private var nonMarginableRequirementPercent: JsonField<Double> = JsonMissing.of()
        private var addOnRequirement: JsonField<Double> = JsonMissing.of()
        private var addOnRequirementPercent: JsonField<Double> = JsonMissing.of()
        private var liquidityAddOn: JsonField<Double> = JsonMissing.of()
        private var liquidityAddOnPercent: JsonField<Double> = JsonMissing.of()
        private var concentrationAddOn: JsonField<Double> = JsonMissing.of()
        private var concentrationAddOnPercent: JsonField<Double> = JsonMissing.of()
        private var discretionaryRequirement: JsonField<Double> = JsonMissing.of()
        private var discretionaryRequirementPercent: JsonField<Double> = JsonMissing.of()
        private var vegaRequirement: JsonField<Double> = JsonMissing.of()
        private var groups: JsonField<List<Group>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(portfolioMargin: PortfolioMargin) = apply {
            this.version = portfolioMargin.version
            this.timestamp = portfolioMargin.timestamp
            this.netMarketValue = portfolioMargin.netMarketValue
            this.effectiveRequirement = portfolioMargin.effectiveRequirement
            this.effeciveExcess = portfolioMargin.effeciveExcess
            this.houseRequirement = portfolioMargin.houseRequirement
            this.houseExcess = portfolioMargin.houseExcess
            this.riskBasedRequirement = portfolioMargin.riskBasedRequirement
            this.riskBasedRequirementPercent = portfolioMargin.riskBasedRequirementPercent
            this.nonMarginableRequirement = portfolioMargin.nonMarginableRequirement
            this.nonMarginableRequirementPercent = portfolioMargin.nonMarginableRequirementPercent
            this.addOnRequirement = portfolioMargin.addOnRequirement
            this.addOnRequirementPercent = portfolioMargin.addOnRequirementPercent
            this.liquidityAddOn = portfolioMargin.liquidityAddOn
            this.liquidityAddOnPercent = portfolioMargin.liquidityAddOnPercent
            this.concentrationAddOn = portfolioMargin.concentrationAddOn
            this.concentrationAddOnPercent = portfolioMargin.concentrationAddOnPercent
            this.discretionaryRequirement = portfolioMargin.discretionaryRequirement
            this.discretionaryRequirementPercent = portfolioMargin.discretionaryRequirementPercent
            this.vegaRequirement = portfolioMargin.vegaRequirement
            this.groups = portfolioMargin.groups
            additionalProperties(portfolioMargin.additionalProperties)
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

        /** Sum of market values across all positions. */
        fun netMarketValue(netMarketValue: Double) = netMarketValue(JsonField.of(netMarketValue))

        /** Sum of market values across all positions. */
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
        fun effeciveExcess(effeciveExcess: Double) = effeciveExcess(JsonField.of(effeciveExcess))

        /**
         * The maring amount by taking the difference between total equity and the effective
         * requirement. A negative number reflects an effective margin deficit.
         */
        @JsonProperty("effecive_excess")
        @ExcludeMissing
        fun effeciveExcess(effeciveExcess: JsonField<Double>) = apply {
            this.effeciveExcess = effeciveExcess
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

        /**
         * A component margin requirement that captures base-case risk under house margin
         * methodology.
         */
        fun riskBasedRequirement(riskBasedRequirement: Double) =
            riskBasedRequirement(JsonField.of(riskBasedRequirement))

        /**
         * A component margin requirement that captures base-case risk under house margin
         * methodology.
         */
        @JsonProperty("risk_based_requirement")
        @ExcludeMissing
        fun riskBasedRequirement(riskBasedRequirement: JsonField<Double>) = apply {
            this.riskBasedRequirement = riskBasedRequirement
        }

        /**
         * The percentage risk_base margin requirement in terms of total house requirement Formula:
         * `risk_based_requirement / house_requirement`
         */
        fun riskBasedRequirementPercent(riskBasedRequirementPercent: Double) =
            riskBasedRequirementPercent(JsonField.of(riskBasedRequirementPercent))

        /**
         * The percentage risk_base margin requirement in terms of total house requirement Formula:
         * `risk_based_requirement / house_requirement`
         */
        @JsonProperty("risk_based_requirement_percent")
        @ExcludeMissing
        fun riskBasedRequirementPercent(riskBasedRequirementPercent: JsonField<Double>) = apply {
            this.riskBasedRequirementPercent = riskBasedRequirementPercent
        }

        /**
         * A component margin requirement that captures risk for security instruments that are not
         * margin eligible.
         */
        fun nonMarginableRequirement(nonMarginableRequirement: Double) =
            nonMarginableRequirement(JsonField.of(nonMarginableRequirement))

        /**
         * A component margin requirement that captures risk for security instruments that are not
         * margin eligible.
         */
        @JsonProperty("non_marginable_requirement")
        @ExcludeMissing
        fun nonMarginableRequirement(nonMarginableRequirement: JsonField<Double>) = apply {
            this.nonMarginableRequirement = nonMarginableRequirement
        }

        /**
         * The percentage non-marginable requirement in terms of total house requirement Formula:
         * `non_marginable_requirement / house_requirement`
         */
        fun nonMarginableRequirementPercent(nonMarginableRequirementPercent: Double) =
            nonMarginableRequirementPercent(JsonField.of(nonMarginableRequirementPercent))

        /**
         * The percentage non-marginable requirement in terms of total house requirement Formula:
         * `non_marginable_requirement / house_requirement`
         */
        @JsonProperty("non_marginable_requirement_percent")
        @ExcludeMissing
        fun nonMarginableRequirementPercent(nonMarginableRequirementPercent: JsonField<Double>) =
            apply {
                this.nonMarginableRequirementPercent = nonMarginableRequirementPercent
            }

        /**
         * Sum of add-on margin requirements. Formula: `liquidity_add_on + concentration_add_on +
         * discretionary_requirement`
         */
        fun addOnRequirement(addOnRequirement: Double) =
            addOnRequirement(JsonField.of(addOnRequirement))

        /**
         * Sum of add-on margin requirements. Formula: `liquidity_add_on + concentration_add_on +
         * discretionary_requirement`
         */
        @JsonProperty("add_on_requirement")
        @ExcludeMissing
        fun addOnRequirement(addOnRequirement: JsonField<Double>) = apply {
            this.addOnRequirement = addOnRequirement
        }

        /**
         * The percentage add-on margin requirements in terms of total house requirement. Formula:
         * `add_on_requirement / house_requirement`
         */
        fun addOnRequirementPercent(addOnRequirementPercent: Double) =
            addOnRequirementPercent(JsonField.of(addOnRequirementPercent))

        /**
         * The percentage add-on margin requirements in terms of total house requirement. Formula:
         * `add_on_requirement / house_requirement`
         */
        @JsonProperty("add_on_requirement_percent")
        @ExcludeMissing
        fun addOnRequirementPercent(addOnRequirementPercent: JsonField<Double>) = apply {
            this.addOnRequirementPercent = addOnRequirementPercent
        }

        /**
         * A component margin requirement that captures risk based on liquidity, Market Cap, and
         * Average Daily Volume factors.
         */
        fun liquidityAddOn(liquidityAddOn: Double) = liquidityAddOn(JsonField.of(liquidityAddOn))

        /**
         * A component margin requirement that captures risk based on liquidity, Market Cap, and
         * Average Daily Volume factors.
         */
        @JsonProperty("liquidity_add_on")
        @ExcludeMissing
        fun liquidityAddOn(liquidityAddOn: JsonField<Double>) = apply {
            this.liquidityAddOn = liquidityAddOn
        }

        /**
         * The percentage liquidity add-on margin requirements in terms of total house requirement.
         * Formula: `liquidity_add_on / house_requirement`
         */
        fun liquidityAddOnPercent(liquidityAddOnPercent: Double) =
            liquidityAddOnPercent(JsonField.of(liquidityAddOnPercent))

        /**
         * The percentage liquidity add-on margin requirements in terms of total house requirement.
         * Formula: `liquidity_add_on / house_requirement`
         */
        @JsonProperty("liquidity_add_on_percent")
        @ExcludeMissing
        fun liquidityAddOnPercent(liquidityAddOnPercent: JsonField<Double>) = apply {
            this.liquidityAddOnPercent = liquidityAddOnPercent
        }

        /**
         * A component margin requirement that captures risk based on gross exposure to total
         * equity.
         */
        fun concentrationAddOn(concentrationAddOn: Double) =
            concentrationAddOn(JsonField.of(concentrationAddOn))

        /**
         * A component margin requirement that captures risk based on gross exposure to total
         * equity.
         */
        @JsonProperty("concentration_add_on")
        @ExcludeMissing
        fun concentrationAddOn(concentrationAddOn: JsonField<Double>) = apply {
            this.concentrationAddOn = concentrationAddOn
        }

        /**
         * The percentage concentration add-on margin requirements in terms of total house
         * requirement. Formula: `concentration_add_on / house_requirement`
         */
        fun concentrationAddOnPercent(concentrationAddOnPercent: Double) =
            concentrationAddOnPercent(JsonField.of(concentrationAddOnPercent))

        /**
         * The percentage concentration add-on margin requirements in terms of total house
         * requirement. Formula: `concentration_add_on / house_requirement`
         */
        @JsonProperty("concentration_add_on_percent")
        @ExcludeMissing
        fun concentrationAddOnPercent(concentrationAddOnPercent: JsonField<Double>) = apply {
            this.concentrationAddOnPercent = concentrationAddOnPercent
        }

        /** A component margin requirement that captures miscellaneous risk factors. */
        fun discretionaryRequirement(discretionaryRequirement: Double) =
            discretionaryRequirement(JsonField.of(discretionaryRequirement))

        /** A component margin requirement that captures miscellaneous risk factors. */
        @JsonProperty("discretionary_requirement")
        @ExcludeMissing
        fun discretionaryRequirement(discretionaryRequirement: JsonField<Double>) = apply {
            this.discretionaryRequirement = discretionaryRequirement
        }

        /**
         * The percentage discretionary margin requirements in terms of total house requirement
         * Formula: `discretionary_requirement / house_requirement`
         */
        fun discretionaryRequirementPercent(discretionaryRequirementPercent: Double) =
            discretionaryRequirementPercent(JsonField.of(discretionaryRequirementPercent))

        /**
         * The percentage discretionary margin requirements in terms of total house requirement
         * Formula: `discretionary_requirement / house_requirement`
         */
        @JsonProperty("discretionary_requirement_percent")
        @ExcludeMissing
        fun discretionaryRequirementPercent(discretionaryRequirementPercent: JsonField<Double>) =
            apply {
                this.discretionaryRequirementPercent = discretionaryRequirementPercent
            }

        /** A component margin requirement that captures risk based on vega. */
        fun vegaRequirement(vegaRequirement: Double) =
            vegaRequirement(JsonField.of(vegaRequirement))

        /** A component margin requirement that captures risk based on vega. */
        @JsonProperty("vega_requirement")
        @ExcludeMissing
        fun vegaRequirement(vegaRequirement: JsonField<Double>) = apply {
            this.vegaRequirement = vegaRequirement
        }

        /** Portfolio margin groups */
        fun groups(groups: List<Group>) = groups(JsonField.of(groups))

        /** Portfolio margin groups */
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

        fun build(): PortfolioMargin =
            PortfolioMargin(
                version,
                timestamp,
                netMarketValue,
                effectiveRequirement,
                effeciveExcess,
                houseRequirement,
                houseExcess,
                riskBasedRequirement,
                riskBasedRequirementPercent,
                nonMarginableRequirement,
                nonMarginableRequirementPercent,
                addOnRequirement,
                addOnRequirementPercent,
                liquidityAddOn,
                liquidityAddOnPercent,
                concentrationAddOn,
                concentrationAddOnPercent,
                discretionaryRequirement,
                discretionaryRequirementPercent,
                vegaRequirement,
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
        private val marginPercent: JsonField<Double>,
        private val marginPercentContribution: JsonField<Double>,
        private val riskBasedRequirement: JsonField<Double>,
        private val nonMarginableRequirement: JsonField<Double>,
        private val liquidityRequirement: JsonField<Double>,
        private val concentrationRequirement: JsonField<Double>,
        private val discretionaryRequirement: JsonField<Double>,
        private val regulatoryRequirement: JsonField<Double>,
        private val varRequirement: JsonField<Double>,
        private val shocks: JsonField<Shocks>,
        private val members: JsonField<List<Member>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Unique name of the group, typically the symbol of the underlier. */
        fun name(): String = name.getRequired("name")

        /** The aggregated market value of all instruments for the group. */
        fun marketValue(): Double = marketValue.getRequired("market_value")

        /**
         * The percentage market value of the group in terms of the total net_market_value of all
         * positions. Formula: `(market_value / net_market_value)`
         */
        fun marketValuePercent(): Double = marketValuePercent.getRequired("market_value_percent")

        /** The enforced margin requirement in effect for the group. */
        fun effectiveRequirement(): Double =
            effectiveRequirement.getRequired("effective_requirement")

        /**
         * The percentage effective margin requirement in terms of the group market value. Formula:
         * `(effective_requirement / net_market_value)`
         */
        fun marginPercent(): Double = marginPercent.getRequired("margin_percent")

        /**
         * The percentage effective margin requirement in terms of the total effective requirement.
         * Formula: `(effective_requirement / sum(effective_requirement))`
         */
        fun marginPercentContribution(): Double =
            marginPercentContribution.getRequired("margin_percent_contribution")

        /**
         * A component margin requirement that captures base-case risk for the group under house
         * margin methodology
         */
        fun riskBasedRequirement(): Optional<Double> =
            Optional.ofNullable(riskBasedRequirement.getNullable("risk_based_requirement"))

        /**
         * A component margin requirement that captures risk for the group that are not margin
         * eligible.
         */
        fun nonMarginableRequirement(): Optional<Double> =
            Optional.ofNullable(nonMarginableRequirement.getNullable("non_marginable_requirement"))

        /**
         * A component margin requirement that captures risk for the group based on liquidity,
         * Market Cap, and Average Daily Volume factors.
         */
        fun liquidityRequirement(): Optional<Double> =
            Optional.ofNullable(liquidityRequirement.getNullable("liquidity_requirement"))

        /**
         * A component margin requirement that captures risk for the group based on gross exposure
         * to total equity
         */
        fun concentrationRequirement(): Optional<Double> =
            Optional.ofNullable(concentrationRequirement.getNullable("concentration_requirement"))

        /**
         * A component margin requirement that captures miscellaneous risk factors for the group.
         */
        fun discretionaryRequirement(): Optional<Double> =
            Optional.ofNullable(discretionaryRequirement.getNullable("discretionary_requirement"))

        /** Margin requirements based on OCC TIMS regulatory margin methodology */
        fun regulatoryRequirement(): Optional<Double> =
            Optional.ofNullable(regulatoryRequirement.getNullable("regulatory_requirement"))

        /**
         * Margin requirements based on value-at-risk over any 5-day period in a 2 year historic
         * lookback
         */
        fun varRequirement(): Optional<Double> =
            Optional.ofNullable(varRequirement.getNullable("var_requirement"))

        /** Maps shock scenarios to their resulting pnl. */
        fun shocks(): Optional<Shocks> = Optional.ofNullable(shocks.getNullable("shocks"))

        /** A list of securities that comprise this group. */
        fun members(): List<Member> = members.getRequired("members")

        /** Unique name of the group, typically the symbol of the underlier. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The aggregated market value of all instruments for the group. */
        @JsonProperty("market_value") @ExcludeMissing fun _marketValue() = marketValue

        /**
         * The percentage market value of the group in terms of the total net_market_value of all
         * positions. Formula: `(market_value / net_market_value)`
         */
        @JsonProperty("market_value_percent")
        @ExcludeMissing
        fun _marketValuePercent() = marketValuePercent

        /** The enforced margin requirement in effect for the group. */
        @JsonProperty("effective_requirement")
        @ExcludeMissing
        fun _effectiveRequirement() = effectiveRequirement

        /**
         * The percentage effective margin requirement in terms of the group market value. Formula:
         * `(effective_requirement / net_market_value)`
         */
        @JsonProperty("margin_percent") @ExcludeMissing fun _marginPercent() = marginPercent

        /**
         * The percentage effective margin requirement in terms of the total effective requirement.
         * Formula: `(effective_requirement / sum(effective_requirement))`
         */
        @JsonProperty("margin_percent_contribution")
        @ExcludeMissing
        fun _marginPercentContribution() = marginPercentContribution

        /**
         * A component margin requirement that captures base-case risk for the group under house
         * margin methodology
         */
        @JsonProperty("risk_based_requirement")
        @ExcludeMissing
        fun _riskBasedRequirement() = riskBasedRequirement

        /**
         * A component margin requirement that captures risk for the group that are not margin
         * eligible.
         */
        @JsonProperty("non_marginable_requirement")
        @ExcludeMissing
        fun _nonMarginableRequirement() = nonMarginableRequirement

        /**
         * A component margin requirement that captures risk for the group based on liquidity,
         * Market Cap, and Average Daily Volume factors.
         */
        @JsonProperty("liquidity_requirement")
        @ExcludeMissing
        fun _liquidityRequirement() = liquidityRequirement

        /**
         * A component margin requirement that captures risk for the group based on gross exposure
         * to total equity
         */
        @JsonProperty("concentration_requirement")
        @ExcludeMissing
        fun _concentrationRequirement() = concentrationRequirement

        /**
         * A component margin requirement that captures miscellaneous risk factors for the group.
         */
        @JsonProperty("discretionary_requirement")
        @ExcludeMissing
        fun _discretionaryRequirement() = discretionaryRequirement

        /** Margin requirements based on OCC TIMS regulatory margin methodology */
        @JsonProperty("regulatory_requirement")
        @ExcludeMissing
        fun _regulatoryRequirement() = regulatoryRequirement

        /**
         * Margin requirements based on value-at-risk over any 5-day period in a 2 year historic
         * lookback
         */
        @JsonProperty("var_requirement") @ExcludeMissing fun _varRequirement() = varRequirement

        /** Maps shock scenarios to their resulting pnl. */
        @JsonProperty("shocks") @ExcludeMissing fun _shocks() = shocks

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
                marginPercent()
                marginPercentContribution()
                riskBasedRequirement()
                nonMarginableRequirement()
                liquidityRequirement()
                concentrationRequirement()
                discretionaryRequirement()
                regulatoryRequirement()
                varRequirement()
                shocks().map { it.validate() }
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
                this.marginPercent == other.marginPercent &&
                this.marginPercentContribution == other.marginPercentContribution &&
                this.riskBasedRequirement == other.riskBasedRequirement &&
                this.nonMarginableRequirement == other.nonMarginableRequirement &&
                this.liquidityRequirement == other.liquidityRequirement &&
                this.concentrationRequirement == other.concentrationRequirement &&
                this.discretionaryRequirement == other.discretionaryRequirement &&
                this.regulatoryRequirement == other.regulatoryRequirement &&
                this.varRequirement == other.varRequirement &&
                this.shocks == other.shocks &&
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
                        marginPercent,
                        marginPercentContribution,
                        riskBasedRequirement,
                        nonMarginableRequirement,
                        liquidityRequirement,
                        concentrationRequirement,
                        discretionaryRequirement,
                        regulatoryRequirement,
                        varRequirement,
                        shocks,
                        members,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Group{name=$name, marketValue=$marketValue, marketValuePercent=$marketValuePercent, effectiveRequirement=$effectiveRequirement, marginPercent=$marginPercent, marginPercentContribution=$marginPercentContribution, riskBasedRequirement=$riskBasedRequirement, nonMarginableRequirement=$nonMarginableRequirement, liquidityRequirement=$liquidityRequirement, concentrationRequirement=$concentrationRequirement, discretionaryRequirement=$discretionaryRequirement, regulatoryRequirement=$regulatoryRequirement, varRequirement=$varRequirement, shocks=$shocks, members=$members, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var marketValue: JsonField<Double> = JsonMissing.of()
            private var marketValuePercent: JsonField<Double> = JsonMissing.of()
            private var effectiveRequirement: JsonField<Double> = JsonMissing.of()
            private var marginPercent: JsonField<Double> = JsonMissing.of()
            private var marginPercentContribution: JsonField<Double> = JsonMissing.of()
            private var riskBasedRequirement: JsonField<Double> = JsonMissing.of()
            private var nonMarginableRequirement: JsonField<Double> = JsonMissing.of()
            private var liquidityRequirement: JsonField<Double> = JsonMissing.of()
            private var concentrationRequirement: JsonField<Double> = JsonMissing.of()
            private var discretionaryRequirement: JsonField<Double> = JsonMissing.of()
            private var regulatoryRequirement: JsonField<Double> = JsonMissing.of()
            private var varRequirement: JsonField<Double> = JsonMissing.of()
            private var shocks: JsonField<Shocks> = JsonMissing.of()
            private var members: JsonField<List<Member>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(group: Group) = apply {
                this.name = group.name
                this.marketValue = group.marketValue
                this.marketValuePercent = group.marketValuePercent
                this.effectiveRequirement = group.effectiveRequirement
                this.marginPercent = group.marginPercent
                this.marginPercentContribution = group.marginPercentContribution
                this.riskBasedRequirement = group.riskBasedRequirement
                this.nonMarginableRequirement = group.nonMarginableRequirement
                this.liquidityRequirement = group.liquidityRequirement
                this.concentrationRequirement = group.concentrationRequirement
                this.discretionaryRequirement = group.discretionaryRequirement
                this.regulatoryRequirement = group.regulatoryRequirement
                this.varRequirement = group.varRequirement
                this.shocks = group.shocks
                this.members = group.members
                additionalProperties(group.additionalProperties)
            }

            /** Unique name of the group, typically the symbol of the underlier. */
            fun name(name: String) = name(JsonField.of(name))

            /** Unique name of the group, typically the symbol of the underlier. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The aggregated market value of all instruments for the group. */
            fun marketValue(marketValue: Double) = marketValue(JsonField.of(marketValue))

            /** The aggregated market value of all instruments for the group. */
            @JsonProperty("market_value")
            @ExcludeMissing
            fun marketValue(marketValue: JsonField<Double>) = apply {
                this.marketValue = marketValue
            }

            /**
             * The percentage market value of the group in terms of the total net_market_value of
             * all positions. Formula: `(market_value / net_market_value)`
             */
            fun marketValuePercent(marketValuePercent: Double) =
                marketValuePercent(JsonField.of(marketValuePercent))

            /**
             * The percentage market value of the group in terms of the total net_market_value of
             * all positions. Formula: `(market_value / net_market_value)`
             */
            @JsonProperty("market_value_percent")
            @ExcludeMissing
            fun marketValuePercent(marketValuePercent: JsonField<Double>) = apply {
                this.marketValuePercent = marketValuePercent
            }

            /** The enforced margin requirement in effect for the group. */
            fun effectiveRequirement(effectiveRequirement: Double) =
                effectiveRequirement(JsonField.of(effectiveRequirement))

            /** The enforced margin requirement in effect for the group. */
            @JsonProperty("effective_requirement")
            @ExcludeMissing
            fun effectiveRequirement(effectiveRequirement: JsonField<Double>) = apply {
                this.effectiveRequirement = effectiveRequirement
            }

            /**
             * The percentage effective margin requirement in terms of the group market value.
             * Formula: `(effective_requirement / net_market_value)`
             */
            fun marginPercent(marginPercent: Double) = marginPercent(JsonField.of(marginPercent))

            /**
             * The percentage effective margin requirement in terms of the group market value.
             * Formula: `(effective_requirement / net_market_value)`
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

            /**
             * A component margin requirement that captures base-case risk for the group under house
             * margin methodology
             */
            fun riskBasedRequirement(riskBasedRequirement: Double) =
                riskBasedRequirement(JsonField.of(riskBasedRequirement))

            /**
             * A component margin requirement that captures base-case risk for the group under house
             * margin methodology
             */
            @JsonProperty("risk_based_requirement")
            @ExcludeMissing
            fun riskBasedRequirement(riskBasedRequirement: JsonField<Double>) = apply {
                this.riskBasedRequirement = riskBasedRequirement
            }

            /**
             * A component margin requirement that captures risk for the group that are not margin
             * eligible.
             */
            fun nonMarginableRequirement(nonMarginableRequirement: Double) =
                nonMarginableRequirement(JsonField.of(nonMarginableRequirement))

            /**
             * A component margin requirement that captures risk for the group that are not margin
             * eligible.
             */
            @JsonProperty("non_marginable_requirement")
            @ExcludeMissing
            fun nonMarginableRequirement(nonMarginableRequirement: JsonField<Double>) = apply {
                this.nonMarginableRequirement = nonMarginableRequirement
            }

            /**
             * A component margin requirement that captures risk for the group based on liquidity,
             * Market Cap, and Average Daily Volume factors.
             */
            fun liquidityRequirement(liquidityRequirement: Double) =
                liquidityRequirement(JsonField.of(liquidityRequirement))

            /**
             * A component margin requirement that captures risk for the group based on liquidity,
             * Market Cap, and Average Daily Volume factors.
             */
            @JsonProperty("liquidity_requirement")
            @ExcludeMissing
            fun liquidityRequirement(liquidityRequirement: JsonField<Double>) = apply {
                this.liquidityRequirement = liquidityRequirement
            }

            /**
             * A component margin requirement that captures risk for the group based on gross
             * exposure to total equity
             */
            fun concentrationRequirement(concentrationRequirement: Double) =
                concentrationRequirement(JsonField.of(concentrationRequirement))

            /**
             * A component margin requirement that captures risk for the group based on gross
             * exposure to total equity
             */
            @JsonProperty("concentration_requirement")
            @ExcludeMissing
            fun concentrationRequirement(concentrationRequirement: JsonField<Double>) = apply {
                this.concentrationRequirement = concentrationRequirement
            }

            /**
             * A component margin requirement that captures miscellaneous risk factors for the
             * group.
             */
            fun discretionaryRequirement(discretionaryRequirement: Double) =
                discretionaryRequirement(JsonField.of(discretionaryRequirement))

            /**
             * A component margin requirement that captures miscellaneous risk factors for the
             * group.
             */
            @JsonProperty("discretionary_requirement")
            @ExcludeMissing
            fun discretionaryRequirement(discretionaryRequirement: JsonField<Double>) = apply {
                this.discretionaryRequirement = discretionaryRequirement
            }

            /** Margin requirements based on OCC TIMS regulatory margin methodology */
            fun regulatoryRequirement(regulatoryRequirement: Double) =
                regulatoryRequirement(JsonField.of(regulatoryRequirement))

            /** Margin requirements based on OCC TIMS regulatory margin methodology */
            @JsonProperty("regulatory_requirement")
            @ExcludeMissing
            fun regulatoryRequirement(regulatoryRequirement: JsonField<Double>) = apply {
                this.regulatoryRequirement = regulatoryRequirement
            }

            /**
             * Margin requirements based on value-at-risk over any 5-day period in a 2 year historic
             * lookback
             */
            fun varRequirement(varRequirement: Double) =
                varRequirement(JsonField.of(varRequirement))

            /**
             * Margin requirements based on value-at-risk over any 5-day period in a 2 year historic
             * lookback
             */
            @JsonProperty("var_requirement")
            @ExcludeMissing
            fun varRequirement(varRequirement: JsonField<Double>) = apply {
                this.varRequirement = varRequirement
            }

            /** Maps shock scenarios to their resulting pnl. */
            fun shocks(shocks: Shocks) = shocks(JsonField.of(shocks))

            /** Maps shock scenarios to their resulting pnl. */
            @JsonProperty("shocks")
            @ExcludeMissing
            fun shocks(shocks: JsonField<Shocks>) = apply { this.shocks = shocks }

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
                    marginPercent,
                    marginPercentContribution,
                    riskBasedRequirement,
                    nonMarginableRequirement,
                    liquidityRequirement,
                    concentrationRequirement,
                    discretionaryRequirement,
                    regulatoryRequirement,
                    varRequirement,
                    shocks,
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
            private val shocks: JsonField<Shocks>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The symbol for the instrument. */
            fun symbol(): Optional<String> = Optional.ofNullable(symbol.getNullable("symbol"))

            /** The asset class of the symbol. */
            fun assetClass(): Optional<AssetClass> =
                Optional.ofNullable(assetClass.getNullable("asset_class"))

            /** The quantity held for this instrument. */
            fun quantity(): Optional<String> = Optional.ofNullable(quantity.getNullable("quantity"))

            /** Market value of the instrument. */
            fun marketValue(): Optional<Double> =
                Optional.ofNullable(marketValue.getNullable("market_value"))

            /**
             * The percentage market value of the instrument in terms of the total
             * `net_market_value` of all positions held. Formula: `market_value / net_market_value`
             */
            fun marketValuePercent(): Optional<Double> =
                Optional.ofNullable(marketValuePercent.getNullable("market_value_percent"))

            /** Maps shock scenarios to their resulting pnl. */
            fun shocks(): Optional<Shocks> = Optional.ofNullable(shocks.getNullable("shocks"))

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

            /** Maps shock scenarios to their resulting pnl. */
            @JsonProperty("shocks") @ExcludeMissing fun _shocks() = shocks

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
                    shocks().map { it.validate() }
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
                    this.shocks == other.shocks &&
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
                            shocks,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Member{symbol=$symbol, assetClass=$assetClass, quantity=$quantity, marketValue=$marketValue, marketValuePercent=$marketValuePercent, shocks=$shocks, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var symbol: JsonField<String> = JsonMissing.of()
                private var assetClass: JsonField<AssetClass> = JsonMissing.of()
                private var quantity: JsonField<String> = JsonMissing.of()
                private var marketValue: JsonField<Double> = JsonMissing.of()
                private var marketValuePercent: JsonField<Double> = JsonMissing.of()
                private var shocks: JsonField<Shocks> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(member: Member) = apply {
                    this.symbol = member.symbol
                    this.assetClass = member.assetClass
                    this.quantity = member.quantity
                    this.marketValue = member.marketValue
                    this.marketValuePercent = member.marketValuePercent
                    this.shocks = member.shocks
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

                /** Maps shock scenarios to their resulting pnl. */
                fun shocks(shocks: Shocks) = shocks(JsonField.of(shocks))

                /** Maps shock scenarios to their resulting pnl. */
                @JsonProperty("shocks")
                @ExcludeMissing
                fun shocks(shocks: JsonField<Shocks>) = apply { this.shocks = shocks }

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
                        shocks,
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

            /** Maps shock scenarios to their resulting pnl. */
            @JsonDeserialize(builder = Shocks.Builder::class)
            @NoAutoDetect
            class Shocks
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Shocks = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Shocks &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() = "Shocks{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(shocks: Shocks) = apply {
                        additionalProperties(shocks.additionalProperties)
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

                    fun build(): Shocks = Shocks(additionalProperties.toUnmodifiable())
                }
            }
        }

        /** Maps shock scenarios to their resulting pnl. */
        @JsonDeserialize(builder = Shocks.Builder::class)
        @NoAutoDetect
        class Shocks
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Shocks = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Shocks && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Shocks{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(shocks: Shocks) = apply {
                    additionalProperties(shocks.additionalProperties)
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

                fun build(): Shocks = Shocks(additionalProperties.toUnmodifiable())
            }
        }
    }
}
