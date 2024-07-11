// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.async.accounts

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.AccountBulkOrderCreateParams
import com.studio_sdk.api.models.AccountBulkOrderCreateResponse
import java.util.concurrent.CompletableFuture

interface BulkOrderServiceAsync {

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
    @JvmOverloads
    fun create(
        params: AccountBulkOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountBulkOrderCreateResponse>
}
