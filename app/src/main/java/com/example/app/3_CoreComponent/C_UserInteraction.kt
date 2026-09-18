package com.example.app.`3_CoreComponent`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PartiallySelectableText() {
    Box(Modifier.fillMaxSize(), Alignment.Center) {
        SelectionContainer {
            Column {
                Text("This is one")
                Text("This is two")
                Text("This is three")
                DisableSelection {
                    Text("This is not selectable one")
                    Text("This is not selectable text")
                }
            }
        }
    }
}

@Composable
fun AnnotatedStringWithListener() {
    val uriHandler = LocalUriHandler.current
    Box(Modifier.fillMaxSize(), Alignment.Center) {
        Text(
            buildAnnotatedString {
                append("Build better apps faster with")
                val link = LinkAnnotation.Url(
                    "https://google.com",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Cyan
                        )
                    )
                ) {
                    val url = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(url)
                }

                withLink(link) {
                    append("Jetpack Compose")
                }
            }
        )
    }

}

@Preview(showSystemUi = true)
@Composable
fun PreviewSelectable() {
    AnnotatedStringWithListener()
}