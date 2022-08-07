package com.yilmazgokhan.basestructure.data.repository

import com.yilmazgokhan.basestructure.data.model.UserResponse
import retrofit2.Response

interface UserDataSource {

    suspend fun getUser(username: String): Response<UserResponse>
}