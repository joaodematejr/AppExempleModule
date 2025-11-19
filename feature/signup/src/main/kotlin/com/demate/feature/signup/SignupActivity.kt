package com.demate.feature.signup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignupScreen()
        }
    }
}

