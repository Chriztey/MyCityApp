package com.chris.mycityapp.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.chris.mycityapp.R
import com.chris.mycityapp.data.DataSource
import com.chris.mycityapp.model.CityAppViewModel
import com.chris.mycityapp.ui.theme.MyCityAppTheme

enum class MyCityAppScreen(var title: String ) {
    MyCityApp("My City App"),
    ItemList("Category"),
    Item("Item")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    currentScreen: MyCityAppScreen,
    hasBackStack: Boolean,
    navigateUp: () -> Unit = {}
) {
    androidx.compose.material3.TopAppBar(
        title = { Text(text = currentScreen.title)},
        navigationIcon = {
            if(hasBackStack) {
                IconButton(onClick = navigateUp) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
                }
            }
        }
    )
}

@Composable
fun CityAppScreen(
    cityViewModel: CityAppViewModel = viewModel(),
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
    ) {

    val uiState by cityViewModel.cityAppUIState.collectAsState()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = MyCityAppScreen.valueOf(backStackEntry?.destination?.route ?: MyCityAppScreen.MyCityApp.name)

    Scaffold(
        topBar = { TopAppBar(
            currentScreen = currentScreen,
            hasBackStack = navController.previousBackStackEntry != null,
            navigateUp = {
                navController.navigateUp() }
            ) }
    ) { paddingValues ->

        NavHost(
            navController = navController,
            startDestination = MyCityAppScreen.MyCityApp.name,
            modifier = Modifier.padding(paddingValues)
        ) {

            composable(MyCityAppScreen.MyCityApp.name) {
                CategorySelectScreen {
                    cityViewModel.onCategoryClicked(it)

                    navController.navigate(MyCityAppScreen.ItemList.name)

                }
            }

            composable(MyCityAppScreen.ItemList.name) {
                currentScreen.title = uiState.categorySelect
                CategoryListItemScreen(itemlist =

                when(uiState.categorySelect) {
                    "Restaurant" -> DataSource.restaurants
                    "Hotel" -> DataSource.hotels
                    "Bar" -> DataSource.bars
                    else -> DataSource.parks
                }

                ) {

                    cityViewModel.onItemClicked(it)
                    navController.navigate(MyCityAppScreen.Item.name)

                }
            }

            composable(MyCityAppScreen.Item.name) {

                currentScreen.title = uiState.selectedItem?.name ?: ""
                uiState.selectedItem?.let { it1 -> ItemScreen(itemSelected = it1) }

            }

        }
    }
}



@Preview(showBackground = true)
@Composable
fun AppPreview() {
    MyCityAppTheme {
        CityAppScreen()

    }
}