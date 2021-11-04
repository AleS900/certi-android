package com.upb.aroundme

import android.app.Application
import androidx.room.Room
import com.upb.aroundme.data.user.UserRepository
import com.upb.aroundme.data.user.network.UserNetworkController
import com.upb.aroundme.data.user.network.UserNetworkControllerImp
import com.upb.aroundme.databases.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App: Application() {
    companion object{
        lateinit var db : AppDatabase
    }
    val appModule = module {
        single<UserNetworkController>{UserNetworkControllerImp()}
        single{UserRepository(get())}
    }
    override fun onCreate() {
        super.onCreate()
        db= Room.databaseBuilder(this,AppDatabase::class.java,"app-db").build()


        startKoin{
            androidLogger()
            androidContext(this@App)
            modules(appModule)
        }
    }
}