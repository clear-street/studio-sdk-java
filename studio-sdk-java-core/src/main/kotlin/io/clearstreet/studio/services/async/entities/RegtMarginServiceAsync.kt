// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async.entities

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.EntityRegtMarginRetrieveParams
import io.clearstreet.studio.models.RegtMargin
import java.util.concurrent.CompletableFuture

interface RegtMarginServiceAsync {

    /** Get the latest Reg-T margin calculation for the given entity */
    @JvmOverloads
    fun retrieve(
        params: EntityRegtMarginRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RegtMargin>
}