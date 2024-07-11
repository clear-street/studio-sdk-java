// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.AccountLocateOrderCreateParams
import io.clearstreet.studio.models.AccountLocateOrderListParams
import io.clearstreet.studio.models.AccountLocateOrderListResponse
import io.clearstreet.studio.models.AccountLocateOrderRetrieveParams
import io.clearstreet.studio.models.AccountLocateOrderUpdateParams
import io.clearstreet.studio.models.LocateOrder
import io.clearstreet.studio.services.emptyHandler
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.json
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class LocateOrderServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LocateOrderServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LocateOrder> =
        jsonHandler<LocateOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create locate order to borrow inventory for short-selling. */
    override fun create(
        params: AccountLocateOrderCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LocateOrder> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("accounts", params.getPathParam(0), "locate-orders")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<LocateOrder> =
        jsonHandler<LocateOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get locate order by its unique locate order ID. */
    override fun retrieve(
        params: AccountLocateOrderRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LocateOrder> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "accounts",
                    params.getPathParam(0),
                    "locate-orders",
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

    private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Accept or decline locate order that has been offered. */
    override fun update(
        params: AccountLocateOrderUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments(
                    "accounts",
                    params.getPathParam(0),
                    "locate-orders",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { updateHandler.handle(it) }
        }
    }

    private val listHandler: Handler<AccountLocateOrderListResponse> =
        jsonHandler<AccountLocateOrderListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all locate orders */
    override fun list(
        params: AccountLocateOrderListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountLocateOrderListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "locate-orders")
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
