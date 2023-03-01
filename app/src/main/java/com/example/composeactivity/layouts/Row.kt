package com.example.composeactivity.layouts

import androidx.compose.ui.graphics.Color

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyRow(){
    Row(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        RowBox(color = Color.Blue)
        RowBox(color = Color.Blue)
        RowBox(color = Color.Blue)
        RowBox(color = Color.Blue)
        RowBox(color = Color.Blue)
    }
}

@Composable
fun RowBox(color: Color){
    Box(
        modifier = Modifier
            .width(50.dp)
            .height(50.dp)
            .background(color),
        contentAlignment = Alignment.Center
    ){
        Text(text = "My Box", fontFamily = FontFamily.SansSerif)
    }
}