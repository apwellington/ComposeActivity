package com.example.composeactivity.componentes

import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun MyAlerDialogs() {
    AlertDialog(
        onDismissRequest = { },
        title = { Text(text = "Hola Mundo") },
        text = { Text(text = "Descriptioin") },
        confirmButton = {})
}