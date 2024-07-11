// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.blocking.accounts

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.AccountLocateOrderCreateParams
import com.studio_sdk.api.models.AccountLocateOrderListParams
import com.studio_sdk.api.models.AccountLocateOrderListResponse
import com.studio_sdk.api.models.AccountLocateOrderRetrieveParams
import com.studio_sdk.api.models.AccountLocateOrderUpdateParams
import com.studio_sdk.api.models.LocateOrder

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
