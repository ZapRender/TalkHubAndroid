package com.example.talkhubandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.talkhubandroid.ui.login.LoginScreen
import com.example.talkhubandroid.ui.theme.TalkHubAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TalkHubAndroidTheme {
                LoginScreen()
            }
        }
    }
}