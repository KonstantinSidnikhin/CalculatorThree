package com.example.calculatorthree

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.random.Random

class CalculatorViewModel : ViewModel() {
    private val _state: MutableStateFlow<CalculatorState> = MutableStateFlow(
        CalculatorState.Initial
    )
    val state = _state.asStateFlow()

    fun proccessCommand(command: CalculatorCommand) {
        Log.d("proccesCommand", "Command: $command")
        when (command) {
            CalculatorCommand.Clear -> {
                _state.value = CalculatorState.Initial
            }

            CalculatorCommand.Evaluate -> {
                val isError = Random.nextBoolean()
                _state.value = if (isError){
                    CalculatorState.Error("100/0")
                }else{
                    CalculatorState.Success("100")
                }
            }
            is CalculatorCommand.Input -> {
                _state.value = CalculatorState.Input(
                    expression = command.symbol.name,
                    result = "anything"
                )
            }
        }
    }

}

sealed interface CalculatorState {
    data object Initial : CalculatorState
    data class Input(val expression: String, val result: String) : CalculatorState
    data class Success(val result: String) : CalculatorState
    data class Error(val expression: String) : CalculatorState
}

sealed interface CalculatorCommand {
    data object Clear : CalculatorCommand
    data object Evaluate : CalculatorCommand
    data class Input(val symbol: Symbol) : CalculatorCommand
}

enum class Symbol {
    DIGIT_0,
    DIGIT_1,
    DIGIT_2,
    DIGIT_3,
    DIGIT_4,
    DIGIT_5,
    DIGIT_6,
    DIGIT_7,
    DIGIT_8,
    DIGIT_9,
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    PERCENT,
    POWER,
    FACTORIAL,
    SQRT,
    PI,
    DOT,
    PARENTHESIS

}

data class Display(
    val expression: String,
    val result: String
)
