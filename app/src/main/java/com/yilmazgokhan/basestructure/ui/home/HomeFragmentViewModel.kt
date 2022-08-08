package com.yilmazgokhan.basestructure.ui.home

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.blankj.utilcode.util.LogUtils
import com.blankj.utilcode.util.StringUtils
import com.yilmazgokhan.basestructure.R
import com.yilmazgokhan.basestructure.base.BaseViewModel
import com.yilmazgokhan.basestructure.data.remote.model.UserResponse
import com.yilmazgokhan.basestructure.di.qualifier.IoDispatcher
import com.yilmazgokhan.basestructure.domain.usecase.GetUserUseCase
import com.yilmazgokhan.basestructure.util.Resource
import com.yilmazgokhan.basestructure.util.State
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * View Model class for [HomeFragment]
 */
@ExperimentalCoroutinesApi
class HomeFragmentViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val getUserUseCase: GetUserUseCase
    //private val userRepository: UserRepository
) : BaseViewModel() {

    //region city info
    private val _user = MutableLiveData<Resource<UserResponse>>()
    val user: LiveData<Resource<UserResponse>>
        get() = _user
    //endregion

    init {
        LogUtils.d("$this initialize")
        getUser("yilmazgokhan")
    }

    /**
     * Send HTTP Request for get user info
     */
    private fun getUser(username: String) {
        viewModelScope.launch {
            getUserUseCase.invoke("yilmazgokhan").collect {
                when (it) {
                    is State.Loading -> {
                        _user.postValue(Resource.loading())
                    }
                    is State.Success -> {
                        _user.postValue(Resource.success(it.data))
                    }
                    is State.Error -> {
                        _user.postValue(
                            Resource.error(
                                message = it.message ?: StringUtils.getString(
                                    R.string.something_went_wrong
                                )
                            )
                        )
                    }
                }
            }
        }
    }
}