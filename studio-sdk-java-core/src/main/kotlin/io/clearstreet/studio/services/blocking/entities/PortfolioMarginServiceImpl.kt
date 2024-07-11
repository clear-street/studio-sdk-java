// File generated from our OpenAPI spec by Stainless.

package io.clearstreet.studio.services.blocking.entities

import io.clearstreet.studio.core.ClientOptions
import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.core.http.HttpMethod
import io.clearstreet.studio.core.http.HttpRequest
import io.clearstreet.studio.core.http.HttpResponse.Handler
import io.clearstreet.studio.errors.StudioSdkError
import io.clearstreet.studio.models.EntityPortfolioMarginRetrieveParams
import io.clearstreet.studio.models.PortfolioMargin
import io.clearstreet.studio.services.errorHandler
import io.clearstreet.studio.services.jsonHandler
import io.clearstreet.studio.services.withErrorHandler

class PortfolioMarginServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PortfolioMarginService {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<PortfolioMargin> =
        jsonHandler<PortfolioMargin>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get latest portfolio margin calculation for the given entity */
    override fun retrieve(
        params: EntityPortfolioMarginRetrieveParams,
        requestOptions: RequestOptions
    ): PortfolioMargin {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0), "portfolio-margin")
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
