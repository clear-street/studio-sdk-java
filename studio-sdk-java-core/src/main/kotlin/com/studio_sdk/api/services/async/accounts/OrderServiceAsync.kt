// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.async.accounts

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.AccountOrderCancelParams
import com.studio_sdk.api.models.AccountOrderCreateParams
import com.studio_sdk.api.models.AccountOrderCreateResponse
import com.studio_sdk.api.models.AccountOrderDeleteParams
import com.studio_sdk.api.models.AccountOrderDeleteResponse
import com.studio_sdk.api.models.AccountOrderListParams
import com.studio_sdk.api.models.AccountOrderListResponse
import com.studio_sdk.api.models.AccountOrderRetrieveParams
import com.studio_sdk.api.models.AccountOrderRetrieveResponse
import java.util.concurrent.CompletableFuture

interface OrderServiceAsync {

    /**
     * Creates a new order and sends to our internal systems for execution. Note that a successful
     * call to this endpoint does not necessarily mean your order has been accepted, e.g. a
     * downstream venue might reject your order. You should therefore utilize our WebSocket APIs to
     * listen for changes in order lifecycle events.
     */
    @JvmOverloads
    fun create(
        params: AccountOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountOrderCreateResponse>

    /** Get an order that was previously created. */
    @JvmOverloads
    fun retrieve(
        params: AccountOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountOrderRetrieveResponse>

    /**
     * List orders for a given account for the current trading day, filtered on the given query
     * parameters.
     */
    @JvmOverloads
    fun list(
        params: AccountOrderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountOrderListResponse>

    /**
     * Attempts to cancel all open orders for a given account. Cancelling an order cannot be
     * guaranteed as there might be in-flight executions.
     */
    @JvmOverloads
    fun delete(
        params: AccountOrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountOrderDeleteResponse>

    /**
     * Attempts to cancel an existing order. Cancelling an order cannot be guaranteed as there might
     * be in-flight executions.
     */
    @JvmOverloads
    fun cancel(
        params: AccountOrderCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>
}
