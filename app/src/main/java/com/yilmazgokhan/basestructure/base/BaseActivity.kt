package com.yilmazgokhan.basestructure.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.LogUtils
import com.yilmazgokhan.basestructure.util.Loading
import com.yilmazgokhan.basestructure.R

/**
 * Base class for activity instances
 */
abstract class BaseActivity : AppCompatActivity() {

    //region vars
    private lateinit var mLoading: Loading
    //endregion

    /**
     * Set layout id
     */
    @LayoutRes
    abstract fun getLayoutId(): Int

    /**
     * Prepare UI Components
     */
    abstract fun prepareView(savedInstanceState: Bundle?)

    /**
     * Override onCreate method
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.d("$this onCreate: ")
        //Set layout
        setContentView(getLayoutId())
        //Set custom loading dialog
        mLoading = Loading(this, R.style.StyleLoading)
        //Set view
        prepareView(savedInstanceState)
    }

    //region Custom Loading Dialog's methods
    /**
     * Show loading
     */
    fun showLoading() {
        try {
            if (!mLoading.isShowing && !isFinishing)
                mLoading.show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * Hide loading
     */
    fun hideLoading() {
        try {
            if (mLoading.isShowing)
                mLoading.dismiss()
        } catch (e: Exception) {
            e.printStackTrace()
        }
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
        LogUtils.d("$theme onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtils.d("$this onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtils.d("$this onDestroy")
    }
    //endregion
}