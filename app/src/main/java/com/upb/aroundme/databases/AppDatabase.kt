package com.upb.aroundme.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.upb.aroundme.databases.daos.PlacesDao
import com.upb.aroundme.model.PlacesToVisit

@Database(entities = [PlacesToVisit::class],version=1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun placesDao(): PlacesDao
}