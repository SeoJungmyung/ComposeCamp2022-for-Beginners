package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme{
                Surface() {
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    val image = painterResource(R.drawable.bg_compose_background)
    val title = stringResource(R.string.title_jetpack_compose_tutorial)
    val shortDescription = stringResource(R.string.compose_short_desc)
    val longDescription = stringResource(R.string.compose_long_desc)

    ArticleCard(
        title = title,
        shortDescription = shortDescription,
        longDescription = longDescription,
        imagePainter = image
    )
}

@Composable
private fun ArticleCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column {
        Image(
            painter = imagePainter, contentDescription = null,
            modifier = modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp)
        )
        Text(
            text = shortDescription,
            textAlign = Justify,
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = longDescription,
            textAlign = Justify,
            modifier = modifier
                .padding(16.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme{
        ComposeArticleApp()
    }
}

