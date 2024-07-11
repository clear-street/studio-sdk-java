// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun createAccount() {
        val account = Account.builder().accountId("x").entityId("x").name("Clear Street").build()
        assertThat(account).isNotNull
        assertThat(account.accountId()).isEqualTo("x")
        assertThat(account.entityId()).isEqualTo("x")
        assertThat(account.name()).isEqualTo("Clear Street")
    }
}
