// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityRegtMarginSimulationRetrieveParamsTest {

    @Test
    fun createEntityRegtMarginSimulationRetrieveParams() {
        EntityRegtMarginSimulationRetrieveParams.builder()
            .entityId("x")
            .simulationId("6460030d-8ed4-19d3-818e-e87b36e90005")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            EntityRegtMarginSimulationRetrieveParams.builder()
                .entityId("x")
                .simulationId("6460030d-8ed4-19d3-818e-e87b36e90005")
                .build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // path param "simulationId"
        assertThat(params.getPathParam(1)).isEqualTo("6460030d-8ed4-19d3-818e-e87b36e90005")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
