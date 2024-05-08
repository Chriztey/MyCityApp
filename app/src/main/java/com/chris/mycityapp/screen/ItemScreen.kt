package com.chris.mycityapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chris.mycityapp.R
import com.chris.mycityapp.data.DataSource.restaurants
import com.chris.mycityapp.model.ItemList
import com.chris.mycityapp.ui.theme.MyCityAppTheme

@Composable
fun ItemScreen(
    itemSelected : ItemList
) {
    Column(modifier = Modifier
        .verticalScroll(rememberScrollState()).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(painter = painterResource(id = itemSelected.image), contentDescription = "", modifier = Modifier.padding(8.dp).scale(1f))
        Text(itemSelected.description)
    }
}

@Preview(showBackground = true)
@Composable
fun ItemscreenPreview() {
    MyCityAppTheme {
        ItemScreen(itemSelected = restaurants[0])
    }
}