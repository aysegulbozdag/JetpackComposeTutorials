package com.example.jetpackcomposetutorials

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun LaunchedEffect(modifier: Modifier) {

    var name by remember {
        mutableStateOf("")
    }

    var count by remember {
        mutableIntStateOf(0)
    }

    androidx.compose.runtime.LaunchedEffect(key1 = name) {
        count++
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Text(text = count.toString())

        TextField(value = name, onValueChange = { name = it })


    }


}