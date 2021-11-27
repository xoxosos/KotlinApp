package com.example.kotlinapp.kt

import kotlin.math.roundToInt

fun main() {
    //  var num1:Int="8.98".toInt()//umberFormatException: For input string: "8.98"
    var num1:Int?="8.98".toIntOrNull() // TODO 安全转换没转换成功则为空
    println(num1)
    // double转int
    println(6.946.toInt())
    println(6.946.roundToInt()) //TODO 四舍五入
    println("%.2f".format(8.129465))//TODO 保留两位小数 ，会四舍五入
}