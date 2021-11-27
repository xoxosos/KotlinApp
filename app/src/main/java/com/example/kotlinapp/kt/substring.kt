package com.example.kotlinapp.kt
// TODO substring 截取字符串
  const val NAME="Jimmy's friend"
fun main() {
    val indexOf = NAME.indexOf('\'')
   // val substring = NAME.substring(0, indexOf)
    //TODO substring函数支持IntRange类型 （表示一个整数范围类型）的参数,until创建的范围不包括上限值
    val substring1 = NAME.substring(0 until indexOf)
    println(substring1)

    //TODO split 返回list集合数据 ，list集合又支持解构语法特征
    val split = NAMES.split(",") //返回list 集合
    println(split)
    //TODO 解构 用于简化变量的赋值（集合的值给变量）
   val(origin,dest,proxy) =NAMES.split(",")
    println("$origin,$dest,$proxy")
}
 const val  NAMES="jack,jacky,jason"
