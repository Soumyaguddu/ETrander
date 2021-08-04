package com.senso.e_trader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import kotlinx.android.synthetic.main.activity_dash_board_second.*


class DashBoardSecondActivity : AppCompatActivity() {
    var navController: NavController = NavController(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board_second)
        navController =
            Navigation.findNavController(this@DashBoardSecondActivity,
                R.id.nav_host_fragment
            )
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()

    }
}