package com.bendeng.composepratice

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class Main3UiState(
    val name : String = ""
)

class Main3ViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(Main3UiState())
    val uiState : StateFlow<Main3UiState> = _uiState.asStateFlow()

    fun textUpdate(value : String){
        _uiState.value = Main3UiState(value)
//        _uiState.update { state ->
//            state.copy(
//                name = value
//            )
//        }
    }
}