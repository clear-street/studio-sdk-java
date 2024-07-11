// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import io.clearstreet.studio.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityPnlSummaryRetrieveParamsTest {

    @Test
    fun createEntityPnlSummaryRetrieveParams() {
        EntityPnlSummaryRetrieveParams.builder().entityId("x").build()
    }

    @Test
    fun getPathParam() {
        val params = EntityPnlSummaryRetrieveParams.builder().entityId("x").build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
