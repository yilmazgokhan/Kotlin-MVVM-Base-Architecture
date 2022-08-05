package com.yilmazgokhan.basestructure.ui.home

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.blankj.utilcode.util.LogUtils
import com.yilmazgokhan.basestructure.R
import com.yilmazgokhan.basestructure.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class HomeFragment : BaseFragment(R.layout.fragment_home) {

    //region vars
    private val viewModel: HomeFragmentViewModel by viewModels()
    //endregion

    override fun prepareView(savedInstanceState: Bundle?) {
        LogUtils.d("$this prepareView")
        //TODO: Not yet implemented
    }
}