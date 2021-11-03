package com.upb.aroundme.ui.viewmodels

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
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

    val places = MutableLiveData<List<PlacesToVisit>>()

    fun updatesPlacesForCity(city: String ,context:Context) {
        placesRepository.getAllPlacesList(context).onEach {
            places.postValue(it)
        }.launchIn(CoroutineScope(Dispatchers.IO))
        places.postValue(placesRepository.getPlacesByCity(city))
    }
}
