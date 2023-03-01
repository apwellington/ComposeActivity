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


@Preview(showBackground = true)
@Composable
fun MyColum(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        MyInnerBox(color = Color.Green)
        MyInnerBox(color = Color.Cyan)
        MyInnerBox(color = Color.Blue)
        MyInnerBox(color = Color.Red)
        MyInnerBox(color = Color.Magenta)
        MyInnerBox(color = Color.Yellow)
        MyInnerBox(color = Color.Blue)
        MyInnerBox(color = Color.LightGray)
        MyInnerBox(color = Color.DarkGray)
        MyInnerBox(color = Color.Yellow)
    }
}

@Composable
fun MyInnerBox(color: Color){
    Box(
        modifier = Modifier
            .width(300.dp)
            .height(100.dp)
            .background(color)
            .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.Center
    ){
        Text(text = "My Box", fontFamily = FontFamily.SansSerif)
    }
}
