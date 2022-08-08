package com.yilmazgokhan.basestructure.domain

import com.blankj.utilcode.util.LogUtils
import com.yilmazgokhan.basestructure.data.model.UserResponse
import com.yilmazgokhan.basestructure.data.repository.UserRepository
import com.yilmazgokhan.basestructure.util.State
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetUserUseCase @Inject constructor(private val userRepository: UserRepository) {

    suspend operator fun invoke(username: String): Flow<State<UserResponse>> = flow {
        try {
            emit(State.Loading())
            val result = userRepository.getUser(username)
            if (result.isSuccessful)
                emit(State.Success(result.body()))
            //else
                //emit(State.Error(result.message()))

        } catch (e: Exception) {
            LogUtils.d("$this ${e.localizedMessage}")
            //emit(State.Error(e.localizedMessage))
        }
    }
}