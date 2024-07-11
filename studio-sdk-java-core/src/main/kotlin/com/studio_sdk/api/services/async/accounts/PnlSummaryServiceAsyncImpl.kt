// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.async.accounts

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.AccountPnlSummaryRetrieveParams
import com.studio_sdk.api.models.PnlSummaryForAccount
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PnlSummaryServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PnlSummaryServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<PnlSummaryForAccount> =
        jsonHandler<PnlSummaryForAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get PNL summary for a given account. */
    override fun retrieve(
        params: AccountPnlSummaryRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PnlSummaryForAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "pnl-summary")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
