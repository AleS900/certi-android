package com.upb.aroundme.ui.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.upb.aroundme.data.Places.PlacesRepository
import com.upb.aroundme.data.Places.network.PlacesNetworkControllerImp
import com.upb.aroundme.data.Places.persistency.PlacesPersistencyControllerImp
import com.upb.aroundme.data.PlacesDataSource
import com.upb.aroundme.model.PlacesToVisit
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class PlacesListViewModel: ViewModel() {
    val placesRepository =
        PlacesRepository(PlacesNetworkControllerImp(),PlacesPersistencyControllerImp())

    val places = MutableLiveData<List<PlacesToVisit>>(listOf())
        //val places = placesRepository.getAllPlacesList().asLiveData()

    fun updatesPlacesForCity(cityName: String) {
        placesRepository.getPlacesByCity(cityName).onEach {
            places.postValue(it)
        }.launchIn(CoroutineScope(Dispatchers.IO))
    }
}
