package com.upb.aroundme.data.Places.network

import com.upb.aroundme.model.PlacesToVisit
import retrofit2.Retrofit

class PlacesNetworkController {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://api.aroundme.io")  //ip pc local
        //.addCallAdapterFactory() TODO
        .build()
        .create(PlacesAPI::class.java)

    suspend fun getAllPlacesToVisit():List<PlacesToVisit> {
        return retrofit.getAllPlaces()
    }
}