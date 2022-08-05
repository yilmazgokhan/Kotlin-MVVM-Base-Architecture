package com.yilmazgokhan.basestructure.ui.main

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import com.blankj.utilcode.util.LogUtils
import com.yilmazgokhan.basestructure.base.BaseViewModel
import com.yilmazgokhan.basestructure.di.qualifier.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher

/**
 * ViewModel class for [MainActivity]
 */
class MainViewModel @ViewModelInject constructor(
        @Assisted private val savedStateHandle: SavedStateHandle,
        @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : BaseViewModel() {

    init {
        LogUtils.d("$this initialize")
    }
}