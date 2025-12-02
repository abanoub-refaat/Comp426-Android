package com.example.lemonade_drink_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade_drink_app.ui.theme.Lemonade_drink_appTheme
import kotlin.math.round
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lemonade_drink_appTheme {
                LemonadeScreenPreview()
            }
        }
    }
}

@Composable
fun LemonadeScreenToggle(
    modifier: Modifier = Modifier
) {
    var screenNumber by remember { mutableIntStateOf(0) }
    var squeezeTime by remember { mutableIntStateOf((1..4).random()) }
    var clickedNumber by remember { mutableIntStateOf(0)}

    val printerResource = when(screenNumber){
        0 -> R.drawable.lemon_tree
        1 -> R.drawable.lemon_squeeze
        2 -> R.drawable.lemon_drink
        3 -> R.drawable.lemon_restart
        else -> R.drawable.lemon_tree
    }

    val stringResource = when(screenNumber){
        0 -> R.string.lemon_tree
        1 -> R.string.lemon_squeeze
        2 -> R.string.lemon_drink
        3 -> R.string.lemon_restart
        else -> R.string.lemon_tree
    }

    val contentDescriptionResource = when(screenNumber){
        0 -> R.string.lemon_tree_content_description
        1 -> R.string.lemon_content_description
        2 -> R.string.lemon_glass_content_description
        3 -> R.string.empty_glass_content_description
        else -> R.string.lemon_tree_content_description
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Button(
            onClick = {
                when (screenNumber) {
                    0 -> screenNumber = 1
                    1 -> {
                        if (clickedNumber < squeezeTime){
                            clickedNumber += 1
                        } else {
                            screenNumber = 2
                            clickedNumber = 0
                            squeezeTime = (1..4).random()
                        }
                    }
                    2 -> screenNumber = 3
                    3 -> screenNumber = 0
                    else -> 0
                }
            },
            modifier = modifier,
            shape = RoundedCornerShape(16),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer)
            ) {
            Image(
                painter = painterResource(printerResource),
                contentDescription = stringResource(contentDescriptionResource)
            )
        }
        Spacer(modifier = modifier.padding(16.dp))
        Text(
            text = stringResource(stringResource),
            fontSize = 18.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadeScreenPreview() {
    Lemonade_drink_appTheme {
        LemonadeScreenToggle()
    }
}