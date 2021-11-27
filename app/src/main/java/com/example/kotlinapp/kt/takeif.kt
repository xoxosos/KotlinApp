package com.example.kotlinapp.kt

import java.io.File

fun main() {
    val file = File("E://text.txt")
    .takeIf { it.exists()&&it.canRead()}?.readText()
    println(file)

}