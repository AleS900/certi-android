package com.upb.aroundme.data.Places.network

import com.upb.aroundme.model.PlacesToVisit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PlacesNetworkControllerImp : PlacesNetworkController {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.0.10:1880")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PlacesAPI::class.java)

    override suspend fun getFilteredPlacesToVisit(cityName:String):List<PlacesToVisit> {
        return retrofit.getFilteredPlaces()
    }
}