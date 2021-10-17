package com.upb.aroundme.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.upb.aroundme.R
import com.upb.aroundme.databinding.ActivityGeneralCitiesPlacesBinding
import com.upb.aroundme.ui.fragments.GeneralPlacesFragment

class GeneralCityActivity : AppCompatActivity() {
    private val laPazPlacesFragment = GeneralPlacesFragment()
    private lateinit var binding : ActivityGeneralCitiesPlacesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGeneralCitiesPlacesBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }

}