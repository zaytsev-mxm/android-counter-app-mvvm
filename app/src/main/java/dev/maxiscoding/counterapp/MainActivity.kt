package dev.maxiscoding.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import dev.maxiscoding.counterapp.ui.components.CounterApp
import dev.maxiscoding.counterapp.ui.theme.CounterAppTheme
import dev.maxiscoding.counterapp.viewModels.CounterViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val viewModel: CounterViewModel by viewModels()

        setContent {
            CounterAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        CounterApp(viewModel)
                    }
                }
            }
        }
    }
}