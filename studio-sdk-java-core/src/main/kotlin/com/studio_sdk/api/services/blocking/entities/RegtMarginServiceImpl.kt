// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking.entities

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.EntityRegtMarginRetrieveParams
import com.studio_sdk.api.models.RegtMargin
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler

class RegtMarginServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : RegtMarginService {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<RegtMargin> =
        jsonHandler<RegtMargin>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the latest Reg-T margin calculation for the given entity */
    override fun retrieve(
        params: EntityRegtMarginRetrieveParams,
        requestOptions: RequestOptions
    ): RegtMargin {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0), "regt-margin")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
