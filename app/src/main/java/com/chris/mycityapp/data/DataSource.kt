package com.chris.mycityapp.data

import com.chris.mycityapp.R
import com.chris.mycityapp.model.Category
import com.chris.mycityapp.model.ItemList

object DataSource {
    val categories = listOf(
        Category(R.drawable.ic_launcher_background, "Restaurant"),
        Category(R.drawable.ic_launcher_background, "Hotel"),
        Category(R.drawable.ic_launcher_background, "Park"),
        Category(R.drawable.ic_launcher_background, "Bar"),
    )

    val restaurants = listOf(
        ItemList("Rest A", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Rest B", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Rest C", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Rest D", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Rest E", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Rest F", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
    )

    val hotels = listOf(
        ItemList("Hotl A", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Hotl B", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Hotl C", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Hotl D", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Hotl E", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Hotl F", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
    )

    val bars = listOf(
        ItemList("Bars A", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Bars B", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Bars C", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Bars D", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Bars E", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Bars F", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
    )

    val parks = listOf(
        ItemList("Park A", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Park B", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Park C", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Park D", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Park E", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
        ItemList("Park F", "Good njdnjsndsnmmsdmsmdsdsndjsndjsndjsndjsndjsndjndjs", R.drawable.ic_launcher_background),
    )

}