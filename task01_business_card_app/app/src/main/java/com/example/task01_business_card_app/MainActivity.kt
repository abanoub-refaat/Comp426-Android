package com.example.task01_business_card_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task01_business_card_app.ui.theme.Task01_business_card_appTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Task01_business_card_appTheme {
                Surface (modifier = Modifier.fillMaxSize().background(Color(0xFF3D87A8))){
                    InformationSection(
                        stringResource(R.string.name_text),
                        stringResource(R.string.job_title_text),
                        painterResource(R.drawable.gemini_generated_image_a1mobda1mobda1mo)
                    )
                    ContactMeSection(
                        "+20 1147280044",
                        "abanoubref3at18@gmail.com",
                        "abanoub-refaat"
                    )
                }
            }
        }
    }
}

@Composable
fun InformationSection(
    name: String,
    title: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier
) {
    Column (modifier = modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Image(
            painter = imagePainter,
            contentDescription = "this is a personal photo of $name",
            modifier = modifier
                .height(150.dp)
                .width(150.dp)
                .background(Color.Black)
        )
        Text(
            text = name,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(12.dp)
        )
        Text(
            text = title,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ContactMeSection(
    phoneNumber: String,
    emailAddress: String,
    github: String,
    modifier: Modifier = Modifier
){
    Column (modifier = modifier.padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom){
        Row (modifier = modifier.padding(10.dp)) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = "Phone icon"
            )
            Text(
                text = phoneNumber,
                textAlign = TextAlign.Center,
                modifier = modifier.padding(start = 12.dp)
            )
        }
        Row (modifier = modifier.padding(10.dp)) {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "Email icon"
            )
            Text(
                text = emailAddress,
                textAlign = TextAlign.Center,
                modifier = modifier.padding(start = 12.dp)
            )
        }
        Row (modifier = modifier.padding(10.dp)){
            Icon(
                imageVector = Icons.Rounded.AccountCircle,
                contentDescription = "GitHub icon"
            )
            Text(
                text = github,
                textAlign = TextAlign.Center,
                modifier = modifier.padding(start = 12.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Task01_business_card_appTheme {
        InformationSection(
            stringResource(R.string.name_text), stringResource(R.string.job_title_text),
            painterResource(R.drawable.android_logo)
        )
    }
}