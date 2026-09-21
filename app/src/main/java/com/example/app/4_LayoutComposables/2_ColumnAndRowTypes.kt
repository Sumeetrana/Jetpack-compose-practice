package com.example.app.`4_LayoutComposables`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumn() {
    Column(Modifier.fillMaxSize(), Arrangement.Center) {
        Text("LazyColumn (prefered for the lists)")

        LazyColumn(Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color.LightGray)) {
            items(100) { index ->
                Text(
                    "Item $index in Lazycolumn", Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(
                            Color.White
                        )
                )
            }
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun PreviewColumnAndRowTypesExample() {
    LazyColumn()
}