package com.yilmazgokhan.basestructure.domain.repository

import com.yilmazgokhan.basestructure.data.remote.model.UserResponse
import retrofit2.Response

/**
 * Methods of User Repository
 */
interface UserRepository {

    suspend fun getUser(username: String): Response<UserResponse>
}