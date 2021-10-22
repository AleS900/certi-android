package com.upb.aroundme.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.upb.aroundme.data.PlacesDataSource

class PlacesListViewModel: ViewModel() {

    val places = MutableLiveData(PlacesDataSource.getPlacesList())

    fun updatesPlacesForCity(city: String) {
        places.postValue(PlacesDataSource.getPlaceListForCity(city))
    }
}