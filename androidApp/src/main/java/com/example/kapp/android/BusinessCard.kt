package com.example.kapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kapp.android.ui.theme.KappTheme

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Blue
                ) {

                }
            }
        }
    }
}

@Composable
fun ImageWithText(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ComposeUi.ImageCompose(image = R.drawable.android_logo, modifier = modifier
            .width(65.dp)
            .height(65.dp))

        ComposeUi.TextCompose(text = "Collins Ihezie", fontSize = 24.sp)

        ComposeUi.TextCompose(text = "Android Developer Extraordinaire", fontWeight = FontWeight.Bold)
    }
}

@Composable
fun BusinessContact(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier.padding(bottom = 24.dp)
    ) {
        Divider()

        Row(
            modifier = modifier.padding(16.dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_baseline_local_phone_24), contentDescription = null, tint = Color.Green, modifier = modifier.padding(end = 8.dp))

            ComposeUi.TextCompose(text = "+234 813 8544 383")
        }

        Divider()

        Row(
            modifier = modifier.padding(16.dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_baseline_share_24), contentDescription = null, tint = Color.Green, modifier = modifier.padding(end = 8.dp))

            ComposeUi.TextCompose(text = "@Starrex_Dev")
        }

        Divider()

        Row(
            modifier = modifier.padding(16.dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_baseline_email_24), contentDescription = null, tint = Color.Green, modifier = modifier.padding(end = 8.dp))

            ComposeUi.TextCompose(text = "collinsihezie6@gmail.com")
        }
    }
}

@Composable
fun BusinessCardCompose(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "")

        ImageWithText()

        BusinessContact()
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    KappTheme {
        Surface(color = Color.Magenta) {
            BusinessCardCompose()
        }
    }
}