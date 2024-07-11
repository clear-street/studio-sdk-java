// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package io.clearstreet.studio.services.blocking.accounts

import io.clearstreet.studio.core.RequestOptions
import io.clearstreet.studio.models.AccountEasyBorrowListParams
import io.clearstreet.studio.models.AccountEasyBorrowListResponse

interface EasyBorrowService {

    /** List all current easy-to-borrow stock symbols. This list changes dynamically daily. */
    @JvmOverloads
    fun list(
        params: AccountEasyBorrowListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountEasyBorrowListResponse
}
