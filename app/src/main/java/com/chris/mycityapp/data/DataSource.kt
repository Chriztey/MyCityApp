package com.chris.mycityapp.data

import com.chris.mycityapp.R
import com.chris.mycityapp.model.Category
import com.chris.mycityapp.model.ItemList

object DataSource {
    val categories = listOf(
        Category(R.drawable.cat_rest, "Restaurant"),
        Category(R.drawable.cat_hotel, "Hotel"),
        Category(R.drawable.cat_food, "Food"),
        Category(R.drawable.cat_bar, "Bar"),
    )

    val restaurants = listOf(
        ItemList("KASAGIYA","Snug cafe serving traditional Japanese confections, cakes and matcha in a charming setting", R.drawable.rest_kasagiya, R.string.kasagiya),
        ItemList("NO NAME RAMEN", "Compact spot with a concrete counter offering bowls of ramen noodles topped with meat & vegetables", R.drawable.rest_nonameramen, R.string.nonameramen),
        ItemList("OMEN", "One of Kyoto's most beloved restaurants, serving great udon noodles and much more", R.drawable.rest_omen, R.string.omen),
        ItemList("SUSHI SEI", "Sushisei is one of the best moderately priced sushi restaurants in Kyoto. They're relatively comfortable with foreigners and the venue is right downtown", R.drawable.rest_sushisei, R.string.sushisei),
        ItemList("TAKASHIMAYA", "The Takashimiya Resutoran-gai (restaurant floor) is a great place to eat while exploring downtown Kyoto", R.drawable.rest_takashimaya, R.string.takashimaya),
        ItemList("TIGER GYOZA", "Tiger Gyoza, where you can eat a wide variety of great dumplings. Whether they’re pan-fried, boiled, fried, or vegetarian, this place has it all.", R.drawable.rest_tigergyoza,R.string.tigergyoza),
        ItemList("SMART COFFEE", "Smart Coffee is a popular breakfast and coffee place on Teramachi Street (A covered pedestrian street with lots of restaurants and shops) ", R.drawable.rest_smartcoffee, R.string.smartcoffee),
    )

    val hotels = listOf(
        ItemList("GRANVIA", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.hotel_granvia),
        ItemList("KYOMACHIYA", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.hotel_kyomachiya),
        ItemList("MATSUI", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.hotel_mitsui),
        ItemList("SOWAKA", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.hotel_sowaka),
        ItemList("TOU NISHINOTOIN", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.hotel_tou_nishinotoin),
        ItemList("YOSHIDA SANSO", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.hotel_yoshidasanso),
        ItemList("ACE", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.hotel_ace),
    )

    val bars = listOf(
        ItemList("K6", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.bar_k6),
        ItemList("ROCKING CHAIR", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.bar_rockingchair),
    )

    val foods = listOf(
        ItemList("KYOTO KAISEKI", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.food_kyotokaiseki),
        ItemList("KYOTO RAMEN", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.food_kyotoramen),
        ItemList("NISHINSOBA", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.food_nishinsoba),
        ItemList("OBANZAI", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.food_obanzai),
        ItemList("SABA SUSHI", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.food_sabasushi),
        ItemList("SHOJIN RYORI", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.food_shojinryori),
        ItemList("YU DOFU", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", R.drawable.food_yudofu),
    )

}