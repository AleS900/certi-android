package com.upb.aroundme.data.Places.persistency

import com.upb.aroundme.model.PlacesToVisit
import kotlinx.coroutines.flow.Flow

interface PlacesPersistencyController {
    fun getPlacesList(): List<PlacesToVisit>
    fun savePlaces(places: List<PlacesToVisit>)
    fun filterPlacesByCity(city : String): List<PlacesToVisit>
}