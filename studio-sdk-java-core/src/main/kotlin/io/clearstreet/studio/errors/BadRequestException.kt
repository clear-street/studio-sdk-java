package io.clearstreet.studio.errors

import com.google.common.collect.ListMultimap

class BadRequestException
constructor(
    headers: ListMultimap<String, String>,
    private val error: StudioSdkError,
) : StudioSdkServiceException(headers, "${error}") {
    override fun statusCode(): Int = 400

    fun error(): StudioSdkError = error
}
