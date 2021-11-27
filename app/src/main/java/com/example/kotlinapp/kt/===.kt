package com.example.kotlinapp.kt
//TODO ==与===    ==检查字符串内容是否匹配 ===比较引用，检查两个变量是否指向内存堆上同一对象
fun main() {
    val str1="jack"
    val str2="jack"
    // 因为有常量池 指向同一个jack。内容相同 引用也相同
    println(str1==str2&&str1===str2)
    val str3="Jack"
    val str4="jack".capitalize()
    // false 因为开辟了三个地址
    println(str3==str4&&str3===str4)
}