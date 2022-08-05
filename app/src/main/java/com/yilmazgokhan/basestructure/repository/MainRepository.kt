package com.yilmazgokhan.basestructure.repository

import com.yilmazgokhan.basestructure.repository.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUser(username: String) = apiHelper.getUser(username = username)
}