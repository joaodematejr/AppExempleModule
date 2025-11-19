package com.demate.feature.list

import android.content.Context
import android.content.Intent

object ListEntry {
    fun open(context: Context) {
        context.startActivity(Intent(context, ListActivity::class.java))
    }
}

