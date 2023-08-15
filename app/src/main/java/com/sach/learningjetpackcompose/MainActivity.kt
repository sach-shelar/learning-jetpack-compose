package com.sach.learningjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sach.learningjetpackcompose.ui.theme.LearningJetpackComposeTheme
import java.sql.RowId

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
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
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, device = "id:Nexus 5X", showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearningJetpackComposeTheme {
        RowAndColumnSample()
    }
}


@Composable
fun RowAndColumnSample(){
// Row in compose
    Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Sachin123")
        Text(text = "Nilesh")

        Column(verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxHeight()) {
            Text(text = "Shelar11111111")
            Text(text = "Salunke")
        }
    }
}