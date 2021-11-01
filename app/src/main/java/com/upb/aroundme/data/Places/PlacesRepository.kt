package com.upb.aroundme.data.Places

import android.content.Context
import com.upb.aroundme.data.Places.network.PlacesNetworkController
import com.upb.aroundme.data.Places.persistency.PlacesPersistencyController
import com.upb.aroundme.isNetworkConnected
import com.upb.aroundme.model.PlacesToVisit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.security.AccessControlContext

class PlacesRepository {

    val network = PlacesNetworkController()
    val persistency = PlacesPersistencyController()

   // ESTE PEX DE ABAJO TIENE QUE ESTAR EN EL getPlaceListForCity, Y LA FUN getAllPlacesList NO ES NECESARIA
    fun getAllPlacesList(context: Context): Flow<List<PlacesToVisit>>{
        return flow {
            emit(persistency.getPlacesList())
            try {
                if (isNetworkConnected(context)) {
                    val placesToVisit = network.getAllPlacesToVisit()
                    persistency.savePlaces(placesToVisit)
                    emit(placesToVisit)
                }
            } catch (e: Exception) {}

        }
    }

    fun getPlaceListForCity(city : String): List<PlacesToVisit>{
        return persistency.filterPlacesByCity(city)
        }
    }
