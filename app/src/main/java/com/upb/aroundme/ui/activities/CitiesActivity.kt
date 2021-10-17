package com.upb.aroundme.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.NavHostFragment
import com.upb.aroundme.ui.fragments.CitiesListFragment
import com.upb.aroundme.R
import com.upb.aroundme.databinding.ActivityCityListBinding

class CitiesActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCityListBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val navController = navHostFragment.navController
        binding.*/
        }

}