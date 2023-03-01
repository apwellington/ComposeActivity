package com.example.composeactivity.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun ConstrainExample(){
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        //crea los id de los componente
        val (boxRed, boxBlue, boxYelow, boxMagenta, grayBox) = createRefs()

        val bottomGuide = createGuidelineFromBottom(32.dp)

        Box(modifier = Modifier
            .background(Color.Red)
            .size(125.dp)
            .constrainAs(boxRed){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }
        )

        Box(modifier = Modifier
            .background(Color.Yellow)
            .size(125.dp)
            .constrainAs(boxYelow){
                end.linkTo(boxRed.start)
                bottom.linkTo(boxRed.top)
            }
        )


        Box(modifier = Modifier
            .background(Color.Magenta)
            .size(125.dp)
            .constrainAs(boxMagenta){
                start.linkTo(boxRed.end)
                bottom.linkTo(boxRed.top)
            }
        )

        Box(modifier = Modifier
            .background(Color.Blue)
            .size(125.dp)
            .constrainAs(boxBlue){
                start.linkTo(boxYelow.end)
                end.linkTo(boxMagenta.start)
                bottom.linkTo(boxYelow.top)
            }
        )


        Box(modifier = Modifier
            .background(Color.DarkGray)
            .width(300.dp)
            .height(100.dp)
            .constrainAs(grayBox){
                bottom.linkTo(bottomGuide)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
    }
}