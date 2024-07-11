// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.async

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.Instrument
import com.studio_sdk.api.models.InstrumentRetrieveParams
import java.util.concurrent.CompletableFuture

interface InstrumentServiceAsync {

    /** Get an instrument by the given symbol */
    @JvmOverloads
    fun retrieve(
        params: InstrumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Instrument>
}
