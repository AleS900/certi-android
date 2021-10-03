package com.upb.aroundme.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.upb.aroundme.ui.fragments.CitiesListFragment
import com.upb.aroundme.R
import com.upb.aroundme.replaceFragment

class CitiesActivity : AppCompatActivity() {

    val citiesListFragment = CitiesListFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_list)

        replaceFragment(R.id.containerCityList,citiesListFragment)

        }
}