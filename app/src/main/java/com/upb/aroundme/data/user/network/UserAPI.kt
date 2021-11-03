package com.upb.aroundme.data.user.network

import com.upb.aroundme.data.user.network.model.LoginRequest
import com.upb.aroundme.data.user.network.model.RegisterRequest
import retrofit2.http.Body
import retrofit2.http.POST


interface UserAPI {
    @POST("/login")
    suspend fun login(@Body loginRequest: LoginRequest)

    @POST("/register")
    suspend fun register(@Body registerRequest: RegisterRequest)
}