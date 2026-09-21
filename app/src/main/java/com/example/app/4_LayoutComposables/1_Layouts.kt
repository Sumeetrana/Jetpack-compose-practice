package com.example.app.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ColumnExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(25.dp)
        ,
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

@Preview(showSystemUi = true)
@Composable
fun PreviewColumnExample() {
    ColumnExample()
}