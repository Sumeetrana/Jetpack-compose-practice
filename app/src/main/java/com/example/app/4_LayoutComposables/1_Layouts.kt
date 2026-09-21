package com.example.app.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("text 1")
        Text("text 2")
        Text("text 3")
        Text("text 4")
        Text("text 5")
    }
}

@Composable
fun RowExample() {
    Row(
        Modifier
            .fillMaxSize()
            .background(Color.Gray),
        Arrangement.Center,
        Alignment.CenterVertically
    ) {
        Text("text 1")
        Text("text 2")
        Text("text 3")
        Text("text 4")
        Text("text 5")
    }
}

@Composable
fun BoxExample() {
    Box(
        Modifier
            .size(200.dp)
            .background(Color.Red), Alignment.Center
    ) {
        Box(
            Modifier
                .size(150.dp)
                .background(Color.Black)
        ) {}
    }
}

@Composable
fun ConstraintLayout() {
    Column {
        ConstraintLayout(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.LightGray)
        ) {

            val (text1, text2, text3) = createRefs()

            Text("Bottom Left", Modifier.constrainAs(text1) {
                bottom.linkTo(parent.bottom, margin = 8.dp)
                start.linkTo(parent.start, margin = 8.dp)
            })

            Text("Center Left", Modifier.constrainAs(text2) {
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            })

            Text("Top Right", Modifier.constrainAs(text3) {
                top.linkTo(parent.top)
                end.linkTo(parent.end, 8.dp)
            })
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewColumnExample() {
    ConstraintLayout()
}