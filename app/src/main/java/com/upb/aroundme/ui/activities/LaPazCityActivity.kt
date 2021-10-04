package com.upb.aroundme.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.upb.aroundme.R
import com.upb.aroundme.ui.fragments.LaPazPlacesFragment

class LaPazCityActivity : AppCompatActivity() {
    private val laPazPlacesFragment = LaPazPlacesFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lp_places)

        replaceFragment(R.id.containerLPPlacesList,laPazPlacesFragment)

        laPazPlacesFragment.setOnSuccessListener {
            val intent =Intent(this,LocationInfoActivity::class.java)
            startActivity(intent)
            //finish()
        }

    }

}