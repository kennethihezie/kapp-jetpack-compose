package com.example.kapp.android

import androidx.compose.foundation.Image
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

object ComposeUi {
    @Composable
    fun ImageCompose(image: Int, modifier: Modifier = Modifier, contentScale: ContentScale = ContentScale.Fit) {
        Image(painter = painterResource(id = image), contentDescription = null, contentScale = contentScale, modifier = modifier)
    }

    @Composable
    fun TextCompose(text: String, modifier: Modifier = Modifier, fontSize: TextUnit = 16.sp, fontWeight: FontWeight = FontWeight.Normal, align: TextAlign = TextAlign.Justify) {
        Text(text = text, fontSize = fontSize, fontWeight = fontWeight, modifier = modifier, textAlign = align)
    }
}