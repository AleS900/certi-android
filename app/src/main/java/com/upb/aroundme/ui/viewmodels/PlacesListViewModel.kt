package com.upb.aroundme.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.upb.aroundme.data.LaPazPlacesDataSource
import com.upb.aroundme.model.PlacesToVisit

class PlacesListViewModel: ViewModel() {
    val places = MutableLiveData(LaPazPlacesDataSource.getPlacesList())

    fun updatesPlacesForCity(city: String) {
        places.postValue(LaPazPlacesDataSource.getPlaceListForCity(city))
    }
}