package com.chris.mycityapp.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chris.mycityapp.data.DataSource.categories
import com.chris.mycityapp.ui.theme.MyCityAppTheme

@Composable
fun CategorySelectScreen(
    onClick: (String) -> Unit,

) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(categories) { category ->
            ItemDisplay(
                onClick = { onClick(category.categoryName) },
                name = category.categoryName,
                image = category.imageRes,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryPreview() {
    MyCityAppTheme {
        CategorySelectScreen({})
    }
}