// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking.accounts

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.AccountEasyBorrowListParams
import com.studio_sdk.api.models.AccountEasyBorrowListResponse
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler

class EasyBorrowServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EasyBorrowService {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AccountEasyBorrowListResponse> =
        jsonHandler<AccountEasyBorrowListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all current easy-to-borrow stock symbols. This list changes dynamically daily. */
    override fun list(
        params: AccountEasyBorrowListParams,
        requestOptions: RequestOptions
    ): AccountEasyBorrowListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "easy-borrows")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
