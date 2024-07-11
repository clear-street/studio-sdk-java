// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityTest {

    @Test
    fun createEntity() {
        val entity =
            Entity.builder().clientCode("CLST").entityId("x").legalName("Clear Street").build()
        assertThat(entity).isNotNull
        assertThat(entity.clientCode()).isEqualTo("CLST")
        assertThat(entity.entityId()).isEqualTo("x")
        assertThat(entity.legalName()).contains("Clear Street")
    }
}
