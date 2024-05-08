package com.chris.mycityapp.model

import androidx.annotation.DrawableRes

data class ItemList(
    val name: String,
    val description: String,
    @DrawableRes val image: Int,
)
