package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { }
    }
}

@Composable
fun ComposeQuadrantApp() {
    val title1 = stringResource(R.string.first_title)
    val title2 = stringResource(R.string.second_title)
    val title3 = stringResource(R.string.third_title)
    val title4 = stringResource(R.string.fourth_title)
    val desc1 = stringResource(R.string.first_description)
    val desc2 = stringResource(R.string.second_description)
    val desc3 = stringResource(R.string.third_description)
    val desc4 = stringResource(R.string.fourth_description)

    Column() {
        Row() {
            ComposableInfoCard(title1,desc1,Color.Green,Modifier)
            ComposableInfoCard(title1,desc1,Color.Yellow,Modifier)
        }
        Row() {
            ComposableInfoCard(title1,desc1,Color.Cyan,Modifier)
            ComposableInfoCard(title1,desc1,Color.LightGray,Modifier)
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column( modifier = Modifier.background(backgroundColor) ) {
        Text(
            text = title,
            modifier = modifier
        )
        Text(
            text = description,
            modifier = modifier
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme{
        ComposeQuadrantApp()
    }
}