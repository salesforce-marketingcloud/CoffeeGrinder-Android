package com.interview.coffeegrinder.api

import com.interview.coffeegrinder.model.Coffee
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("coffee/coffee.php")
    suspend fun getCoffees(): Response<List<Coffee>>

    @GET("coffee/coffee.php")
    suspend fun getCoffee(@Query("id") id: String): Response<Coffee>
}
