package com.upb.aroundme.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.upb.aroundme.databinding.ActivityGeneralCitiesPlacesBinding

class GeneralCityActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGeneralCitiesPlacesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGeneralCitiesPlacesBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}