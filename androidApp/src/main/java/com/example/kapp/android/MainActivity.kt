package com.example.kapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }

    //It's a best practice to have your Composable accept a Modifier parameter
    @Composable
    private fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier) {
        Column(modifier = modifier
            .padding(16.dp)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(text = message, fontSize = 36.sp, color = Color.White)

            Text(text = from, fontSize = 24.sp, color = Color.White)
        }
    }

    @Composable
    private fun BirthdayGreetingWithImage(message: String, from: String, modifier: Modifier = Modifier) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.androidparty),
                contentDescription = "androidparty.png",
                //ContentScale.Crop parameter scaling, which scales the
                // image uniformly to maintain the aspect ratio so that the
                // width and height of the image are equal to, or larger than,
                // the corresponding dimension of the screen
                contentScale = ContentScale.Crop
            )

            BirthdayGreetingWithText(message = message, from = from)
        }
    }

    @Composable
    private fun JetpackComposePage(modifier: Modifier = Modifier) {
        Column {
            ComposeUi.ImageCompose(image = R.drawable.bg_compose_background)

            Column(modifier = modifier.padding(16.dp)) {
                ComposeUi.TextCompose(text = stringResource(id = R.string.jetpack_compose), fontSize = 24.sp, modifier = modifier.padding(16.dp))

                ComposeUi.TextCompose(text = stringResource(id = R.string.first_text), fontSize = 16.sp, modifier = modifier.padding(16.dp))

                ComposeUi.TextCompose(text = stringResource(id = R.string.second_text), fontSize = 16.sp, modifier = modifier.padding(16.dp))
            }
        }
    }

    @Composable
    private fun TaskManagerPage(modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ComposeUi.ImageCompose(image = R.drawable.ic_task_completed)

            ComposeUi.TextCompose(text = stringResource(id = R.string.all_tasks), fontWeight = FontWeight.Bold, modifier = modifier.padding(top = 24.dp, bottom = 8.dp))
            ComposeUi.TextCompose(text = stringResource(id = R.string.nice_work))
        }
    }

    @Composable
    private fun ColoredCard(color: Color, title: String, text: String, modifier: Modifier = Modifier) {
        Card(backgroundColor = color, elevation = 4.dp, modifier = modifier.padding(4.dp)) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                ComposeUi.TextCompose(text = title, fontWeight = FontWeight.Bold, modifier = modifier.padding(bottom = 8.dp))

                ComposeUi.TextCompose(text = text)
            }
        }
    }

    @Composable
    private fun ComposeQuadrant(modifier: Modifier = Modifier) {
        Column(modifier = modifier.fillMaxWidth()) {
            Row(
                modifier = modifier.weight(1f)
            ) {
                ColoredCard(color = Color.Green, title = "Text composable", text = "Displays text and follows Material Design guidelines.", modifier = modifier.weight(1f))

                ColoredCard(color = Color.Yellow, title = "Image composable", text = "Creates a composable that lays out and draws a given Painter class object.",modifier = modifier.weight(1f))
            }

            Row(
                modifier = modifier.weight(1f)
            ) {
                ColoredCard(color = Color.Cyan, title = "Row composable", text = "A layout composable that places its children in a horizontal sequence.", modifier = modifier.weight(1f))

                ColoredCard(color = Color.LightGray, title = "Column composable", text = "A layout composable that places its children in a vertical sequence.", modifier = modifier.weight(1f))
            }
        }

    }

    @Composable
    private fun TextField(){

    }

    @Preview("Text Preview", showBackground = true, showSystemUi = true)
    @Composable
    private fun TextPreview() {
        MyApplicationTheme {
            Surface(color = Color.White) {
                //JetpackComposePage()
                //TaskManagerPage()
                ComposeQuadrant()
            }
        }
    }
}


