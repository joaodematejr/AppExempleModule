package com.demate.feature.signup

import android.content.Context
import android.content.Intent

object SignupEntry {
    fun open(context: Context) {
        context.startActivity(Intent(context, SignupActivity::class.java))
    }
}

