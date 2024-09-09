package com.example.helloworldbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworldbutton.ui.theme.HelloWorldButtonTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Start()
        }
    }
}
@Composable
fun Start(){
    var showText by remember { mutableStateOf(false) }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .offset(x = 0.dp, y = 650.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { showText = !showText },
            modifier = Modifier
                .width(200.dp)
                .height(60.dp)
        ) {
            Text(text = "Click me!",
                fontSize = 24.sp,
                color = Color.Red
            )
        }
    }

    if (showText) {
        Greeting(
            name = "World",
        )
    }
}
@Composable
fun Greeting(name: String) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .offset(x = 0.dp, y = 300.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Hello",
            fontSize = 96.sp)
        Text("$name!",
            fontSize = 96.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Start()
}