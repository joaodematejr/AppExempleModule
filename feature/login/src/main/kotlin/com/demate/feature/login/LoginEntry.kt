package com.demate.feature.login

import android.content.Context
import android.content.Intent

object LoginEntry {
    fun open(context: Context) {
        val i = Intent(context, LoginActivity::class.java)
        context.startActivity(i)
    }
}

