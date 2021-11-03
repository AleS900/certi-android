package com.upb.aroundme

import android.app.Application
import androidx.room.Room
import com.upb.aroundme.databases.AppDatabase

class App: Application() {
    companion object{
        lateinit var db: AppDatabase

    }

    override fun onCreate() {
        super.onCreate()
        db= Room.databaseBuilder(this,AppDatabase::class.java,"app-db").build()
    }
}