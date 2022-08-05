package com.yilmazgokhan.basestructure.repository.api

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("temp")
    suspend fun getAData(): Response<Any>
}