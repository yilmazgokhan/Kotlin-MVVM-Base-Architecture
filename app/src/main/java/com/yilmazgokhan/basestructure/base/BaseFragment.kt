package com.yilmazgokhan.basestructure.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.blankj.utilcode.util.LogUtils

/**
 * Base class for Fragment instances
 */
abstract class BaseFragment(@LayoutRes private val layout: Int) : Fragment(layout) {

    /**
     * Prepare UI Components
     */
    abstract fun prepareView(savedInstanceState: Bundle?)

    /**
     * Override onViewCreated method
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareView(savedInstanceState)
    }

    //region Custom Loading Dialog's methods
    /**
     * Show loading
     */
    fun showLoading() {
        val activity = activity as BaseActivity
        activity.showLoading()
    }

    /**
     * Hide loading
     */
    fun hideLoading() {
        val activity = activity as BaseActivity
        activity.hideLoading()
    }
    //endregion

    override fun onStart() {
        super.onStart()
        LogUtils.d("$this onStart")
    }

    override fun onResume() {
        super.onResume()
        LogUtils.d("$this onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtils.d("$this onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtils.d("$this onStop")
    }
    //endregion
}