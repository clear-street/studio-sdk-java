// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.blocking.entities

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.EntityPnlSummaryRetrieveParams
import com.studio_sdk.api.models.PnlSummary

interface PnlSummaryService {

    /** Get PNL summary for all accounts in an entity. */
    @JvmOverloads
    fun retrieve(
        params: EntityPnlSummaryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PnlSummary
}
