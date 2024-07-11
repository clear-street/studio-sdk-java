// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.AccountOrderCancelParams
import io.clearstreet.studio.models.AccountOrderCreateParams
import io.clearstreet.studio.models.AccountOrderCreateResponse
import io.clearstreet.studio.models.AccountOrderDeleteParams
import io.clearstreet.studio.models.AccountOrderDeleteResponse
import io.clearstreet.studio.models.AccountOrderListParams
import io.clearstreet.studio.models.AccountOrderListResponse
import io.clearstreet.studio.models.AccountOrderRetrieveParams
import io.clearstreet.studio.models.AccountOrderRetrieveResponse

interface OrderService {

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
    ): AccountOrderCreateResponse

    /** Get an order that was previously created. */
    @JvmOverloads
    fun retrieve(
        params: AccountOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountOrderRetrieveResponse

    /**
     * List orders for a given account for the current trading day, filtered on the given query
     * parameters.
     */
    @JvmOverloads
    fun list(
        params: AccountOrderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountOrderListResponse

    /**
     * Attempts to cancel all open orders for a given account. Cancelling an order cannot be
     * guaranteed as there might be in-flight executions.
     */
    @JvmOverloads
    fun delete(
        params: AccountOrderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountOrderDeleteResponse

    /**
     * Attempts to cancel an existing order. Cancelling an order cannot be guaranteed as there might
     * be in-flight executions.
     */
    @JvmOverloads
    fun cancel(
        params: AccountOrderCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
