package com.upb.aroundme.ui.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgs
import com.upb.aroundme.databinding.ActivityGeneralCitiesPlacesBinding
import com.upb.aroundme.model.City
import com.upb.aroundme.ui.viewmodels.PlacesListViewModel

class GeneralCityActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGeneralCitiesPlacesBinding
    private val placesListViewModel: PlacesListViewModel by viewModels()
    private lateinit var city: City
    private val args: GeneralCityActivityArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGeneralCitiesPlacesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        city = args.cityInfo
        placesListViewModel.updatesPlacesForCity(city.nameCity)

    }

}