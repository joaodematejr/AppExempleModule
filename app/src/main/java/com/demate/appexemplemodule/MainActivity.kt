package com.demate.appexemplemodule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.demate.appexemplemodule.ui.theme.AppExempleModuleTheme
import com.demate.common.CommonUtil
import com.demate.core.CoreUtil
import com.demate.data.GreetingModule
import com.demate.feature.list.ListEntry
import com.demate.feature.login.LoginEntry
import com.demate.feature.signup.SignupEntry

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // obtain greeting from data module and other modules with explicit types and fallbacks
        val dataGreeting: String = try {
            GreetingModule.provideGreetingProvider().greeting()
        } catch (_: Throwable) {
            "(data module unavailable)"
        }

        val coreGreeting: String = try {
            CoreUtil.coreMessage()
        } catch (_: Throwable) {
            "(core module unavailable)"
        }

        val commonGreeting: String = try {
            CommonUtil.commonMessage()
        } catch (_: Throwable) {
            "(common module unavailable)"
        }

        val combined: String =
            listOf<String>(dataGreeting, coreGreeting, commonGreeting).joinToString("\n")

        setContent {
            AppExempleModuleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainContent(
                        greeting = combined,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainContent(greeting: String, modifier: Modifier = Modifier) {
    val ctx = LocalContext.current
    Column(modifier = modifier) {
        Text(text = greeting)
        Button(onClick = { LoginEntry.open(ctx) }) {
            Text("Open Login")
        }
        Button(onClick = { SignupEntry.open(ctx) }) {
            Text("Open Signup")
        }
        Button(onClick = { ListEntry.open(ctx) }) {
            Text("Open List")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppExempleModuleTheme {
        MainContent("Preview greeting")
    }
}