// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.TestServerExtension
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.models.*
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
