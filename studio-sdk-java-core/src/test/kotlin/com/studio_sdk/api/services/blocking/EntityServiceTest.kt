// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking

import com.studio_sdk.api.TestServerExtension
import com.studio_sdk.api.client.okhttp.StudioSdkOkHttpClient
import com.studio_sdk.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EntityServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entityService = client.entities()
        val entity = entityService.retrieve(EntityRetrieveParams.builder().entityId("x").build())
        println(entity)
        entity.validate()
    }

    @Test
    fun callList() {
        val client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val entityService = client.entities()
        val entityListResponse = entityService.list(EntityListParams.builder().build())
        println(entityListResponse)
        entityListResponse.validate()
    }
}
