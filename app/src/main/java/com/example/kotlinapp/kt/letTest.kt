package com.example.kotlinapp.kt

fun main() {
    println(listOf(3, 2, 1).first().let {
        it * it
    })

    println(wel("jack"))
}
 // TODO 链式调用
fun wel(name:String?):String{  //取代 if  else
    return name?.let {
        "welcome,$name."
    }?:"what's your name?"
}