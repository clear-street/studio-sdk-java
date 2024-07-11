// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.AccountPositionListParams
import io.clearstreet.studio.models.AccountPositionListResponse
import io.clearstreet.studio.models.AccountPositionRetrieveParams
import io.clearstreet.studio.models.Position
import java.util.concurrent.CompletableFuture

interface PositionServiceAsync {

    /** Get current positions for a given account for a given symbol. */
    @JvmOverloads
    fun retrieve(
        params: AccountPositionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Position>

    /** List current positions for a given account. */
    @JvmOverloads
    fun list(
        params: AccountPositionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountPositionListResponse>
}
