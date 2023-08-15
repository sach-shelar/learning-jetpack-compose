package com.sach.learningjetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.GenericFontFamily
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sach.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme
import java.sql.RowId
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearningJetpackComposeTheme {
        //RowAndColumnSample()
        ButtonSample()
    }
}

@Composable
fun ButtonSample() {

    Column {

        Button(onClick = {
            displayToast()
        }, modifier = Modifier.fillMaxWidth()) {
            Image(
                painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "test"
            )
            Spacer(modifier = Modifier.padding(20.dp))
            Text(text = "India")
        }

        Button(onClick = {}, modifier = Modifier.fillMaxWidth(), shape = RectangleShape) {
            Text(text = "Rectangle Button")
        }

        Button(onClick = {}, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(4.dp)) {
            Text(text = "Round Corner Button")
        }

        Button(onClick = {}, modifier = Modifier.fillMaxWidth(), shape = CutCornerShape(4.dp)) {
            Text(text = "Round Corner Button")
        }

        Button(onClick = {}, border = BorderStroke(2.dp, Color.Magenta)) {
            Text(text = "Border Button")
        }

        Button(
            onClick = {},
            elevation = ButtonDefaults.buttonElevation(15.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),
            border = BorderStroke(1.2.dp, Color.Black),

        ) {
            Text(text = "Border Button",
                Modifier)
        }


    }
}

fun displayToast() {
    println("India")
}


@Composable
fun RowAndColumnSample() {

    val tiltFont = FontFamily(Font(R.font.tilt))
// Row in compose
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Sachin".uppercase(), style = TextStyle(
                fontFamily = FontFamily(Font(R.font.tilt)),
                fontSize = 40.sp,


                )
        )
        Text(text = "Nilesh")

        Column(
            verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxHeight()
        ) {
            Text(text = "SHELAR".lowercase())
            Text(text = "Salunke")
        }
    }
}