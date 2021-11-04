package com.upb.aroundme.data.places.persistency

import com.upb.aroundme.model.PlacesToVisit

interface PlacesPersistencyController {
    fun getPlacesList(): List<PlacesToVisit>
    fun savePlaces(places: List<PlacesToVisit>)
    fun filterPlacesByCity(city : String): List<PlacesToVisit>
}