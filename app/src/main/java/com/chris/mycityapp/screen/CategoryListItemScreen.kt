package com.chris.mycityapp.screen

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import com.chris.mycityapp.data.DataSource.bars
import com.chris.mycityapp.data.DataSource.foods
import com.chris.mycityapp.data.DataSource.hotels
import com.chris.mycityapp.data.DataSource.restaurants
import com.chris.mycityapp.model.ItemList
import com.chris.mycityapp.ui.theme.MyCityAppTheme


@Composable
fun CategoryListItemScreen(
    itemlist: List<ItemList>,
    onClick : (ItemList) -> Unit
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.animateContentSize(spring(Spring.DampingRatioMediumBouncy, Spring.StiffnessLow))
    ) {
         items(itemlist) { item ->
             ItemDisplay(
                 onClick = { onClick(item) },
                 name = item.name ,
                 image = item.image,
                 shortText = item.description
                 )}
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryListItemPreview() {
    MyCityAppTheme {
        CategoryListItemScreen(itemlist = restaurants) {

        }
    }
}