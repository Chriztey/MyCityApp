package com.chris.mycityapp.data

import com.chris.mycityapp.model.ItemList

data class CityAppUIState(
    val categorySelect: String = "",
    val selectedItem: ItemList? = null,
)