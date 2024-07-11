package com.studio_sdk.api.errors

import com.google.common.collect.ListMultimap

class InternalServerException
constructor(
    private val statusCode: Int,
    headers: ListMultimap<String, String>,
    private val error: StudioSdkError,
) : StudioSdkServiceException(headers, "${error}") {
    override fun statusCode(): Int = statusCode

    fun error(): StudioSdkError = error
}
