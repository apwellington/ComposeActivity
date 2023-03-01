package com.example.composeactivity.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun ScreenCombination() {
    val items = listOf<String>("UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE")
    MainContainer(items = items)
}

@Composable
fun MainContainer(items: List<String>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        items.forEach { RowContainer(item = it) }
    }
}

@Composable
fun RowContainer(item: String) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp), horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        BoxContent(item = item)
    }
}

@Composable
fun BoxContent(item: String) {
    Box(
        modifier = Modifier
            .width(300.dp)
            .height(100.dp)
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Text(text = item, fontFamily = FontFamily.SansSerif)
    }
}