package com.example.app.`3_CoreComponent`

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FilledButtonSample() {
    val context = LocalContext.current

    Box(Modifier.fillMaxSize(), Alignment.Center) {
//        Button(
//            onClick = {
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Filled Button")
//        }

//        FilledTonalButton(
//            onClick = {
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Filled tonal Button")
//        }

//        OutlinedButton(
//            onClick = {
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Outlined Button")
//        }

//        ElevatedButton(
//            onClick = {
//                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
//            }
//        ) {
//            Text("Elevated Button")
//        }

        TextButton(
            onClick = {
                Toast.makeText(context, "Button is clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text("Text Button")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewButton() {
    FilledButtonSample()
}