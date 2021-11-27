package com.example.kotlinapp.kt

import java.io.File

fun main() {
    val file=File("E://text.txt")
    file.run {
        println(readText().contains("2")) // 文件是否含有 ，返回 boolean
        println(readText())  //全读
        println(readLines().get(0)) // 读哪一行

    }
    println("people is chinese".run {
        length >= 10
    })
    println(with("people is chinese") {
        length >= 10
    })
}

