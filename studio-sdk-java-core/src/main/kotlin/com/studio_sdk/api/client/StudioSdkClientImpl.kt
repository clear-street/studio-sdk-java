// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.client

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.*
import com.studio_sdk.api.services.blocking.*
import com.studio_sdk.api.services.errorHandler

class StudioSdkClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : StudioSdkClient {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val async: StudioSdkClientAsync by lazy { StudioSdkClientAsyncImpl(clientOptions) }

    private val entities: EntityService by lazy { EntityServiceImpl(clientOptions) }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val instruments: InstrumentService by lazy { InstrumentServiceImpl(clientOptions) }

    override fun async(): StudioSdkClientAsync = async

    override fun entities(): EntityService = entities

    override fun accounts(): AccountService = accounts

    override fun instruments(): InstrumentService = instruments
}
