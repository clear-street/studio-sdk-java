// File generated from our OpenAPI spec by Stainless.

package com.studio_sdk.api.services.blocking.accounts

import com.studio_sdk.api.core.ClientOptions
import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.core.http.HttpMethod
import com.studio_sdk.api.core.http.HttpRequest
import com.studio_sdk.api.core.http.HttpResponse.Handler
import com.studio_sdk.api.errors.StudioSdkError
import com.studio_sdk.api.models.AccountLocateOrderCreateParams
import com.studio_sdk.api.models.AccountLocateOrderListParams
import com.studio_sdk.api.models.AccountLocateOrderListResponse
import com.studio_sdk.api.models.AccountLocateOrderRetrieveParams
import com.studio_sdk.api.models.AccountLocateOrderUpdateParams
import com.studio_sdk.api.models.LocateOrder
import com.studio_sdk.api.services.emptyHandler
import com.studio_sdk.api.services.errorHandler
import com.studio_sdk.api.services.json
import com.studio_sdk.api.services.jsonHandler
import com.studio_sdk.api.services.withErrorHandler

class LocateOrderServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LocateOrderService {

    private val errorHandler: Handler<StudioSdkError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LocateOrder> =
        jsonHandler<LocateOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create locate order to borrow inventory for short-selling. */
    override fun create(
        params: AccountLocateOrderCreateParams,
        requestOptions: RequestOptions
    ): LocateOrder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("accounts", params.getPathParam(0), "locate-orders")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<LocateOrder> =
        jsonHandler<LocateOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get locate order by its unique locate order ID. */
    override fun retrieve(
        params: AccountLocateOrderRetrieveParams,
        requestOptions: RequestOptions
    ): LocateOrder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "accounts",
                    params.getPathParam(0),
                    "locate-orders",
                    params.getPathParam(1)
                )
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

    private val updateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Accept or decline locate order that has been offered. */
    override fun update(params: AccountLocateOrderUpdateParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments(
                    "accounts",
                    params.getPathParam(0),
                    "locate-orders",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { updateHandler.handle(it) }
        }
    }

    private val listHandler: Handler<AccountLocateOrderListResponse> =
        jsonHandler<AccountLocateOrderListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all locate orders */
    override fun list(
        params: AccountLocateOrderListParams,
        requestOptions: RequestOptions
    ): AccountLocateOrderListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "locate-orders")
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
