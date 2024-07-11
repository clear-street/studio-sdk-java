package io.clearstreet.studio.errors

open class StudioSdkException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
