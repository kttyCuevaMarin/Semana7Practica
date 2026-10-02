package com.example.practica4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterScreen() {

    val viewModel: CounterViewModel = viewModel()


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Contador: ${viewModel.count}",
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = { viewModel.increment() }) {
            Text(text = "Incrementar")
        }
        Button(onClick = { viewModel.Decrementar() }) {
            Text(text = "Decrementar")
        }


    }
}
