package com.example.composeactivity.componentes

import androidx.compose.foundation.layout.Row
import androidx.compose.material.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun MyRadio(){
    Row {
        RadioButton(selected = true, onClick = {  })
        RadioButton(selected = true, onClick = {  })
        RadioButton(selected = true, onClick = {  })
        RadioButton(selected = true, onClick = {  })
    }


}