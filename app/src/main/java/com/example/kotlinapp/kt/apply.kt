package com.example.kotlinapp.kt

import java.io.File

fun main() {
    val files=File("E://text.txt")
       files.setReadable(true)
       files.setWritable(true)
       files.setExecutable(true)
}