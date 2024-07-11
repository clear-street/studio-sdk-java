// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.client

import com.studio_sdk.api.models.*
import com.studio_sdk.api.services.blocking.*

interface StudioSdkClient {

    fun async(): StudioSdkClientAsync

    fun entities(): EntityService

    fun accounts(): AccountService

    fun instruments(): InstrumentService
}
