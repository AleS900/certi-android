package com.upb.aroundme.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.upb.aroundme.data.PlacesDataSource

class PlacesViewModel: ViewModel() {
    val places = MutableLiveData(PlacesDataSource.getPlacesList())
}