package com.upb.aroundme.ui.placesToVisitPage.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

import androidx.navigation.navArgs
import com.upb.aroundme.databinding.ActivityPlacesBinding
import com.upb.aroundme.model.City
import com.upb.aroundme.ui.viewmodels.PlacesListViewModel

class PlacesActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPlacesBinding
    private val placesListViewModel: PlacesListViewModel by viewModels()
    private lateinit var city: City
    private val args: PlacesActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPlacesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        city = args.cityInfo
        binding.cityTitle= city
        placesListViewModel.updatesPlacesForCity(city.nameCity,this)
    }

}