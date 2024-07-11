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
import java.util.Optional

@JsonDeserialize(builder = Entity.Builder::class)
@NoAutoDetect
class Entity
private constructor(
    private val entityId: JsonField<String>,
    private val legalName: JsonField<String>,
    private val clientCode: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Entity ID for the legal entity. */
    fun entityId(): String = entityId.getRequired("entity_id")

    fun legalName(): Optional<String> = Optional.ofNullable(legalName.getNullable("legal_name"))

    fun clientCode(): String = clientCode.getRequired("client_code")

    /** Entity ID for the legal entity. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

    @JsonProperty("legal_name") @ExcludeMissing fun _legalName() = legalName

    @JsonProperty("client_code") @ExcludeMissing fun _clientCode() = clientCode

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Entity = apply {
        if (!validated) {
            entityId()
            legalName()
            clientCode()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Entity &&
            this.entityId == other.entityId &&
            this.legalName == other.legalName &&
            this.clientCode == other.clientCode &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    entityId,
                    legalName,
                    clientCode,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Entity{entityId=$entityId, legalName=$legalName, clientCode=$clientCode, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var entityId: JsonField<String> = JsonMissing.of()
        private var legalName: JsonField<String> = JsonMissing.of()
        private var clientCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entity: Entity) = apply {
            this.entityId = entity.entityId
            this.legalName = entity.legalName
            this.clientCode = entity.clientCode
            additionalProperties(entity.additionalProperties)
        }

        /** Entity ID for the legal entity. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** Entity ID for the legal entity. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        fun legalName(legalName: String) = legalName(JsonField.of(legalName))

        @JsonProperty("legal_name")
        @ExcludeMissing
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        fun clientCode(clientCode: String) = clientCode(JsonField.of(clientCode))

        @JsonProperty("client_code")
        @ExcludeMissing
        fun clientCode(clientCode: JsonField<String>) = apply { this.clientCode = clientCode }

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

        fun build(): Entity =
            Entity(
                entityId,
                legalName,
                clientCode,
                additionalProperties.toUnmodifiable(),
            )
    }
}
