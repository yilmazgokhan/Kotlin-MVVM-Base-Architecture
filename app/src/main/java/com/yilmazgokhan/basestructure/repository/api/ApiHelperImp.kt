package com.yilmazgokhan.basestructure.repository.api

import com.yilmazgokhan.basestructure.data.UserResponse
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUser(username: String): Response<UserResponse> =
        apiService.getUser(username = username)
}