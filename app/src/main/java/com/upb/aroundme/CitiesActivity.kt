package com.upb.aroundme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CitiesActivity : AppCompatActivity() {

    val citiesListFragment = CitiesListFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_list)

        replaceFragment(R.id.containerCityList,citiesListFragment)

        }
}