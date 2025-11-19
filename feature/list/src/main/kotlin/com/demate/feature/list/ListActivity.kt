package com.demate.feature.list

import android.os.Bundle
import androidx.core.app.ComponentActivity

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListScreen()
        }
    }
}

