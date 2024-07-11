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

@JsonDeserialize(builder = RegtMarginSimulation.Builder::class)
@NoAutoDetect
class RegtMarginSimulation
private constructor(
    private val createdAt: JsonField<Long>,
    private val name: JsonField<String>,
    private val simulationId: JsonField<String>,
    private val before: JsonField<RegtMargin>,
    private val after: JsonField<RegtMargin>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Timestamp of when this simulation was created. */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /** Name of this simulation that you provided when creating it. */
    fun name(): String = name.getRequired("name")

    /** Unique ID for a simulation. */
    fun simulationId(): String = simulationId.getRequired("simulation_id")

    /** The margin calculation before applying simulated trades. */
    fun before(): RegtMargin = before.getRequired("before")

    /** The margin calculation after applying simulated trades. */
    fun after(): RegtMargin = after.getRequired("after")

    /** Timestamp of when this simulation was created. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** Name of this simulation that you provided when creating it. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** Unique ID for a simulation. */
    @JsonProperty("simulation_id") @ExcludeMissing fun _simulationId() = simulationId

    /** The margin calculation before applying simulated trades. */
    @JsonProperty("before") @ExcludeMissing fun _before() = before

    /** The margin calculation after applying simulated trades. */
    @JsonProperty("after") @ExcludeMissing fun _after() = after

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RegtMarginSimulation = apply {
        if (!validated) {
            createdAt()
            name()
            simulationId()
            before().validate()
            after().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RegtMarginSimulation &&
            this.createdAt == other.createdAt &&
            this.name == other.name &&
            this.simulationId == other.simulationId &&
            this.before == other.before &&
            this.after == other.after &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    createdAt,
                    name,
                    simulationId,
                    before,
                    after,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RegtMarginSimulation{createdAt=$createdAt, name=$name, simulationId=$simulationId, before=$before, after=$after, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<Long> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var simulationId: JsonField<String> = JsonMissing.of()
        private var before: JsonField<RegtMargin> = JsonMissing.of()
        private var after: JsonField<RegtMargin> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(regtMarginSimulation: RegtMarginSimulation) = apply {
            this.createdAt = regtMarginSimulation.createdAt
            this.name = regtMarginSimulation.name
            this.simulationId = regtMarginSimulation.simulationId
            this.before = regtMarginSimulation.before
            this.after = regtMarginSimulation.after
            additionalProperties(regtMarginSimulation.additionalProperties)
        }

        /** Timestamp of when this simulation was created. */
        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /** Timestamp of when this simulation was created. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        /** Name of this simulation that you provided when creating it. */
        fun name(name: String) = name(JsonField.of(name))

        /** Name of this simulation that you provided when creating it. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Unique ID for a simulation. */
        fun simulationId(simulationId: String) = simulationId(JsonField.of(simulationId))

        /** Unique ID for a simulation. */
        @JsonProperty("simulation_id")
        @ExcludeMissing
        fun simulationId(simulationId: JsonField<String>) = apply {
            this.simulationId = simulationId
        }

        /** The margin calculation before applying simulated trades. */
        fun before(before: RegtMargin) = before(JsonField.of(before))

        /** The margin calculation before applying simulated trades. */
        @JsonProperty("before")
        @ExcludeMissing
        fun before(before: JsonField<RegtMargin>) = apply { this.before = before }

        /** The margin calculation after applying simulated trades. */
        fun after(after: RegtMargin) = after(JsonField.of(after))

        /** The margin calculation after applying simulated trades. */
        @JsonProperty("after")
        @ExcludeMissing
        fun after(after: JsonField<RegtMargin>) = apply { this.after = after }

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

        fun build(): RegtMarginSimulation =
            RegtMarginSimulation(
                createdAt,
                name,
                simulationId,
                before,
                after,
                additionalProperties.toUnmodifiable(),
            )
    }
}
