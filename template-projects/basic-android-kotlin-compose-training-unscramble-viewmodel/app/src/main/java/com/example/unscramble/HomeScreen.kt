package com.example.unscramble

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun HomeScreen(
    nav : NavController,
    modifier: Modifier = Modifier,
    count: Int = 0,
    ){
    Column (modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "The total count is $count",
            modifier = Modifier.padding(12.dp)
        )
        Row {
            Card(modifier = Modifier.padding(12.dp)) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Button(onClick = {}) {
                        Text(
                            text = "Potato",
                        )
                        Text(
                            text = "3$",
                        )
                    }
                }
            }
            Card (modifier = Modifier.padding(12.dp)){
                Column(modifier = Modifier.padding(12.dp)) {
                    Button(onClick = {}) {
                        Text(
                            text = "Tomato",
                        )
                        Text(
                            text = "5$"
                        )
                    }
                }
            }
        }
        Button(
            onClick = {
                nav.navigate(Routes.Shopping)
        }) {
            Text(
                "Go to cart"
            )
        }
    }
}

fun increaseTimer(count: Int): Int{
    var newCount = count
    return newCount++
}
