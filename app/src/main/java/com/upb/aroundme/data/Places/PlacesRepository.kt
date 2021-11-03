package com.upb.aroundme.data.Places

import android.content.Context
import android.util.Log
import com.upb.aroundme.data.Places.network.PlacesNetworkController
import com.upb.aroundme.data.Places.network.PlacesNetworkControllerImp
import com.upb.aroundme.data.Places.persistency.PlacesPersistencyController
import com.upb.aroundme.data.Places.persistency.PlacesPersistencyControllerImp
import com.upb.aroundme.isNetworkConnected
import com.upb.aroundme.model.PlacesToVisit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.net.ContentHandler

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
