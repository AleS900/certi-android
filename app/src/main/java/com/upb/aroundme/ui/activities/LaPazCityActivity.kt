package com.upb.aroundme.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.upb.aroundme.R
import com.upb.aroundme.ui.fragments.LaPazPlacesFragment

class LaPazCityActivity {
    val laPazPlacesFragment = LaPazPlacesFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_places_la_paz)

        replaceFragment(R.id.containerCityList,laPazPlacesFragment)

    }
}