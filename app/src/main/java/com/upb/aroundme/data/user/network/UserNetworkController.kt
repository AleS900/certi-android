package com.upb.aroundme.data.user.network

interface UserNetworkController {
    suspend fun login(username: String, password: String)
    suspend fun register(username: String, password: String)
}