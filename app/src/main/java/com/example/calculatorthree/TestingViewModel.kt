package com.example.calculatorthree

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class TestingViewModel : ViewModel() {

    val state = mutableStateOf(
        DisplayTwo("45*8", "360")
    )

    fun proccessTesting(command: TestingCommand) {
        when(command) {
            is TestingCommand.Input -> state.value = DisplayTwo("Input","InputTwo")
            TestingCommand.OneShow -> {}
            TestingCommand.TwoShow -> {}
        }

    }

}

sealed interface TestingCommand {
    data object OneShow : TestingCommand
    data object TwoShow : TestingCommand
    data class Input(val symbol: SymbolTesting) : TestingCommand
}

enum class SymbolTesting {
    ONE,
    TWO,
    THREE

}

data class DisplayTwo(
    val expressionTwo: String,
    val resultTwo: String
)