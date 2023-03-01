package com.example.composeactivity.estados

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

//cuando el valor de los componente cambia los componentes se destrullen y se recrean para acutalizar la vista.
//pero solo cambia los attributos cuyos valores cambiaron. lo que no ha cambiado se queda igual

@Preview(showBackground = true)
@Composable
fun MyStateExample(){

    var counter by rememberSaveable { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Click")
        }
        Text(text = "Clickado $counter veces")
    }
}