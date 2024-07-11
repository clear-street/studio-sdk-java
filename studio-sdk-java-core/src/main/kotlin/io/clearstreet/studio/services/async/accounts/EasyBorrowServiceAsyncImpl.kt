// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async.accounts

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.AccountEasyBorrowListParams
import io.clearstreet.studio.models.AccountEasyBorrowListResponse
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class EasyBorrowServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : EasyBorrowServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AccountEasyBorrowListResponse> =
        jsonHandler<AccountEasyBorrowListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all current easy-to-borrow stock symbols. This list changes dynamically daily. */
    override fun list(
        params: AccountEasyBorrowListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountEasyBorrowListResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "easy-borrows")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
