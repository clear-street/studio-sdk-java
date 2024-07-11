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

@JsonDeserialize(builder = AccountPnlDetailListResponse.Builder::class)
@NoAutoDetect
class AccountPnlDetailListResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountPnlDetailListResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountPnlDetailListResponse &&
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
        "AccountPnlDetailListResponse{data=$data, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountPnlDetailListResponse: AccountPnlDetailListResponse) = apply {
            this.data = accountPnlDetailListResponse.data
            additionalProperties(accountPnlDetailListResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

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

        fun build(): AccountPnlDetailListResponse =
            AccountPnlDetailListResponse(
                data.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val timestamp: JsonField<Long>,
        private val entityId: JsonField<String>,
        private val accountId: JsonField<String>,
        private val symbol: JsonField<String>,
        private val symbolDescription: JsonField<String>,
        private val assetClass: JsonField<AssetClass>,
        private val dayPnl: JsonField<Double>,
        private val unrealizedPnl: JsonField<Double>,
        private val realizedPnl: JsonField<Double>,
        private val totalPnl: JsonField<Double>,
        private val overnightPnl: JsonField<Double>,
        private val totalFees: JsonField<Double>,
        private val netMarketValue: JsonField<Double>,
        private val grossMarketValue: JsonField<Double>,
        private val sodMarketValue: JsonField<Double>,
        private val quantity: JsonField<String>,
        private val sodQuantity: JsonField<String>,
        private val boughtQuantity: JsonField<String>,
        private val soldQuantity: JsonField<String>,
        private val buys: JsonField<Long>,
        private val sells: JsonField<Long>,
        private val price: JsonField<Double>,
        private val sodPrice: JsonField<Double>,
        private val underlier: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Milliseconds since epoch. */
        fun timestamp(): Long = timestamp.getRequired("timestamp")

        /** Name of the legal entity. */
        fun entityId(): String = entityId.getRequired("entity_id")

        /** Account ID for the account. */
        fun accountId(): String = accountId.getRequired("account_id")

        fun symbol(): String = symbol.getRequired("symbol")

        /** Description of the symbol. */
        fun symbolDescription(): String = symbolDescription.getRequired("symbol_description")

        /** The asset class of the symbol. */
        fun assetClass(): AssetClass = assetClass.getRequired("asset_class")

        /** Profit and loss from intraday trading activities. */
        fun dayPnl(): Double = dayPnl.getRequired("day_pnl")

        /** Profit and loss from market changes. */
        fun unrealizedPnl(): Double = unrealizedPnl.getRequired("unrealized_pnl")

        /** Profit and loss realized from position closing trading activity. */
        fun realizedPnl(): Double = realizedPnl.getRequired("realized_pnl")

        /** `realized_pnl + unrealized_pnl` */
        fun totalPnl(): Double = totalPnl.getRequired("total_pnl")

        /** Profit and loss from previous trading date. */
        fun overnightPnl(): Double = overnightPnl.getRequired("overnight_pnl")

        /** Total fees incurred from trading activities. */
        fun totalFees(): Double = totalFees.getRequired("total_fees")

        /** Market value net of long and short market values. */
        fun netMarketValue(): Double = netMarketValue.getRequired("net_market_value")

        /** Absolute market value of long and short market values. */
        fun grossMarketValue(): Double = grossMarketValue.getRequired("gross_market_value")

        /** Market value of a given instrument a the start of a trading day. */
        fun sodMarketValue(): Double = sodMarketValue.getRequired("sod_market_value")

        /** String representation of quantity. */
        fun quantity(): String = quantity.getRequired("quantity")

        /** Quantity of a given instrument at the start of a trading day. */
        fun sodQuantity(): String = sodQuantity.getRequired("sod_quantity")

        /** Quantity of a given instrument bought. */
        fun boughtQuantity(): String = boughtQuantity.getRequired("bought_quantity")

        /** Quantity of a given instrument sold. */
        fun soldQuantity(): String = soldQuantity.getRequired("sold_quantity")

        /** Total buys of a given instrument. */
        fun buys(): Long = buys.getRequired("buys")

        /** Total sells of a given instrument. */
        fun sells(): Long = sells.getRequired("sells")

        /** Price used in this pnl calculation. */
        fun price(): Double = price.getRequired("price")

        /** Price at the start of a trading day. */
        fun sodPrice(): Double = sodPrice.getRequired("sod_price")

        /** The underlying instrument. */
        fun underlier(): String = underlier.getRequired("underlier")

        /** Milliseconds since epoch. */
        @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

        /** Name of the legal entity. */
        @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

        /** Account ID for the account. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        @JsonProperty("symbol") @ExcludeMissing fun _symbol() = symbol

        /** Description of the symbol. */
        @JsonProperty("symbol_description")
        @ExcludeMissing
        fun _symbolDescription() = symbolDescription

        /** The asset class of the symbol. */
        @JsonProperty("asset_class") @ExcludeMissing fun _assetClass() = assetClass

        /** Profit and loss from intraday trading activities. */
        @JsonProperty("day_pnl") @ExcludeMissing fun _dayPnl() = dayPnl

        /** Profit and loss from market changes. */
        @JsonProperty("unrealized_pnl") @ExcludeMissing fun _unrealizedPnl() = unrealizedPnl

        /** Profit and loss realized from position closing trading activity. */
        @JsonProperty("realized_pnl") @ExcludeMissing fun _realizedPnl() = realizedPnl

        /** `realized_pnl + unrealized_pnl` */
        @JsonProperty("total_pnl") @ExcludeMissing fun _totalPnl() = totalPnl

        /** Profit and loss from previous trading date. */
        @JsonProperty("overnight_pnl") @ExcludeMissing fun _overnightPnl() = overnightPnl

        /** Total fees incurred from trading activities. */
        @JsonProperty("total_fees") @ExcludeMissing fun _totalFees() = totalFees

        /** Market value net of long and short market values. */
        @JsonProperty("net_market_value") @ExcludeMissing fun _netMarketValue() = netMarketValue

        /** Absolute market value of long and short market values. */
        @JsonProperty("gross_market_value")
        @ExcludeMissing
        fun _grossMarketValue() = grossMarketValue

        /** Market value of a given instrument a the start of a trading day. */
        @JsonProperty("sod_market_value") @ExcludeMissing fun _sodMarketValue() = sodMarketValue

        /** String representation of quantity. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        /** Quantity of a given instrument at the start of a trading day. */
        @JsonProperty("sod_quantity") @ExcludeMissing fun _sodQuantity() = sodQuantity

        /** Quantity of a given instrument bought. */
        @JsonProperty("bought_quantity") @ExcludeMissing fun _boughtQuantity() = boughtQuantity

        /** Quantity of a given instrument sold. */
        @JsonProperty("sold_quantity") @ExcludeMissing fun _soldQuantity() = soldQuantity

        /** Total buys of a given instrument. */
        @JsonProperty("buys") @ExcludeMissing fun _buys() = buys

        /** Total sells of a given instrument. */
        @JsonProperty("sells") @ExcludeMissing fun _sells() = sells

        /** Price used in this pnl calculation. */
        @JsonProperty("price") @ExcludeMissing fun _price() = price

        /** Price at the start of a trading day. */
        @JsonProperty("sod_price") @ExcludeMissing fun _sodPrice() = sodPrice

        /** The underlying instrument. */
        @JsonProperty("underlier") @ExcludeMissing fun _underlier() = underlier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                timestamp()
                entityId()
                accountId()
                symbol()
                symbolDescription()
                assetClass()
                dayPnl()
                unrealizedPnl()
                realizedPnl()
                totalPnl()
                overnightPnl()
                totalFees()
                netMarketValue()
                grossMarketValue()
                sodMarketValue()
                quantity()
                sodQuantity()
                boughtQuantity()
                soldQuantity()
                buys()
                sells()
                price()
                sodPrice()
                underlier()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.timestamp == other.timestamp &&
                this.entityId == other.entityId &&
                this.accountId == other.accountId &&
                this.symbol == other.symbol &&
                this.symbolDescription == other.symbolDescription &&
                this.assetClass == other.assetClass &&
                this.dayPnl == other.dayPnl &&
                this.unrealizedPnl == other.unrealizedPnl &&
                this.realizedPnl == other.realizedPnl &&
                this.totalPnl == other.totalPnl &&
                this.overnightPnl == other.overnightPnl &&
                this.totalFees == other.totalFees &&
                this.netMarketValue == other.netMarketValue &&
                this.grossMarketValue == other.grossMarketValue &&
                this.sodMarketValue == other.sodMarketValue &&
                this.quantity == other.quantity &&
                this.sodQuantity == other.sodQuantity &&
                this.boughtQuantity == other.boughtQuantity &&
                this.soldQuantity == other.soldQuantity &&
                this.buys == other.buys &&
                this.sells == other.sells &&
                this.price == other.price &&
                this.sodPrice == other.sodPrice &&
                this.underlier == other.underlier &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        timestamp,
                        entityId,
                        accountId,
                        symbol,
                        symbolDescription,
                        assetClass,
                        dayPnl,
                        unrealizedPnl,
                        realizedPnl,
                        totalPnl,
                        overnightPnl,
                        totalFees,
                        netMarketValue,
                        grossMarketValue,
                        sodMarketValue,
                        quantity,
                        sodQuantity,
                        boughtQuantity,
                        soldQuantity,
                        buys,
                        sells,
                        price,
                        sodPrice,
                        underlier,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{timestamp=$timestamp, entityId=$entityId, accountId=$accountId, symbol=$symbol, symbolDescription=$symbolDescription, assetClass=$assetClass, dayPnl=$dayPnl, unrealizedPnl=$unrealizedPnl, realizedPnl=$realizedPnl, totalPnl=$totalPnl, overnightPnl=$overnightPnl, totalFees=$totalFees, netMarketValue=$netMarketValue, grossMarketValue=$grossMarketValue, sodMarketValue=$sodMarketValue, quantity=$quantity, sodQuantity=$sodQuantity, boughtQuantity=$boughtQuantity, soldQuantity=$soldQuantity, buys=$buys, sells=$sells, price=$price, sodPrice=$sodPrice, underlier=$underlier, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var timestamp: JsonField<Long> = JsonMissing.of()
            private var entityId: JsonField<String> = JsonMissing.of()
            private var accountId: JsonField<String> = JsonMissing.of()
            private var symbol: JsonField<String> = JsonMissing.of()
            private var symbolDescription: JsonField<String> = JsonMissing.of()
            private var assetClass: JsonField<AssetClass> = JsonMissing.of()
            private var dayPnl: JsonField<Double> = JsonMissing.of()
            private var unrealizedPnl: JsonField<Double> = JsonMissing.of()
            private var realizedPnl: JsonField<Double> = JsonMissing.of()
            private var totalPnl: JsonField<Double> = JsonMissing.of()
            private var overnightPnl: JsonField<Double> = JsonMissing.of()
            private var totalFees: JsonField<Double> = JsonMissing.of()
            private var netMarketValue: JsonField<Double> = JsonMissing.of()
            private var grossMarketValue: JsonField<Double> = JsonMissing.of()
            private var sodMarketValue: JsonField<Double> = JsonMissing.of()
            private var quantity: JsonField<String> = JsonMissing.of()
            private var sodQuantity: JsonField<String> = JsonMissing.of()
            private var boughtQuantity: JsonField<String> = JsonMissing.of()
            private var soldQuantity: JsonField<String> = JsonMissing.of()
            private var buys: JsonField<Long> = JsonMissing.of()
            private var sells: JsonField<Long> = JsonMissing.of()
            private var price: JsonField<Double> = JsonMissing.of()
            private var sodPrice: JsonField<Double> = JsonMissing.of()
            private var underlier: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.timestamp = data.timestamp
                this.entityId = data.entityId
                this.accountId = data.accountId
                this.symbol = data.symbol
                this.symbolDescription = data.symbolDescription
                this.assetClass = data.assetClass
                this.dayPnl = data.dayPnl
                this.unrealizedPnl = data.unrealizedPnl
                this.realizedPnl = data.realizedPnl
                this.totalPnl = data.totalPnl
                this.overnightPnl = data.overnightPnl
                this.totalFees = data.totalFees
                this.netMarketValue = data.netMarketValue
                this.grossMarketValue = data.grossMarketValue
                this.sodMarketValue = data.sodMarketValue
                this.quantity = data.quantity
                this.sodQuantity = data.sodQuantity
                this.boughtQuantity = data.boughtQuantity
                this.soldQuantity = data.soldQuantity
                this.buys = data.buys
                this.sells = data.sells
                this.price = data.price
                this.sodPrice = data.sodPrice
                this.underlier = data.underlier
                additionalProperties(data.additionalProperties)
            }

            /** Milliseconds since epoch. */
            fun timestamp(timestamp: Long) = timestamp(JsonField.of(timestamp))

            /** Milliseconds since epoch. */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun timestamp(timestamp: JsonField<Long>) = apply { this.timestamp = timestamp }

            /** Name of the legal entity. */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /** Name of the legal entity. */
            @JsonProperty("entity_id")
            @ExcludeMissing
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

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

            /** Description of the symbol. */
            fun symbolDescription(symbolDescription: String) =
                symbolDescription(JsonField.of(symbolDescription))

            /** Description of the symbol. */
            @JsonProperty("symbol_description")
            @ExcludeMissing
            fun symbolDescription(symbolDescription: JsonField<String>) = apply {
                this.symbolDescription = symbolDescription
            }

            /** The asset class of the symbol. */
            fun assetClass(assetClass: AssetClass) = assetClass(JsonField.of(assetClass))

            /** The asset class of the symbol. */
            @JsonProperty("asset_class")
            @ExcludeMissing
            fun assetClass(assetClass: JsonField<AssetClass>) = apply {
                this.assetClass = assetClass
            }

            /** Profit and loss from intraday trading activities. */
            fun dayPnl(dayPnl: Double) = dayPnl(JsonField.of(dayPnl))

            /** Profit and loss from intraday trading activities. */
            @JsonProperty("day_pnl")
            @ExcludeMissing
            fun dayPnl(dayPnl: JsonField<Double>) = apply { this.dayPnl = dayPnl }

            /** Profit and loss from market changes. */
            fun unrealizedPnl(unrealizedPnl: Double) = unrealizedPnl(JsonField.of(unrealizedPnl))

            /** Profit and loss from market changes. */
            @JsonProperty("unrealized_pnl")
            @ExcludeMissing
            fun unrealizedPnl(unrealizedPnl: JsonField<Double>) = apply {
                this.unrealizedPnl = unrealizedPnl
            }

            /** Profit and loss realized from position closing trading activity. */
            fun realizedPnl(realizedPnl: Double) = realizedPnl(JsonField.of(realizedPnl))

            /** Profit and loss realized from position closing trading activity. */
            @JsonProperty("realized_pnl")
            @ExcludeMissing
            fun realizedPnl(realizedPnl: JsonField<Double>) = apply {
                this.realizedPnl = realizedPnl
            }

            /** `realized_pnl + unrealized_pnl` */
            fun totalPnl(totalPnl: Double) = totalPnl(JsonField.of(totalPnl))

            /** `realized_pnl + unrealized_pnl` */
            @JsonProperty("total_pnl")
            @ExcludeMissing
            fun totalPnl(totalPnl: JsonField<Double>) = apply { this.totalPnl = totalPnl }

            /** Profit and loss from previous trading date. */
            fun overnightPnl(overnightPnl: Double) = overnightPnl(JsonField.of(overnightPnl))

            /** Profit and loss from previous trading date. */
            @JsonProperty("overnight_pnl")
            @ExcludeMissing
            fun overnightPnl(overnightPnl: JsonField<Double>) = apply {
                this.overnightPnl = overnightPnl
            }

            /** Total fees incurred from trading activities. */
            fun totalFees(totalFees: Double) = totalFees(JsonField.of(totalFees))

            /** Total fees incurred from trading activities. */
            @JsonProperty("total_fees")
            @ExcludeMissing
            fun totalFees(totalFees: JsonField<Double>) = apply { this.totalFees = totalFees }

            /** Market value net of long and short market values. */
            fun netMarketValue(netMarketValue: Double) =
                netMarketValue(JsonField.of(netMarketValue))

            /** Market value net of long and short market values. */
            @JsonProperty("net_market_value")
            @ExcludeMissing
            fun netMarketValue(netMarketValue: JsonField<Double>) = apply {
                this.netMarketValue = netMarketValue
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

            /** Market value of a given instrument a the start of a trading day. */
            fun sodMarketValue(sodMarketValue: Double) =
                sodMarketValue(JsonField.of(sodMarketValue))

            /** Market value of a given instrument a the start of a trading day. */
            @JsonProperty("sod_market_value")
            @ExcludeMissing
            fun sodMarketValue(sodMarketValue: JsonField<Double>) = apply {
                this.sodMarketValue = sodMarketValue
            }

            /** String representation of quantity. */
            fun quantity(quantity: String) = quantity(JsonField.of(quantity))

            /** String representation of quantity. */
            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

            /** Quantity of a given instrument at the start of a trading day. */
            fun sodQuantity(sodQuantity: String) = sodQuantity(JsonField.of(sodQuantity))

            /** Quantity of a given instrument at the start of a trading day. */
            @JsonProperty("sod_quantity")
            @ExcludeMissing
            fun sodQuantity(sodQuantity: JsonField<String>) = apply {
                this.sodQuantity = sodQuantity
            }

            /** Quantity of a given instrument bought. */
            fun boughtQuantity(boughtQuantity: String) =
                boughtQuantity(JsonField.of(boughtQuantity))

            /** Quantity of a given instrument bought. */
            @JsonProperty("bought_quantity")
            @ExcludeMissing
            fun boughtQuantity(boughtQuantity: JsonField<String>) = apply {
                this.boughtQuantity = boughtQuantity
            }

            /** Quantity of a given instrument sold. */
            fun soldQuantity(soldQuantity: String) = soldQuantity(JsonField.of(soldQuantity))

            /** Quantity of a given instrument sold. */
            @JsonProperty("sold_quantity")
            @ExcludeMissing
            fun soldQuantity(soldQuantity: JsonField<String>) = apply {
                this.soldQuantity = soldQuantity
            }

            /** Total buys of a given instrument. */
            fun buys(buys: Long) = buys(JsonField.of(buys))

            /** Total buys of a given instrument. */
            @JsonProperty("buys")
            @ExcludeMissing
            fun buys(buys: JsonField<Long>) = apply { this.buys = buys }

            /** Total sells of a given instrument. */
            fun sells(sells: Long) = sells(JsonField.of(sells))

            /** Total sells of a given instrument. */
            @JsonProperty("sells")
            @ExcludeMissing
            fun sells(sells: JsonField<Long>) = apply { this.sells = sells }

            /** Price used in this pnl calculation. */
            fun price(price: Double) = price(JsonField.of(price))

            /** Price used in this pnl calculation. */
            @JsonProperty("price")
            @ExcludeMissing
            fun price(price: JsonField<Double>) = apply { this.price = price }

            /** Price at the start of a trading day. */
            fun sodPrice(sodPrice: Double) = sodPrice(JsonField.of(sodPrice))

            /** Price at the start of a trading day. */
            @JsonProperty("sod_price")
            @ExcludeMissing
            fun sodPrice(sodPrice: JsonField<Double>) = apply { this.sodPrice = sodPrice }

            /** The underlying instrument. */
            fun underlier(underlier: String) = underlier(JsonField.of(underlier))

            /** The underlying instrument. */
            @JsonProperty("underlier")
            @ExcludeMissing
            fun underlier(underlier: JsonField<String>) = apply { this.underlier = underlier }

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
                    timestamp,
                    entityId,
                    accountId,
                    symbol,
                    symbolDescription,
                    assetClass,
                    dayPnl,
                    unrealizedPnl,
                    realizedPnl,
                    totalPnl,
                    overnightPnl,
                    totalFees,
                    netMarketValue,
                    grossMarketValue,
                    sodMarketValue,
                    quantity,
                    sodQuantity,
                    boughtQuantity,
                    soldQuantity,
                    buys,
                    sells,
                    price,
                    sodPrice,
                    underlier,
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
