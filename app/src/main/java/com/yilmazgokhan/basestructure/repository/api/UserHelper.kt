package com.yilmazgokhan.basestructure.repository.api

import com.yilmazgokhan.basestructure.data.UserResponse
import retrofit2.Response

interface UserHelper {

    suspend fun getUser(username: String): Response<UserResponse>
}