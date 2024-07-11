// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.AccountOrderCancelParams
import io.clearstreet.studio.models.AccountOrderCreateParams
import io.clearstreet.studio.models.AccountOrderCreateResponse
import io.clearstreet.studio.models.AccountOrderDeleteParams
import io.clearstreet.studio.models.AccountOrderDeleteResponse
import io.clearstreet.studio.models.AccountOrderListParams
import io.clearstreet.studio.models.AccountOrderListResponse
import io.clearstreet.studio.models.AccountOrderRetrieveParams
import io.clearstreet.studio.models.AccountOrderRetrieveResponse
import io.clearstreet.studio.services.emptyHandler
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.json
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class OrderServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : OrderServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountOrderCreateResponse> =
        jsonHandler<AccountOrderCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Creates a new order and sends to our internal systems for execution. Note that a successful
     * call to this endpoint does not necessarily mean your order has been accepted, e.g. a
     * downstream venue might reject your order. You should therefore utilize our WebSocket APIs to
     * listen for changes in order lifecycle events.
     */
    override fun create(
        params: AccountOrderCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountOrderCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("accounts", params.getPathParam(0), "orders")
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

    private val retrieveHandler: Handler<AccountOrderRetrieveResponse> =
        jsonHandler<AccountOrderRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get an order that was previously created. */
    override fun retrieve(
        params: AccountOrderRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountOrderRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "accounts",
                    params.getPathParam(0),
                    "orders",
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

    private val listHandler: Handler<AccountOrderListResponse> =
        jsonHandler<AccountOrderListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List orders for a given account for the current trading day, filtered on the given query
     * parameters.
     */
    override fun list(
        params: AccountOrderListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountOrderListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "orders")
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

    private val deleteHandler: Handler<AccountOrderDeleteResponse> =
        jsonHandler<AccountOrderDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Attempts to cancel all open orders for a given account. Cancelling an order cannot be
     * guaranteed as there might be in-flight executions.
     */
    override fun delete(
        params: AccountOrderDeleteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountOrderDeleteResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("accounts", params.getPathParam(0), "orders")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { deleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val cancelHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Attempts to cancel an existing order. Cancelling an order cannot be guaranteed as there might
     * be in-flight executions.
     */
    override fun cancel(
        params: AccountOrderCancelParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "accounts",
                    params.getPathParam(0),
                    "orders",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { cancelHandler.handle(it) }
        }
    }
}
