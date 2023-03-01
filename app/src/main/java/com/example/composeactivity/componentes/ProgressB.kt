package com.example.composeactivity.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue;
import androidx.compose.runtime.setValue;

@Composable
@Preview(showBackground = true)
fun MyProgressBar() {

    var showLoading by rememberSaveable { mutableStateOf(true) }
    var progress by rememberSaveable { mutableStateOf(0.1f) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showLoading) {
            CircularProgressIndicator(color = Color.Red, strokeWidth = 8.dp, progress = progress)
            Spacer(modifier = Modifier.height(16.dp))
            LinearProgressIndicator(
                color = Color.Red,
                backgroundColor = Color.Blue,
                progress = progress
            )
            Spacer(modifier = Modifier.height(16.dp))
        }

        Button(
            onClick = { showLoading = !showLoading },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)
        ) {
            Text(text = "Stop Loading")
        }

        Button(
            onClick = { progress += 0.1f },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green)
        ) {
            Text(text = "Increase Progress")
        }

        Button(
            onClick = { progress -= 0.1f },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
        ) {
            Text(text = "decrease Progress")
        }
    }
}