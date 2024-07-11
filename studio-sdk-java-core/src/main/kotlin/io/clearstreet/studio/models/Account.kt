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

@JsonDeserialize(builder = Account.Builder::class)
@NoAutoDetect
class Account
private constructor(
    private val accountId: JsonField<String>,
    private val entityId: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Account ID for the account. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** Entity ID for the legal entity. */
    fun entityId(): String = entityId.getRequired("entity_id")

    fun name(): String = name.getRequired("name")

    /** Account ID for the account. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** Entity ID for the legal entity. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Account = apply {
        if (!validated) {
            accountId()
            entityId()
            name()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Account &&
            this.accountId == other.accountId &&
            this.entityId == other.entityId &&
            this.name == other.name &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    entityId,
                    name,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Account{accountId=$accountId, entityId=$entityId, name=$name, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            this.accountId = account.accountId
            this.entityId = account.entityId
            this.name = account.name
            additionalProperties(account.additionalProperties)
        }

        /** Account ID for the account. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** Account ID for the account. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** Entity ID for the legal entity. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** Entity ID for the legal entity. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): Account =
            Account(
                accountId,
                entityId,
                name,
                additionalProperties.toUnmodifiable(),
            )
    }
}
