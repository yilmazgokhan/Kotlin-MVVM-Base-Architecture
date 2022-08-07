package com.yilmazgokhan.basestructure.data.remote

import com.yilmazgokhan.basestructure.data.model.UserResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {

    @GET("users/{username}")
    suspend fun getUser(@Path("username") username: String): Response<UserResponse>
}