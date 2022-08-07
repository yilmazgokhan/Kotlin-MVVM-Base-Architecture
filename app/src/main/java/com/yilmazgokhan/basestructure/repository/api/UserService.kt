package com.yilmazgokhan.basestructure.repository.api

import com.yilmazgokhan.basestructure.data.UserResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {

    @GET("users/{username}")
    suspend fun getUser(@Path("username") username: String): Response<UserResponse>
}