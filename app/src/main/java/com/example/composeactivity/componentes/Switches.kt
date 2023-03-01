package com.example.composeactivity.componentes

import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun MySwitch() {
    var status by rememberSaveable {
        mutableStateOf(true)
    }
    Switch(checked = status, onCheckedChange = { status = !status }, colors = SwitchDefaults.colors(
        checkedThumbColor = Color.Green,
        uncheckedThumbColor = Color.Red,
        checkedTrackColor = Color.Magenta,
        uncheckedTrackColor = Color.Cyan,
        uncheckedTrackAlpha = 0.6f
    ), enabled = true)
}