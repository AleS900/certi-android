package com.upb.aroundme.data.places.network

import com.upb.aroundme.model.PlacesToVisit

interface PlacesNetworkController {
    suspend fun getFilteredPlacesToVisit(cityName:String):List<PlacesToVisit>
}