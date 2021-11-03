package com.upb.aroundme.data.Places.persistency

import com.upb.aroundme.model.PlacesToVisit
import kotlinx.coroutines.flow.Flow

class PlacesPersistencyControllerImp:PlacesPersistencyController {
    private var  PlacesList:List<PlacesToVisit> = listOf()

    override fun getPlacesList(): List<PlacesToVisit> {
        return PlacesList
    }

    override fun savePlaces(places: List<PlacesToVisit>){
        PlacesList = places
    }

    override fun filterPlacesByCity(city : String): List<PlacesToVisit>{
        return PlacesList.filter {
            it.cityName.toLowerCase().equals(city.toLowerCase())
        }
    }
}