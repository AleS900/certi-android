package com.upb.aroundme.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.upb.aroundme.data.LaPazPlacesDataSource

class PlacesViewModel: ViewModel() {
    val places = MutableLiveData(LaPazPlacesDataSource.laPazPlacesList)
}