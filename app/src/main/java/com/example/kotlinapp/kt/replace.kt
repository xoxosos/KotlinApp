package com.example.kotlinapp.kt
//TODO  replace 字符串替换
fun main() {
      val str="The people's Republic of China"
      val str2= str.replace(Regex("[aeiou]")){
           when(it.value){
               "a" -> "8"
               "e" -> "6"
               "i" -> "5"
               "o" -> "4"
               "o" -> "1"
              else ->it.value
           }
       }
    println(str)
    println(str2)

    str.forEach {
        print(",$it")
    }
}