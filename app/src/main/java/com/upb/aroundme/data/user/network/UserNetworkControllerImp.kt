package com.upb.aroundme.data.user.network

import com.upb.aroundme.data.user.network.model.LoginRequest
import com.upb.aroundme.data.user.network.model.RegisterRequest
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserNetworkControllerImp: UserNetworkController {
    val client = Retrofit.Builder()
        .baseUrl("http://192.168.1.20:1880")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(UserAPI::class.java)

    override suspend fun login(username: String, password: String) {
        return client.login(LoginRequest(username,password))
    }
    override suspend fun register(username: String, email:String, password: String) {
        return client.register(RegisterRequest(username,email,password))
    }
}