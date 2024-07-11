// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking

import com.studio_sdk.api.TestServerExtension
import com.studio_sdk.api.client.okhttp.StudioSdkOkHttpClient
import com.studio_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val accountService = client.accounts()
        val account =
            accountService.retrieve(AccountRetrieveParams.builder().accountId("x").build())
        println(account)
        account.validate()
    }

    @Test
    fun callList() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val accountService = client.accounts()
        val accountListResponse = accountService.list(AccountListParams.builder().build())
        println(accountListResponse)
        accountListResponse.validate()
    }
}
