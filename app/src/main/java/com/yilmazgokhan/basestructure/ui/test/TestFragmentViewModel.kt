package com.yilmazgokhan.basestructure.ui.test

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import com.blankj.utilcode.util.LogUtils
import com.yilmazgokhan.basestructure.base.BaseViewModel
import com.yilmazgokhan.basestructure.di.qualifier.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * TODO("The class will delete when [TestFragment] deleted")
 *
 * The class created for TestFragment
 */
@ExperimentalCoroutinesApi
class TestFragmentViewModel @ViewModelInject constructor(
        @Assisted private val savedStateHandle: SavedStateHandle,
        @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : BaseViewModel() {

    init {
        LogUtils.d("$this initialized")
    }
}