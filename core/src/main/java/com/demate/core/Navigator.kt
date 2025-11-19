package com.demate.core

import android.content.Context
import android.content.Intent

object Navigator {
    fun open(context: Context, clazz: Class<*>) {
        val i = Intent(context, clazz)
        context.startActivity(i)
    }
}

