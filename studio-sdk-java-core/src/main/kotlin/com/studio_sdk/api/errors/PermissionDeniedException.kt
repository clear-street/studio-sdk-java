package com.studio_sdk.api.errors

import com.google.common.collect.ListMultimap

class PermissionDeniedException
constructor(
    headers: ListMultimap<String, String>,
    private val error: StudioSdkError,
) : StudioSdkServiceException(headers, "${error}") {
    override fun statusCode(): Int = 403

    fun error(): StudioSdkError = error
}
