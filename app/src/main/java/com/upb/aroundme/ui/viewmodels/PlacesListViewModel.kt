package com.upb.aroundme.ui.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.upb.aroundme.data.Places.PlacesRepository

class PlacesListViewModel: ViewModel() {
    val placesRepository = PlacesRepository()
 //   val places = MutableLiveData(placesRepository.getAllPlacesList())

    fun updatesPlacesForCity(context: Context) {
        // placesRepository.getPlaceListForCity(context)


        //  places.postValue()

    }
}
