package com.yilmazgokhan.basestructure.repository.api

import retrofit2.Response

interface ApiHelper {

    suspend fun getAData(): Response<Any>
}