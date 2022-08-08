package com.yilmazgokhan.basestructure.data.repository

import com.yilmazgokhan.basestructure.data.remote.model.UserResponse
import retrofit2.Response

/**
 * Methods of User Data Source
 */
interface UserDataSource {

    suspend fun getUser(username: String): Response<UserResponse>
}