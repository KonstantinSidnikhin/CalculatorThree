package com.example.calculatorthree

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

//class TestingViewModel : ViewModel() {
//
//   private val state = MutableStateFlow(
//        CalculatorState.Initial
//    )
//
//    fun proccessTesting(command: TestingCommand) {
//        when(command) {
//            is TestingCommand.Input -> state.value = DisplayTwo("Input","InputTwo")
//            TestingCommand.OneShow -> {}
//            TestingCommand.TwoShow -> {}
//        }
//
//    }
//
//}
//sealed interface CalculatorState{
//    data object Initial: CalculatorState
//    data class Input(val expression: String, val result: String): CalculatorState
//    data class Success(val result: String): CalculatorState
//    data class Error(val expression:String): CalculatorState
//}
//sealed interface TestingCommand {
//    data object OneShow : TestingCommand
//    data object TwoShow : TestingCommand
//    data class Input(val symbol: SymbolTesting) : TestingCommand
//}
//
//enum class SymbolTesting {
//    ONE,
//    TWO,
//    THREE
//
//}
//
//data class DisplayTwo(
//    val expressionTwo: String,
//    val resultTwo: String
//)