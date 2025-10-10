package com.example.lab01_android_basics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab01_android_basics.ui.theme.Lab01_android_basicsTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab01_android_basicsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ){
                    GreetingText("Happy Birthday Mom!", "from Abanoub")
                }
            }
        }
    }
}


@Composable
fun GreetingText(message: String, from: String,modifier: Modifier = Modifier) {
    Column (modifier = modifier) {
        Text(
            text = message,
            fontSize = 30.sp,
            lineHeight = 116.sp
        )
        Text(
            text = from,
            fontSize = 10.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = false, name="my first preview")
@Composable
fun BirthdayCardPreview() {
    Lab01_android_basicsTheme {
        GreetingText("Happy Birthday Mom!", from = "From Abanoub")
    }
}