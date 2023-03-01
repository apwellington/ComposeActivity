package com.example.composeactivity.componentes

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons.Rounded
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun MyIcons(){
    Icon(imageVector = Rounded.Favorite, contentDescription = "Favorito", tint = Color.Red)
}