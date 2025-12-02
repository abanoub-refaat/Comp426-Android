package com.example.unscramble

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CartScreen(
    price: String,
    nav : NavController,
    modifier: Modifier = Modifier
){
    var listItems =
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(
            text = "the total price is $$price ",
            modifier = Modifier.padding(12.dp)
        )
        Button(onClick = {}) {
            Text("reset")
        }
        LazyColumn(modifier = Modifier.padding(12.dp)) {

        }
        Button(
            onClick = {
            nav.navigate(Routes.Home)
        }) {
            Text("Go to home screen")
        }
    }
}

@Composable
fun ShoppingCard( modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Text(
                text = "Potato",
                modifier = Modifier.padding(16.dp),
            )
            Text(
                text = "Tomato",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}