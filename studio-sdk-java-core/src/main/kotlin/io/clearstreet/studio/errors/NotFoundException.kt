package io.clearstreet.studio.errors

import com.google.common.collect.ListMultimap

class NotFoundException
constructor(
    headers: ListMultimap<String, String>,
    private val error: StudioSdkError,
) : StudioSdkServiceException(headers, "${error}") {
    override fun statusCode(): Int = 404

    fun error(): StudioSdkError = error
}
