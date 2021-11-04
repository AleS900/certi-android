package com.upb.aroundme.data.places.network

import com.upb.aroundme.model.PlacesToVisit
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface PlacesAPI {
    @GET("/places")
    suspend fun getFilteredPlaces(@Query ("cityName")cityName:String): List<PlacesToVisit>

    @POST("/places")
    suspend fun addNewPost(): List<PlacesToVisit>
}