package com.example.kotlinapp.kt

fun main() {
    val shows = show("学习kotlin")
    println(shows("aa", 18))
}
//TODO 匿名函数作为返回类型
fun show(info:String):(String,Int)->String{
    println("show:$info")
    return {
            name:String,age:Int->
        "$name,年龄：$age"
    }

fun show1(info:String):Boolean{
    println("show:$info")
    return true
}
fun show2(info:String):String{
    println("show:$info")
    return "ddd"
}

 }