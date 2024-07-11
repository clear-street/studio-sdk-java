// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import com.studio_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityRetrieveParamsTest {

    @Test
    fun createEntityRetrieveParams() {
        EntityRetrieveParams.builder().entityId("x").build()
    }

    @Test
    fun getPathParam() {
        val params = EntityRetrieveParams.builder().entityId("x").build()
        assertThat(params).isNotNull
        // path param "entityId"
        assertThat(params.getPathParam(0)).isEqualTo("x")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
