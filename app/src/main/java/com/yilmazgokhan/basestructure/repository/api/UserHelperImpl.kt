package com.yilmazgokhan.basestructure.repository.api

import com.yilmazgokhan.basestructure.data.UserResponse
import retrofit2.Response
import javax.inject.Inject

class UserHelperImpl @Inject constructor(private val userService: UserService) : UserHelper {

    override suspend fun getUser(username: String): Response<UserResponse> =
        userService.getUser(username = username)
}