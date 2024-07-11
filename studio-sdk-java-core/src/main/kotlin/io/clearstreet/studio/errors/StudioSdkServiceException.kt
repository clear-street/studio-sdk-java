package io.clearstreet.studio.errors

import com.google.common.collect.ListMultimap

abstract class StudioSdkServiceException
@JvmOverloads
constructor(
    private val headers: ListMultimap<String, String>,
    message: String? = null,
    cause: Throwable? = null
) : StudioSdkException(message, cause) {
    abstract fun statusCode(): Int

    fun headers(): ListMultimap<String, String> = headers
}
