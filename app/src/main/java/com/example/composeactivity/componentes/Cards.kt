package com.example.composeactivity.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun MyCard(){
    Column(modifier = Modifier.fillMaxSize()) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            elevation = 8.dp,
            shape = MaterialTheme.shapes.medium
        ) {
            Column(modifier = Modifier.padding(8.dp)) {
                Text(text = "Item UNO")
                Text(text = "Item DOS")
                Text(text = "Item TRES")
            }
        }
    }
}