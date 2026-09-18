package com.example.app.`3_CoreComponent`

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app.R


@Composable
fun Image() {
    Image(
        painter = painterResource(id = R.drawable.images),
        contentDescription = "Random image",
        modifier = Modifier.size(300.dp)
            .clip(CircleShape),
        alignment = Alignment.Center,

    )
}

@Preview(showSystemUi = true)
@Composable
fun PreviewImage() {
    Image()
}