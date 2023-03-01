package com.example.composeactivity.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeactivity.R

@Composable
//@Preview(showBackground = true)
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Descripcion de la imagen",
        alpha = 1.5f
    )
}

@Composable
@Preview(showBackground = true)
fun MyImageCustom() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Descripcion de la imagen",
        modifier = Modifier.clip(CircleShape)
    )
}