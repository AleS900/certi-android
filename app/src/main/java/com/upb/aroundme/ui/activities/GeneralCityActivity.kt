package com.upb.aroundme.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.upb.aroundme.R
import com.upb.aroundme.ui.fragments.LaPazPlacesFragment

class GeneralCityActivity : AppCompatActivity() {
    private val laPazPlacesFragment = LaPazPlacesFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_cities_places)

        replaceFragment(R.id.containerLPPlacesList,laPazPlacesFragment)

        laPazPlacesFragment.setOnSuccessListener {
            val intent =Intent(this,LocationInfoActivity::class.java)
            startActivity(intent)
            //finish()
        }

    }

}