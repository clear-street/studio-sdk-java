// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.client

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.*
import io.clearstreet.studio.services.async.*
import io.clearstreet.studio.services.errorHandler

class StudioSdkClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : StudioSdkClientAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val sync: StudioSdkClient by lazy { StudioSdkClientImpl(clientOptions) }

    private val entities: EntityServiceAsync by lazy { EntityServiceAsyncImpl(clientOptions) }

    private val accounts: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val instruments: InstrumentServiceAsync by lazy {
        InstrumentServiceAsyncImpl(clientOptions)
    }

    override fun sync(): StudioSdkClient = sync

    override fun entities(): EntityServiceAsync = entities

    override fun accounts(): AccountServiceAsync = accounts

    override fun instruments(): InstrumentServiceAsync = instruments
}
