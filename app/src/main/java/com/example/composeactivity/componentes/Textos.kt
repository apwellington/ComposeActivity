package com.example.composeactivity.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
@Preview(showBackground = true)
fun MyText(){

    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        //Basic
        Text(text = "Basico")

        //Color
        Text(text = "Con color", color = Color.Blue)
        // Font
        Text(text = "Fuente", fontWeight = FontWeight.ExtraBold)
        // Style
        Text(text = "Fuente", style= TextStyle(fontFamily = FontFamily.Cursive))
        //Decoration
        Text(text = "Fuente", style= TextStyle(textDecoration = TextDecoration.Underline))


        //tamano
        
        Text(text = "Tamanio", fontSize = 30.sp)


    }
}