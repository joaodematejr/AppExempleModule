package com.demate.appexemplemodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.demate.appexemplemodule.ui.theme.AppExempleModuleTheme
import com.demate.common.CommonUtil
import com.demate.core.CoreUtil
import com.demate.data.GreetingModule

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // obtain greeting from data module and other modules with explicit types and fallbacks
        val dataGreeting: String = try {
            GreetingModule.provideGreetingProvider().greeting()
        } catch (t: Throwable) {
            "(data module unavailable)"
        }

        val coreGreeting: String = try {
            CoreUtil.coreMessage()
        } catch (t: Throwable) {
            "(core module unavailable)"
        }

        val commonGreeting: String = try {
            CommonUtil.commonMessage()
        } catch (t: Throwable) {
            "(common module unavailable)"
        }

        val combined: String =
            listOf<String>(dataGreeting, coreGreeting, commonGreeting).joinToString("\n")

        setContent {
            AppExempleModuleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        text = combined,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppExempleModuleTheme {
        Greeting("Preview greeting")
    }
}