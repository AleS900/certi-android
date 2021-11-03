package com.upb.aroundme.databases.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.upb.aroundme.model.PlacesToVisit

@Dao
interface PlacesDao {

    @Query("SELECT * FROM placestovisit")
    fun getPlacesList(): List<PlacesToVisit>

    @Insert
    fun saveSelectPlaces(places: List<PlacesToVisit>)

    @Query("SELECT * FROM placestovisit WHERE cityName LIKE :query")
    fun selectPlaces(query:String): List<PlacesToVisit>
}