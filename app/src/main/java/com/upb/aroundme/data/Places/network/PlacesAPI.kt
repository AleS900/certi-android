package com.upb.aroundme.data.Places.network

import com.upb.aroundme.model.City
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.POST


interface PlacesAPI {
    @GET("/city")
    fun getAllPosts(): Flow<List<City>>

    @POST("/city")
    fun addNewPost(): Flow<List<City>>
}