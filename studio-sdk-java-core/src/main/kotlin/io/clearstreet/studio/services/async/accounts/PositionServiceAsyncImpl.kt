// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.AccountPositionListParams
import io.clearstreet.studio.models.AccountPositionListResponse
import io.clearstreet.studio.models.AccountPositionRetrieveParams
import io.clearstreet.studio.models.Position
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PositionServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PositionServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Position> =
        jsonHandler<Position>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get current positions for a given account for a given symbol. */
    override fun retrieve(
        params: AccountPositionRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Position> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "accounts",
                    params.getPathParam(0),
                    "positions",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AccountPositionListResponse> =
        jsonHandler<AccountPositionListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List current positions for a given account. */
    override fun list(
        params: AccountPositionListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountPositionListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "positions")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
