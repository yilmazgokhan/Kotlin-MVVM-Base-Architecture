package com.yilmazgokhan.basestructure.data.repository

import javax.inject.Inject

class UserRepository @Inject constructor(private val userDataSource: UserDataSource) {

    suspend fun getUser(username: String) = userDataSource.getUser(username = username)
}