package com.upb.aroundme.data.places

import android.util.Log
import com.upb.aroundme.data.places.network.PlacesNetworkController
import com.upb.aroundme.data.places.persistency.PlacesPersistencyController
import com.upb.aroundme.model.PlacesToVisit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PlacesRepository(
    private val network: PlacesNetworkController,
    private val persistency: PlacesPersistencyController
) {




    fun getPlacesByCity(cityName: String):Flow<List<PlacesToVisit>>{
        return flow{
            emit(persistency.filterPlacesByCity(cityName))
            try {
                //if(/*isNetworkConnected(context) */true){
                val places= network.getFilteredPlacesToVisit(cityName)
                persistency.savePlaces(places)
                emit(places)
                //}

            } catch (e: Exception){
                Log.e("ERROR",e.message!!)
            }

        }

    }

}
