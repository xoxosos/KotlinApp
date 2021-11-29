package com.example.kotlinapp.kt

class NamedParm (val height:Double,val color:String="白色",val price:Int){
    fun print(){
        println("House [height=$height,color=$color,price=$price]")
    }
}

fun main() {
    //TODO 这种赋值更灵活
    val namedParm = NamedParm(color = "红色", height = 3.3, price = 66666)
  namedParm.print()
    //不赋值会使用默认值
    val namedParm1 = NamedParm(height = 6.6, price = 9999)
    namedParm1.print()
}