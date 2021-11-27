package com.example.kotlinapp.kt

fun main() {
    val origin="Java"
    val dest="Rose"
    println("$origin love $dest")
    val flag = false
    // String模板 添加在${} 中的任何表达式，都会作为字符串的一部分求值
    println("Answer is:${if (!flag)"我可以" else "对不起"}")

}