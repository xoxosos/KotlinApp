package com.example.kotlinapp.kt

fun main() {
    //TODO 匿名函数(lambda) 匿名函数可以作为函数的参数传递 也可作为函数的返回值返回 也可以作为变量的类型
    val total:Int="Mississippi".count()
   // val totals:Int="Mississippi".count({a -> a=='s' })// 匿名函数作为参数
    val totals:Int="Mississippi".count { a -> a == 's' }// 匿名函数作为参数
    println(total)
    println(totals)


    // TODO 变量的类型是一个匿名函数 , 匿名函数隐式返回 ，返回最后一条语句不用return
    val blessingFunction:()->String = {  // 无参返回类型是string的匿名函数
        val holiday="new year"
        "Happy $holiday"
    }
    println(blessingFunction())
    //TODO 带参数的匿名函数
    val blessingFunction2:(String)->String = {
        //    name -> val holiday="new year"
         val holiday="new year" //TODO 如果只有匿名函数只有一个参数 it 可以代替这个参数（比如name）
        "Happy $holiday,$it"
    }
    println(blessingFunction2) //TODO 返回Function1<java.lang.String, java.lang.String>
    println(blessingFunction2("Jack"))

    //TODO 如果只有匿名函数无参 可以不用写类型 可以自动推断出来
    val blessingFunction3 = {
        val holiday="new year"
        "Happy,$holiday"
    }
    println(blessingFunction3())

    //TODO 多参数 匿名函数推断
   val blessingFunction4 = {
       name:String,year:Int ->  // TODO lambda参数
        val holiday="new year!"
        "$name happy,$holiday,$year" //TODO lambda返回结果
    }
    println(blessingFunction4("Jack",2022))
}