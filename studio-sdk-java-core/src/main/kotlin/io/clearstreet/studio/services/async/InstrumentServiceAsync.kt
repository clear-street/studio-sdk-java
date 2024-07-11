// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.async

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.Instrument
import io.clearstreet.studio.models.InstrumentRetrieveParams
import java.util.concurrent.CompletableFuture

interface InstrumentServiceAsync {

    /** Get an instrument by the given symbol */
    @JvmOverloads
    fun retrieve(
        params: InstrumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Instrument>
}
