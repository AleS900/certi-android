package com.upb.aroundme.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.upb.aroundme.R
import com.upb.aroundme.replaceFragment
import com.upb.aroundme.ui.fragments.LaPazPlacesFragment

class LaPazCityActivity : AppCompatActivity() {
    val laPazPlacesFragment = LaPazPlacesFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lp_places)

        replaceFragment(R.id.containerLPPlacesList,laPazPlacesFragment)

    }

}