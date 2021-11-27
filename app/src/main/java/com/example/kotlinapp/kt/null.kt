package com.example.kotlinapp.kt
 //TODO 可空性
fun main() {
   var str:String?=null //可空的字符串
     str="kotlin"
     // TODO ?. 安全操作符
 str=str?.let {
   if (it.isNotBlank()){
    it.uppercase()
   }else{
    "butterfly"
   }
  }
  println(str)
     //TODO !!（非空断言操作符） 如果为空 空指针异常中断程序，不为空就不做改变
     var input:String?=null
     input="aaa"
     println(input!!)
     println("123")

     //TODO ？： 如果左边为空给它赋值 如果不为空就不赋值
     println(null?:"jack")
     println("rose"?:"jack")

}