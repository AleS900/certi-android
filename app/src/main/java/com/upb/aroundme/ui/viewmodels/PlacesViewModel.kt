package com.upb.aroundme.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.upb.aroundme.data.LaPazPlacesDataSource
import com.upb.aroundme.model.PlacesToVisit

class PlacesViewModel: ViewModel() {
    val places = MutableLiveData(LaPazPlacesDataSource.getPlacesList())
}