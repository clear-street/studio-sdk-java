// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.AccountPositionListParams
import io.clearstreet.studio.models.AccountPositionListResponse
import io.clearstreet.studio.models.AccountPositionRetrieveParams
import io.clearstreet.studio.models.Position

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
