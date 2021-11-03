package com.upb.aroundme.data.user

import com.upb.aroundme.data.user.network.UserNetworkController
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepository(val network: UserNetworkController) {
    fun login(username:String, password:String): Flow<Any>{
        return flow {
            network.login(username,password)
        }
    }

    fun register(username:String, password:String): Flow<Any>{
        return flow {
            network.register(username,password)
        }
    }
}