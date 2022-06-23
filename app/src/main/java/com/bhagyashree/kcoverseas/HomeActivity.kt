package com.bhagyashree.kcoverseas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.bhagyashree.kcoverseas.R.id.homeFragment2
import com.bhagyashree.kcoverseas.fragments.CallFragment
import com.bhagyashree.kcoverseas.fragments.DiscoverFragment
import com.bhagyashree.kcoverseas.fragments.HomeFragment
import com.bhagyashree.kcoverseas.fragments.InfoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var bottomNav:BottomNavigationView
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNav = findViewById(R.id.bottomNavigation)
        navController = findNavController(R.id.fragmentContainerView)
        appBarConfiguration = AppBarConfiguration(setOf(homeFragment2,R.id.discoverFragment2,R.id.callFragment2,R.id.infoFragment2))
        setupActionBarWithNavController(navController,appBarConfiguration)
        bottomNav.setupWithNavController(navController)

        val homeFragment = HomeFragment()
        val discoverFragment = DiscoverFragment()
        val callFragment = CallFragment()
        val infoFragment = InfoFragment()
        

    }


}

