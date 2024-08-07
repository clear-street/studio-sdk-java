// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import io.clearstreet.studio.client.StudioSdkClient
import io.clearstreet.studio.client.okhttp.StudioSdkOkHttpClient
import io.clearstreet.studio.core.jsonMapper
import io.clearstreet.studio.models.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: StudioSdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            StudioSdkOkHttpClient.builder()
                .bearerToken("My Bearer Token")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun entitiesRetrieveWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val params =
            EntityRetrieveParams.builder()
                .entityId("x")
                .additionalHeaders(additionalHeaders)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
            Entity.builder().clientCode("CLST").entityId("x").legalName("Clear Street").build()

        stubFor(
            get(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.entities().retrieve(params)

        verify(getRequestedFor(anyUrl()))
    }
}
