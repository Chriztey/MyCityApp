package com.chris.mycityapp.model

import androidx.annotation.DrawableRes

data class Category(
    @DrawableRes val imageRes: Int,
    val categoryName: String
)
