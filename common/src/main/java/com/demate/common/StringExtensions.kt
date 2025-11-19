package com.demate.common

// Example extension function
fun String.capitalizeFirst(): String = replaceFirstChar { it.uppercase() }

