package com.example.talkhubandroid.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {
    val loginText = "Login"
    val registerText = "Register"
    val text = "Enter your mobile phone"
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 54.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Row {
            Column {
                Text(
                    text = loginText,
                    style = TextStyle(fontSize = 35.sp, fontWeight = FontWeight.Bold)
                )

                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = text
                )
            }

            Button(
                onClick = { /*TODO*/ })
            {
                Text(
                    text = registerText,
                    style = TextStyle(fontSize = 18.sp)
                )

            }

        }


    }

}