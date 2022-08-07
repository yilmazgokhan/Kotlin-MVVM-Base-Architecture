package com.yilmazgokhan.basestructure.domain

import com.yilmazgokhan.basestructure.data.repository.UserRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(private val userRepository: UserRepository)  {
}