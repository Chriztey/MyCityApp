package com.chris.mycityapp.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import com.chris.mycityapp.data.DataSource.restaurants
import com.chris.mycityapp.model.ItemList


@Composable
fun CategoryListItemScreen(
    itemlist: List<ItemList>,
    onClick : (ItemList) -> Unit
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
         items(itemlist) { item ->
             ItemDisplay(
                 onClick = { onClick(item) },
                 name = item.name ,
                 image = item.image )}
    }
}