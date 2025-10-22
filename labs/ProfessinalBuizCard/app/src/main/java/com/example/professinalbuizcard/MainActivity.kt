package com.example.professinalbuizcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.professinalbuizcard.ui.theme.ProfessinalBuizCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfessinalBuizCardTheme {
                Surface(color = MaterialTheme.colorScheme.background){
                    CreateBuizCard()
                }
            }
        }
    }
}

@Composable
fun CreateBuizCard(){
    Surface (modifier = Modifier.fillMaxWidth().fillMaxHeight().background(Color.White)) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(390.dp)
                .padding(top= 26.dp)
                .padding(bottom = 26.dp)
                .padding(start = 12.dp)
                .padding(end = 12.dp),
            shape = RoundedCornerShape(corner = CornerSize(16.dp))
        ){
            Column (
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(12.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                CreateImageProfile()
                CreateInformationSection(
                    name = "Abanoub Refaat Ibrahim",
                    jobTitle = "Android JetBack Compose Developer",
                )
                HorizontalDivider(
                    modifier = Modifier
                        .width(250.dp)
                        .padding(12.dp),
                    thickness = 3.dp,
                )
                CreateContactsSection()
            }
        }
    }
}

@Composable
private fun CreateContactsSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "CONTACT ME VIA",
            modifier = Modifier.padding(6.dp),
            style = MaterialTheme.typography.labelLarge
        )
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = "Phone icon",
                modifier = Modifier.padding(end = 5.dp)
            )
            Text("+20 1147280044")
        }
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Rounded.AccountCircle,
                contentDescription = "Phone icon",
                modifier = Modifier.padding(end = 5.dp)
            )
            Text("@abanoub-refaat")
        }
        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "Phone icon",
                modifier = Modifier.padding(end = 5.dp)
            )
            Text("abanoubref3at18")
        }
    }
}

@Composable
private fun CreateInformationSection(
    modifier: Modifier = Modifier,
    name:String,
    jobTitle: String,
) {
    Column(
        modifier = modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(4.dp)
        )
        Text(text = jobTitle)
    }
}

@Composable
private fun CreateImageProfile(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .size(150.dp)
            .padding(5.dp),
        shape = CircleShape,
        border = BorderStroke(width = 0.5.dp, Color.LightGray),
        shadowElevation = 2.dp,
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.professional_picture),
            contentDescription = "profile image",
            modifier = modifier.size(135.dp),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    ProfessinalBuizCardTheme {
        CreateBuizCard()
    }
}