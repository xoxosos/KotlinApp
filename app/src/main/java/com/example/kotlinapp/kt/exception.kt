package com.example.kotlinapp.kt

import java.lang.Exception
import java.lang.RuntimeException

// TODO 异常
fun main() {
    var number:Int?=null

    try {
        checkOperation(number)
        number!!.plus(1)
    }catch (e:Exception){
        println(e)
    }
}
fun checkOperation(number:Int?){
  //  number?:throw UnKilledException()
    checkNotNull(number,{"something is not good"})  //TODO 检查为空
}
//TODO 自定义异常
 class UnKilledException():IllegalAccessException("操作不当")