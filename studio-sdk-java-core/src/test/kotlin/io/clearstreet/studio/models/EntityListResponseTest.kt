// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityListResponseTest {

    @Test
    fun createEntityListResponse() {
        val entityListResponse =
            EntityListResponse.builder()
                .data(
                    listOf(
                        Entity.builder()
                            .clientCode("CLST")
                            .entityId("x")
                            .legalName("Clear Street")
                            .build()
                    )
                )
                .build()
        assertThat(entityListResponse).isNotNull
        assertThat(entityListResponse.data().get())
            .containsExactly(
                Entity.builder().clientCode("CLST").entityId("x").legalName("Clear Street").build()
            )
    }
}
