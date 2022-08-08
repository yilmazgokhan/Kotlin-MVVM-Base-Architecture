package com.yilmazgokhan.basestructure.ui.home

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.blankj.utilcode.util.LogUtils
import com.yilmazgokhan.basestructure.R
import com.yilmazgokhan.basestructure.base.BaseFragment
import com.yilmazgokhan.basestructure.data.remote.model.UserResponse
import com.yilmazgokhan.basestructure.util.Status
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
        this.observeModel()
    }

    /**
     * Observe LiveData models
     */
    private fun observeModel() {
        viewModel.user.observe(viewLifecycleOwner, {
            when (it.status) {
                Status.SUCCESS -> {
                    it.data.let {
                        LogUtils.d("$this SUCCESS")
                        prepareComponents(it)
                    }
                    hideLoading()
                }
                Status.LOADING -> {
                    LogUtils.d("$this LOADING")
                    showLoading()
                }
                Status.ERROR -> {
                    LogUtils.d("$this ERROR")
                    showLoading()
                }
            }
        })
    }

    /**
     * Prepare components & show data in UI
     *
     */
    private fun prepareComponents(user: UserResponse?) {
        // TODO: 7/8/2022
    }
}