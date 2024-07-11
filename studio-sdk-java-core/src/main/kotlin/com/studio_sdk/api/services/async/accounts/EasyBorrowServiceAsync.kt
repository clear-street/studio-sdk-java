// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.studio_sdk.api.services.async.accounts

import com.studio_sdk.api.core.RequestOptions
import com.studio_sdk.api.models.AccountEasyBorrowListParams
import com.studio_sdk.api.models.AccountEasyBorrowListResponse
import java.util.concurrent.CompletableFuture

interface EasyBorrowServiceAsync {

    /** List all current easy-to-borrow stock symbols. This list changes dynamically daily. */
    @JvmOverloads
    fun list(
        params: AccountEasyBorrowListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountEasyBorrowListResponse>
}
