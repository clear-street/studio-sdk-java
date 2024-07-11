// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking.accounts

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.AccountPnlDetailListParams
import com.studio_sdk.api.models.AccountPnlDetailListResponse
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler

class PnlDetailServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PnlDetailService {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AccountPnlDetailListResponse> =
        jsonHandler<AccountPnlDetailListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List PNL details for a given account. */
    override fun list(
        params: AccountPnlDetailListParams,
        requestOptions: RequestOptions
    ): AccountPnlDetailListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "pnl-details")
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
