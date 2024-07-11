// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.AccountLocateOrderCreateParams
import io.clearstreet.studio.models.AccountLocateOrderListParams
import io.clearstreet.studio.models.AccountLocateOrderListResponse
import io.clearstreet.studio.models.AccountLocateOrderRetrieveParams
import io.clearstreet.studio.models.AccountLocateOrderUpdateParams
import io.clearstreet.studio.models.LocateOrder

interface LocateOrderService {

    /** Create locate order to borrow inventory for short-selling. */
    @JvmOverloads
    fun create(
        params: AccountLocateOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LocateOrder

    /** Get locate order by its unique locate order ID. */
    @JvmOverloads
    fun retrieve(
        params: AccountLocateOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LocateOrder

    /** Accept or decline locate order that has been offered. */
    @JvmOverloads
    fun update(
        params: AccountLocateOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** List all locate orders */
    @JvmOverloads
    fun list(
        params: AccountLocateOrderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountLocateOrderListResponse
}
