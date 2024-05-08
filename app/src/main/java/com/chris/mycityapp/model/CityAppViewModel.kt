package com.chris.mycityapp.model

import androidx.lifecycle.ViewModel
import com.chris.mycityapp.data.CityAppUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CityAppViewModel : ViewModel() {
    private val _cityAppUIState = MutableStateFlow(CityAppUIState())
    val cityAppUIState : StateFlow<CityAppUIState> = _cityAppUIState.asStateFlow()

    fun onCategoryClicked(category: String) {
        _cityAppUIState.update { currentState -> currentState
            .copy(
                categorySelect = category,
            ) }
    }

    fun onItemClicked(item: ItemList) {
        _cityAppUIState.update { currentState -> currentState.copy(
            categorySelect = currentState.categorySelect,
            selectedItem = item,
        )}
    }

}