package com.example.tms_compose_project

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                LoginScreen(context = applicationContext)
            }
        }
    }
}

@Composable
fun LoginScreen(context: Context) {

    var email by remember { mutableStateOf("") }

    Column() {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            text = "Login",
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Left,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )

//        OutlinedTextField(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(bottom = 10.dp, top = 10.dp),
//            value = email,
//            onValueChange = { email = "123123" },
//            label = { Text(text = "Enter your email") },
//            visualTransformation = PasswordVisualTransformation(),
//            keyboardActions = KeyboardOptions(keyboardType = KeyboardType.Password)
//        )

        OutlinedButton(onClick = { /*TODO*/ }) {

            Text(
                text = "Login",
                textAlign = TextAlign.Center
            )
        }
    }
}