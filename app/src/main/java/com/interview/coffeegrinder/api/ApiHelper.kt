package com.interview.coffeegrinder.api

import com.interview.coffeegrinder.model.Coffee
import retrofit2.Response

interface ApiHelper {
    suspend fun getCoffees(): Response<List<Coffee>>
    suspend fun getCoffee(id: String): Response<Coffee>
}
