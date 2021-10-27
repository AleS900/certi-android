package com.upb.aroundme.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.upb.aroundme.data.Places.PlacesRepository

class PlacesListViewModel: ViewModel() {
    val placesRepository = PlacesRepository()
    val places = MutableLiveData(placesRepository.getAllPlacesList())

    fun updatesPlacesForCity(city: String) {
        places.postValue(placesRepository.getPlaceListForCity(city))
    }
}