package com.chris.mycityapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.chris.mycityapp.R

data class ItemList(
    val name: String,
    val description: String,
    @DrawableRes val image: Int,
    @StringRes val long: Int = R.string.lorenipsum,
)
