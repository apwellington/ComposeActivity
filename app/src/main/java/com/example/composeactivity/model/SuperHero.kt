package com.example.composeactivity.model

import androidx.annotation.DrawableRes

data class SuperHero(
    var name: String,
    var alias: String,
    var publisher:String,
    @DrawableRes val image: Int
)
