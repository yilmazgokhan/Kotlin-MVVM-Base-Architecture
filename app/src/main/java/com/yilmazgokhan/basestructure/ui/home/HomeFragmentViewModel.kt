package com.yilmazgokhan.basestructure.ui.home

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.blankj.utilcode.util.LogUtils
import com.yilmazgokhan.basestructure.base.BaseViewModel
import com.yilmazgokhan.basestructure.data.UserResponse
import com.yilmazgokhan.basestructure.di.qualifier.IoDispatcher
import com.yilmazgokhan.basestructure.repository.MainRepository
import com.yilmazgokhan.basestructure.repository.Resource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch

/**
 * View Model class for [HomeFragment]
 */
@ExperimentalCoroutinesApi
class HomeFragmentViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val mainRepository: MainRepository
) : BaseViewModel() {

    //region city info
    private val _user = MutableLiveData<Resource<UserResponse?>>()
    val user: LiveData<Resource<UserResponse?>>
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
            _user.postValue(Resource.loading(null))
            mainRepository.getUser(username = username).let {
                if (it.isSuccessful) {
                    _user.postValue(Resource.success(it.body()))
                } else
                    _user.postValue(Resource.error(it.errorBody().toString(), null))
            }
        }
    }
}