package com.yilmazgokhan.basestructure.repository.api

import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getAData(): Response<Any> =
        apiService.getAData()
}