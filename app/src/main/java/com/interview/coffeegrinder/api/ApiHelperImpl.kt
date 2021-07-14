package com.interview.coffeegrinder.api

import com.interview.coffeegrinder.model.Coffee
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getCoffees(): Response<List<Coffee>> {
        return apiService.getCoffees()
    }

    override suspend fun getCoffee(id: String): Response<Coffee> {
        return apiService.getCoffee(id)
    }
}