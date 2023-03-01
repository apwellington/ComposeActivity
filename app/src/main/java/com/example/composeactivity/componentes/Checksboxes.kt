package com.example.composeactivity.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview(showBackground = true)
fun MyCheckBox(){
    var state by rememberSaveable{ mutableStateOf(true) }

    Column(modifier = Modifier.fillMaxSize()) {
        Checkbox(
            checked = state,
            onCheckedChange = {state = !state},
            enabled = true
        )

       Row(modifier = Modifier.padding(8.dp)) {
           Checkbox(checked = state, onCheckedChange = {state = !state})
           Spacer(modifier = Modifier.width(8.dp))
           Text(text = "Texto del chech box")
       }

        //chekcbox indeterminado

    }

}