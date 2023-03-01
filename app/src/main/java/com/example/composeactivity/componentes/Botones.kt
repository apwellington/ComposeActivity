package com.example.composeactivity.componentes

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview(showBackground = true)
fun MyButton(){
    var isEnable by rememberSaveable { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = { isEnable= !isEnable},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red, contentColor = Color.White),
            border = BorderStroke(2.dp, Color.Blue),
            enabled = isEnable,
        ) {
            Text(text = "Click")
        }

        OutlinedButton(
            onClick = { isEnable= !isEnable},
            enabled = !isEnable,
        ) {
            Text(text = "Click")
        }


        TextButton(
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Click Here")
        }
    }
}