package com.upb.aroundme.model

import java.io.Serializable

data class PlacesToVisit(
    val cityName: String,
    val placeName: String,
    val urlImage : String,
    val placeDescription : String,
    val information : String,
    val likeCont : Int
    ): Serializable

