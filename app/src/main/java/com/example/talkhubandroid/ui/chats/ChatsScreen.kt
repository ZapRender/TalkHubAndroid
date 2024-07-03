package com.example.talkhubandroid.ui.chats

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import com.example.talkhubandroid.ui.theme.Blue50
import com.example.talkhubandroid.ui.theme.Blue600

@Composable
@Preview(showSystemUi = true)
fun ChatsScreen() {
    Scaffold(
        topBar = {
            TopBarChats()
        }
    ) {innerPadding  ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {
            //items()
        }

    }

}

@Composable
fun TopBarChats(){
    Box(modifier = Modifier.fillMaxSize().background(color = Blue600)) {
        //TopBar()

    }
}