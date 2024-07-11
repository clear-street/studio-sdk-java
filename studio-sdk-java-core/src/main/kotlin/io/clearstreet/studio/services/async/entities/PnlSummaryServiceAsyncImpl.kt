// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.async.entities

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.EntityPnlSummaryRetrieveParams
import io.clearstreet.studio.models.PnlSummary
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PnlSummaryServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PnlSummaryServiceAsync {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<PnlSummary> =
        jsonHandler<PnlSummary>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get PNL summary for all accounts in an entity. */
    override fun retrieve(
        params: EntityPnlSummaryRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PnlSummary> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0), "pnl-summary")
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
