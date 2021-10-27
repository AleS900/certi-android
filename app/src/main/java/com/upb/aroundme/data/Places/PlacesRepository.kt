package com.upb.aroundme.data.Places

import com.upb.aroundme.data.Places.network.PlacesNetworkController
import com.upb.aroundme.data.Places.persistency.PlacesPersistencyController
import com.upb.aroundme.model.PlacesToVisit

class PlacesRepository {

    val network = PlacesNetworkController()
    val persistency = PlacesPersistencyController()


    fun getAllPlacesList(): List<PlacesToVisit>{
        return persistency.getPlacesList()
    }

    fun getPlaceListForCity(city : String): List<PlacesToVisit>{
        return persistency.filterPlacesByCity(city)
        }
    }
