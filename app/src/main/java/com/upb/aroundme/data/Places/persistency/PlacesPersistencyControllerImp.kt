package com.upb.aroundme.data.Places.persistency

import com.upb.aroundme.App
import com.upb.aroundme.model.PlacesToVisit
import kotlinx.coroutines.flow.Flow

class PlacesPersistencyControllerImp:PlacesPersistencyController {
    private val db = App.db

    override fun getPlacesList(): List<PlacesToVisit> {
        return db.placesDao().getPlacesList()
    }

    override fun savePlaces(places: List<PlacesToVisit>){
        db.placesDao().saveSelectPlaces(places)
    }

    override fun filterPlacesByCity(cityName : String): List<PlacesToVisit>{
        return db.placesDao().selectPlaces(cityName)
    }
}