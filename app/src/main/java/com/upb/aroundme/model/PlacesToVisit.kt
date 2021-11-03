package com.upb.aroundme.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class PlacesToVisit(@PrimaryKey val id: Int,
    val cityName: String,
    val placeName: String,
    val urlImage : String,
    val placeDescription : String,
    val information : String,
    val likeCont : Int
    ): Serializable

