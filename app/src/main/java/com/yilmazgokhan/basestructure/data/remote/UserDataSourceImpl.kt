package com.yilmazgokhan.basestructure.data.remote

import com.yilmazgokhan.basestructure.data.model.UserResponse
import com.yilmazgokhan.basestructure.data.repository.UserDataSource
import retrofit2.Response
import javax.inject.Inject

class UserDataSourceImpl @Inject constructor(private val userService: UserService) :
    UserDataSource {

    override suspend fun getUser(username: String): Response<UserResponse> =
        userService.getUser(username = username)
}