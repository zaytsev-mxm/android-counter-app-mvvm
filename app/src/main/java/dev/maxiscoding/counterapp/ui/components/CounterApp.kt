package dev.maxiscoding.counterapp.ui.components

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.maxiscoding.counterapp.CounterRepository
import dev.maxiscoding.counterapp.viewModels.CounterViewModel

@Composable
fun CounterApp(viewModel: CounterViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: ${viewModel.count}")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { viewModel.increment() }) {
            Text(text = "Increment")
        }
        Button(onClick = { viewModel.decrement() }) {
            Text(text = "Decrement")
        }
    }
}

@Preview
@Composable
fun CounterAppPreview() {
    CounterApp(viewModel = CounterViewModel())
}