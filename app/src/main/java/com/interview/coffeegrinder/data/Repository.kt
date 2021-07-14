package com.interview.coffeegrinder.data

import com.interview.coffeegrinder.api.ApiHelper
import com.interview.coffeegrinder.model.Coffee
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getCoffees() = apiHelper.getCoffees()
    suspend fun getCoffee(id: String) = apiHelper.getCoffee(id)
}
