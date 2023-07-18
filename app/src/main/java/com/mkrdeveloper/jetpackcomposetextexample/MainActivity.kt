package com.mkrdeveloper.jetpackcomposetextexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    Column(modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(text = buildAnnotatedString {
            withStyle(
                style = ParagraphStyle(
                    textIndent = TextIndent(firstLine = 5.sp)
                )
            ) {
                withStyle(
                    style = SpanStyle(
                        color = Color.Blue,
                        fontSize = 30.sp
                    )
                ) {
                    append("J")
                }

                append("etpack")

                withStyle(
                    style = SpanStyle(
                        color = Color.Blue,
                        fontSize = 30.sp
                    )
                ) {
                    append("C")
                }
                append("ompose")
            }

        })
        val myFont = FontFamily(Font(R.font.courgette))
        Text(
            stringResource(id = R.string.sub)/*.repeat(30)*/,
            //modifier = Modifier.background(Color.Gray).width(400.dp),
            color = Color.Magenta,
            fontSize = 25.sp,
            //fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            fontFamily = myFont,
            // letterSpacing = 15.sp,
            //textDecoration = TextDecoration.LineThrough,
            // textAlign = TextAlign.Center
            lineHeight = 40.sp,
            overflow = TextOverflow.Ellipsis,
            maxLines = 3

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

        MyApp()

}