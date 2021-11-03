package com.upb.aroundme.data.Places.network

import com.upb.aroundme.model.City
import com.upb.aroundme.model.PlacesToVisit
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface PlacesAPI {
    @GET("/places")
    suspend fun getFilteredPlaces(@Query ("cityName")cityName:String): List<PlacesToVisit>

    @POST("/places")
    suspend fun addNewPost(): List<PlacesToVisit>
}