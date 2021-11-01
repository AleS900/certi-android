package com.upb.aroundme.data.Places.network

import com.upb.aroundme.model.City
import com.upb.aroundme.model.PlacesToVisit
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.POST


interface PlacesAPI {
    @GET("/city")
    suspend fun getAllPlaces(): List<PlacesToVisit>

    @POST("/city")
    suspend fun addNewPost(): List<PlacesToVisit>
}