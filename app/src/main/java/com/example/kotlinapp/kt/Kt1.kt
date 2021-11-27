package com.example.kotlinapp.kt
  //基本类型 kotlin 只有引用类型 ，条件表达式
fun main() {
val a="hello"
    println(a)
    println("this is $a") //$  类似java +拼接
    // if表达式 in: 1.用来检查字符区间成员 2.检查对象 3.检查集合
      if ( 2 !in 0..5) println("对的") else println("错的")
       if ("a" in listOf<String>("a","b","c")) println("元素在集合内") else println("元素不在集合内")
    println('a'<'c') //比较大小，可以忽略不看
    // 是否在"java"和"scala"字符串区间 ,相当于"java"<="kotlin"&& "kotlin" <= "scala" ,它是一个字符一个字符的比较
    println("kotlin" in "java".."scala")
    // when 表达式 如果存在if elseif 建议使用when表达式
    when('2'){
        in '0'..'9' -> println("It is a digit!")
        in 'a'..'z', in 'A'..'Z' -> println("It's a letter!")
        else -> "I don't know..."
    }
    //用户输入
    println("请输入匹配字符：")
    val readLine = readLine()
    when(readLine){
        "hello" -> println("你输入了$readLine")
        "哈哈哈" -> println("你输入了$readLine")
        else ->
            println("未能匹配到该值,你输入的是$readLine")
    }

}