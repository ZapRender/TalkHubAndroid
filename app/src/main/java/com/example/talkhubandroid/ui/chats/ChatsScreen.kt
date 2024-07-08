package com.example.talkhubandroid.ui.chats

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.talkhubandroid.R
import com.example.talkhubandroid.ui.theme.Blue60
import com.example.talkhubandroid.ui.theme.lightBlue

@Composable
@Preview(showSystemUi = true)
fun ChatsScreen() {
    Scaffold(
        topBar = {
            TopBarChats()
        }
    ) {innerPadding  ->
        LazyColumn(modifier = Modifier.padding(innerPadding)) {

        }

    }

}

@Composable
fun TopBarChats(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Blue60)) {

        Row(modifier = Modifier.padding(top = 52.dp, start = 24.dp, end = 24.dp,bottom = 16.dp), horizontalArrangement = Arrangement.End) {
            Icon(modifier = Modifier.padding(end = 10.dp), painter = painterResource(id = R.drawable.ic_chat_bubble), tint = lightBlue, contentDescription = "")
            Box(modifier = Modifier.weight(1f), Alignment.CenterStart){
                Text("E-Chat", color = Color.White, fontSize = 16.sp)
            }
            Icon(modifier = Modifier.padding(end = 16.dp), painter = painterResource(id = R.drawable.ic_search), tint = Color.White, contentDescription = "Search")
            Icon(painter = painterResource(id = R.drawable.ic_add), tint = Color.White, contentDescription = "Search")
        }


    }
}

@Preview
@Composable
fun ChatItem(){
    Box(){
        Image(
            modifier = Modifier.size(100.dp).clip(CircleShape),
            painter = painterResource(id = R.drawable.ic_account_circle), contentDescription = "")
        Column(){
            Text("Name", fontSize = 16.sp)
            Text("Message", fontSize = 14.sp)
        }

    }
}