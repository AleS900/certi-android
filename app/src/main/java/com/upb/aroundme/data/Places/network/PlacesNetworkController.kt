package com.upb.aroundme.data.Places.network

import retrofit2.Retrofit

class PlacesNetworkController {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://api.aroundme.io")  //ip pc local
        //.addCallAdapterFactory() TODO
        .build()
}