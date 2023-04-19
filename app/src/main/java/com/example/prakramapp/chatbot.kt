package com.example.prakramapp

import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

data class Message(val text: String, val isMe: Boolean = false)
@Composable
fun MyApp(navController: NavHostController) {
    val messages = remember { mutableStateOf(listOf(
        Message("Hello, how can I assist you?")
    )) }
    Chatbot(onSendMessage = {}, messages = messages)

}

@Composable
fun Chatbot(onSendMessage: (String) -> Unit, messages: MutableState<List<Message>>) {
    Column(modifier = Modifier.fillMaxSize()) {
        MessageList(messages = messages)
        MessageInput(onSendMessage = onSendMessage, messages = messages)
    }
}

@Composable
fun MessageList(messages: MutableState<List<Message>>) {
    LazyColumn() {
        items(messages.value) { message ->
            MessageItem(message = message)
        }
    }
}

@Composable
fun MessageItem(message: Message) {
    Row(modifier = Modifier.padding(16.dp)) {
        Text(
            text = message.text,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun MessageInput(onSendMessage: (String) -> Unit, messages: MutableState<List<Message>>) {
    var messageText by remember { mutableStateOf("") }
    Row(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = messageText,
            onValueChange = { messageText = it },
            placeholder = { Text("Type a message...") },
            modifier = Modifier.weight(1f)
        )
        Button(
            onClick = {
                onSendMessage(messageText)
                messages.value = messages.value.plus(Message(text = messageText, isMe = true))
                messageText = ""
            },
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Text("Send")
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun ChatbotPreview() {
//    val messages = remember { mutableStateOf(listOf(
//        Message("Hello, how can I assist you?")
//    )) }
//    Chatbot(onSendMessage = {}, messages = messages)
//}


