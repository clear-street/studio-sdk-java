// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PositionTest {

    @Test
    fun createPosition() {
        val position = Position.builder().accountId("x").quantity("x").symbol("AAPL").build()
        assertThat(position).isNotNull
        assertThat(position.accountId()).contains("x")
        assertThat(position.quantity()).contains("x")
        assertThat(position.symbol()).contains("AAPL")
    }
}
