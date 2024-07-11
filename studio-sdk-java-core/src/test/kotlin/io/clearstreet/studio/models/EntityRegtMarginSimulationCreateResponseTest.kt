// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityRegtMarginSimulationCreateResponseTest {

    @Test
    fun createEntityRegtMarginSimulationCreateResponse() {
        val entityRegtMarginSimulationCreateResponse =
            EntityRegtMarginSimulationCreateResponse.builder()
                .simulationId("6460030d-8ed4-19d3-818e-e87b36e90005")
                .build()
        assertThat(entityRegtMarginSimulationCreateResponse).isNotNull
        assertThat(entityRegtMarginSimulationCreateResponse.simulationId())
            .isEqualTo("6460030d-8ed4-19d3-818e-e87b36e90005")
    }
}
