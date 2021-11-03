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


    fun getAllPlacesList(/*context:Context*/):Flow<List<PlacesToVisit>>{
       return flow{
           emit(persistency.getPlacesList())
           try {
               //if(/*isNetworkConnected(context) */true){
                   val places= network.getFilteredPlacesToVisit("")
                   persistency.savePlaces(places)
                   emit(places)
           //}

           } catch (e: Exception){
               Log.e("ERROR",e.message!!)
           }

       }

    }

    fun getPlacesByCity(cityName: String):List<PlacesToVisit>{
        return persistency.filterPlacesByCity(cityName)
    }


    fun updatePlaces(cityName: String):Flow<Any>{
        return flow {
            emit(persistency.getPlacesList())
            try {
                val placesToVisit = network.getFilteredPlacesToVisit(cityName)
                persistency.savePlaces(placesToVisit)
                emit(placesToVisit)

            } catch (e: Exception) {
                Log.e("ERROR",e.message!!)
            }

        }
    }

}
