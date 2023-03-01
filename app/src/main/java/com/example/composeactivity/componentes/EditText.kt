package com.example.composeactivity.componentes

import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyTextFields(value: String, onValueChange:(String) -> Unit) {
    //se recomienda en la medida de lo posible sacar los estado al nivel superior o padre de este compoente
    var value by remember { mutableStateOf("") }
    TextField(value = value, onValueChange = onValueChange)
}


@Composable
@Preview(showBackground = true)
fun MyAdvanceEditText() {
    var value by rememberSaveable {
        mutableStateOf("")
    }
    TextField(
        value = value,
        onValueChange = {
            if (it.contains("a")) {
                value = it.replace("a", "")
            } else {
                value = it.uppercase()
            }
        },
        label = { Text(text = "your name") }
    )
}



@Composable
@Preview(showBackground = true)
fun MyOutlinedTextFiled(){
    var value by remember { mutableStateOf("") }
    OutlinedTextField(
        value = value,
        onValueChange = {value = it},
        label = { Text(text = "name")},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Red
        ),
        modifier = Modifier.padding(8.dp)
    )
}