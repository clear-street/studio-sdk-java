// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking.accounts

import com.studio_sdk.api.TestServerExtension
import com.studio_sdk.api.client.okhttp.StudioSdkOkHttpClient
import com.studio_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EasyBorrowServiceTest {

    @Test
    fun callList() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val easyBorrowService = client.accounts().easyBorrows()
        val accountEasyBorrowListResponse =
            easyBorrowService.list(AccountEasyBorrowListParams.builder().accountId("x").build())
        println(accountEasyBorrowListResponse)
        accountEasyBorrowListResponse.validate()
    }
}
