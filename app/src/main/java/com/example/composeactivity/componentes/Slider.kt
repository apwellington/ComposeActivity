package com.example.composeactivity.componentes

import androidx.compose.material.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun MySlider(){
    var valueF by remember {
        mutableStateOf(0f)
    }
    Slider(value = 0.1f, onValueChange = {valueF = 1.0f}, valueRange = 0f..99f, steps = 10)
}