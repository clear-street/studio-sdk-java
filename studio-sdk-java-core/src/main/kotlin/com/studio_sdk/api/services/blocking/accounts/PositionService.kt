// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.blocking.accounts

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.AccountPositionListParams
import com.studio_sdk.api.models.AccountPositionListResponse
import com.studio_sdk.api.models.AccountPositionRetrieveParams
import com.studio_sdk.api.models.Position

interface PositionService {

    /** Get current positions for a given account for a given symbol. */
    @JvmOverloads
    fun retrieve(
        params: AccountPositionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Position

    /** List current positions for a given account. */
    @JvmOverloads
    fun list(
        params: AccountPositionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountPositionListResponse
}