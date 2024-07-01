package com.example.jetpackcomposetutorials

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun RememberCoroutineScope() {
    // rememberCoroutineScope kullanarak bir CoroutineScope oluşturuyoruz
    val scope = rememberCoroutineScope()
    var text by remember { mutableStateOf("Hello World") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = text, modifier = Modifier.padding(bottom = 8.dp))

        // Button onClick olayında Coroutine başlatmak için scope.launch kullanıyoruz
        Button(onClick = {
            scope.launch {
                // Asenkron bir işlem yapıyoruz (örneğin, veri yükleme simülasyonu)
                delay(2000L)  // 2 saniye bekletme
                text = "Button clicked!"
            }
        }) {
            Text("Click Me")
        }
    }
}