package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.example.myapplication.ui.theme.LoginScreen
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                LoginScreen()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme {
        Surface {
            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        LoginScreen()
    }
}