// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.google.common.collect.ImmutableListMultimap
import com.google.common.collect.ListMultimap
import com.studio_sdk.api.client.StudioSdkClient
import com.studio_sdk.api.client.okhttp.StudioSdkOkHttpClient
import com.studio_sdk.api.core.JsonString
import com.studio_sdk.api.core.jsonMapper
import com.studio_sdk.api.errors.BadRequestException
import com.studio_sdk.api.errors.InternalServerException
import com.studio_sdk.api.errors.NotFoundException
import com.studio_sdk.api.errors.PermissionDeniedException
import com.studio_sdk.api.errors.RateLimitException
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.errors.StudioSdkException
import com.studio_sdk.api.errors.UnauthorizedException
import com.studio_sdk.api.errors.UnexpectedStatusCodeException
import com.studio_sdk.api.errors.UnprocessableEntityException
import com.studio_sdk.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.assertj.guava.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val STUDIO_SDK_ERROR: StudioSdkError =
        StudioSdkError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: StudioSdkClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            StudioSdkOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .bearerToken("My Bearer Token")
                .build()
    }

    @Test
    fun entitiesRetrieve200() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        val expected =
            Entity.builder().clientCode("CLST").entityId("x").legalName("Clear Street").build()

        stubFor(get(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.entities().retrieve(params)).isEqualTo(expected)
    }

    @Test
    fun entitiesRetrieve400() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(
            get(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(STUDIO_SDK_ERROR)))
        )

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of("Foo", "Bar"), STUDIO_SDK_ERROR)
            })
    }

    @Test
    fun entitiesRetrieve401() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(
            get(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(STUDIO_SDK_ERROR)))
        )

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertUnauthorized(e, ImmutableListMultimap.of("Foo", "Bar"), STUDIO_SDK_ERROR)
            })
    }

    @Test
    fun entitiesRetrieve403() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(
            get(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(STUDIO_SDK_ERROR)))
        )

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertPermissionDenied(e, ImmutableListMultimap.of("Foo", "Bar"), STUDIO_SDK_ERROR)
            })
    }

    @Test
    fun entitiesRetrieve404() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(
            get(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(STUDIO_SDK_ERROR)))
        )

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertNotFound(e, ImmutableListMultimap.of("Foo", "Bar"), STUDIO_SDK_ERROR)
            })
    }

    @Test
    fun entitiesRetrieve422() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(
            get(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(STUDIO_SDK_ERROR)))
        )

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    STUDIO_SDK_ERROR
                )
            })
    }

    @Test
    fun entitiesRetrieve429() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(
            get(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(STUDIO_SDK_ERROR)))
        )

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertRateLimit(e, ImmutableListMultimap.of("Foo", "Bar"), STUDIO_SDK_ERROR)
            })
    }

    @Test
    fun entitiesRetrieve500() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(
            get(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(STUDIO_SDK_ERROR)))
        )

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertInternalServer(e, ImmutableListMultimap.of("Foo", "Bar"), STUDIO_SDK_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(
            get(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(STUDIO_SDK_ERROR)))
        )

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    ImmutableListMultimap.of("Foo", "Bar"),
                    toJson(STUDIO_SDK_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(get(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(StudioSdkException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
        val params = EntityRetrieveParams.builder().entityId("x").build()

        stubFor(get(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.entities().retrieve(params) })
            .satisfies({ e ->
                assertBadRequest(e, ImmutableListMultimap.of(), StudioSdkError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: ListMultimap<String, String>,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertBadRequest(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: StudioSdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnauthorized(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: StudioSdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: StudioSdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertNotFound(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: StudioSdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: StudioSdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertRateLimit(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: StudioSdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }

    private fun assertInternalServer(
        throwable: Throwable,
        headers: ListMultimap<String, String>,
        error: StudioSdkError
    ) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers()).containsAllEntriesOf(headers)
            })
    }
}
