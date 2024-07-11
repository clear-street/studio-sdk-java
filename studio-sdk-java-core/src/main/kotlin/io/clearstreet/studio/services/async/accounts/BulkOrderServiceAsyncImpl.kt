// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.AccountBulkOrderCreateParams
import io.clearstreet.studio.models.AccountBulkOrderCreateResponse
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.json
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class BulkOrderServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BulkOrderServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountBulkOrderCreateResponse> =
        jsonHandler<AccountBulkOrderCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Creates multiple orders in a single request, up to 1000. Note that a successful call to this
     * endpoint does not necessarily mean your orders have been accepted, e.g. a downstream venue
     * might reject your order. You should therefore utilize our WebSocket APIs to listen for
     * changes in order lifecycle events.
     *
     * The response will contain an array of objects, indicating whether your order was submitted.
     * If the order was submitted, the `order_id` field will be populated with the order ID assigned
     * to this order. If the order was rejected, the `reason` field will be populated with the
     * reason for rejection. The data array returned in the response object is guaranteed to be
     * ordered in the same order as the orders you provided in the request. Again, note that even if
     * your order was submitted, that doesn't mean it was _accepted_, and may still be rejected by
     * downstream venues.
     */
    override fun create(
        params: AccountBulkOrderCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountBulkOrderCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("accounts", params.getPathParam(0), "bulk-orders")
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
}
