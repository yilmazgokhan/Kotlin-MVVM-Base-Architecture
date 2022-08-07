package com.yilmazgokhan.basestructure.repository

import com.yilmazgokhan.basestructure.repository.api.UserHelper
import javax.inject.Inject

class UserRepository @Inject constructor(private val apiHelper: UserHelper) {

    suspend fun getUser(username: String) = apiHelper.getUser(username = username)
}