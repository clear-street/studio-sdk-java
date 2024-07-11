// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.blocking.entities

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.EntityPortfolioMarginRetrieveParams
import com.studio_sdk.api.models.PortfolioMargin

interface PortfolioMarginService {

    /** Get latest portfolio margin calculation for the given entity */
    @JvmOverloads
    fun retrieve(
        params: EntityPortfolioMarginRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PortfolioMargin
}
