// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.client

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.*
import io.clearstreet.studio.services.blocking.*
import io.clearstreet.studio.services.errorHandler

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
