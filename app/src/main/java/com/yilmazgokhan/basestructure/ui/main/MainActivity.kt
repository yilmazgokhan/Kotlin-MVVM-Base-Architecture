package com.yilmazgokhan.basestructure.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.yilmazgokhan.basestructure.R
import com.yilmazgokhan.basestructure.base.BaseActivity
import com.yilmazgokhan.basestructure.util.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    //region vars
    private val viewModel: MainViewModel by viewModels()
    private var currentNavController: LiveData<NavController>? = null
    //endregion

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun prepareView(savedInstanceState: Bundle?) {
        //viewModel.test()
        if (savedInstanceState == null) {
            initBottomNavigationBar()
        }
    }

    /**
     * Called on first creation and when restoring state.
     */
    private fun initBottomNavigationBar() {
        val navGraphIds = listOf(R.navigation.nav_graph_home, R.navigation.nav_graph_test)
        // Setup the bottom navigation view with a list of navigation graphs
        val controller = bottom_nav.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.nav_host_container,
            intent = intent
        )
        // Whenever the selected controller changes, setup action bar
        controller.observe(this, { navController ->
            // Set destination listener to selected controller
            navController.addOnDestinationChangedListener { controller, destination, arguments ->
                // Don something when destination change
            }
        })
        currentNavController = controller
    }

    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // Now that BottomNavigationBar has restored its instance state
        // and its selectedItemId, we can proceed with setting up the
        // BottomNavigationBar with Navigation
        initBottomNavigationBar()
    }
}