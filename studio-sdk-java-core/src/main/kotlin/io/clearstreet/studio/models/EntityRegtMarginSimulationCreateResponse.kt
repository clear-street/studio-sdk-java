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

@JsonDeserialize(builder = EntityRegtMarginSimulationCreateResponse.Builder::class)
@NoAutoDetect
class EntityRegtMarginSimulationCreateResponse
private constructor(
    private val simulationId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Unique ID for a simulation. */
    fun simulationId(): String = simulationId.getRequired("simulation_id")

    /** Unique ID for a simulation. */
    @JsonProperty("simulation_id") @ExcludeMissing fun _simulationId() = simulationId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EntityRegtMarginSimulationCreateResponse = apply {
        if (!validated) {
            simulationId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntityRegtMarginSimulationCreateResponse &&
            this.simulationId == other.simulationId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(simulationId, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "EntityRegtMarginSimulationCreateResponse{simulationId=$simulationId, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var simulationId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            entityRegtMarginSimulationCreateResponse: EntityRegtMarginSimulationCreateResponse
        ) = apply {
            this.simulationId = entityRegtMarginSimulationCreateResponse.simulationId
            additionalProperties(entityRegtMarginSimulationCreateResponse.additionalProperties)
        }

        /** Unique ID for a simulation. */
        fun simulationId(simulationId: String) = simulationId(JsonField.of(simulationId))

        /** Unique ID for a simulation. */
        @JsonProperty("simulation_id")
        @ExcludeMissing
        fun simulationId(simulationId: JsonField<String>) = apply {
            this.simulationId = simulationId
        }

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

        fun build(): EntityRegtMarginSimulationCreateResponse =
            EntityRegtMarginSimulationCreateResponse(
                simulationId,
                additionalProperties.toUnmodifiable()
            )
    }
}
