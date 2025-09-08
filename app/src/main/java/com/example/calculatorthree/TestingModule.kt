package com.example.calculatorthree

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

//@Composable
//fun TestingModule(
//    modifier: Modifier = Modifier,
//    viewModel: TestingViewModel= viewModel()
//) {
//    Column(modifier = Modifier.fillMaxHeight()) {
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//
//
//        ) {
//            Box (modifier = Modifier
//                .clickable {
//                    viewModel.proccessTesting(TestingCommand.Input(SymbolTesting.ONE))
//                }
//
//            ){
//                Text(
//                    text = "one",
//                    fontWeight = FontWeight.SemiBold,
//                    fontSize = 36.sp
//
//                )
//            }
//            Box {
//                Text(
//                    text = "two",
//                    fontWeight = FontWeight.SemiBold,
//                    fontSize = 36.sp
//
//                )
//            }
//            Box {
//                Text(
//                    text = "three",
//                    fontWeight = FontWeight.SemiBold,
//                    fontSize = 36.sp
//
//                )
//            }
//        }
//    }
//}