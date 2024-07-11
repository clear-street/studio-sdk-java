// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.client

import io.clearstreet.studio.models.*
import io.clearstreet.studio.services.blocking.*

interface StudioSdkClient {

    fun async(): StudioSdkClientAsync

    fun entities(): EntityService

    fun accounts(): AccountService

    fun instruments(): InstrumentService
}
