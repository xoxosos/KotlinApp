package com.example.kotlinapp.kt

import java.io.File

//TODO also 类似 let also会返回对象 针对同一原始对象 ，let返回lambda表达式的执行结果
fun main() {
     var file:List<String>
     File("E://text.txt").also {
         println(it.name)
     }
         .also {
             file=it.readLines()
         }
    println(file)
}