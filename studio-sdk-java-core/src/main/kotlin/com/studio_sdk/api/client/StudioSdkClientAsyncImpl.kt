// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.client

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.*
import com.studio_sdk.api.services.async.*
import com.studio_sdk.api.services.errorHandler

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
