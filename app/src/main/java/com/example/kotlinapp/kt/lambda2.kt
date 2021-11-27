package com.example.kotlinapp.kt
  // TODO  一个函数作为另一个函数的参数
fun main() {
      //促销文案
//    val getDiscountWords={
//        goodsName: String,hour:Int->
//        val year=2022
//        "${year}年，双11${goodsName}促销倒计时：${hour}小时"
//    }
      //展现
      showOnBoard("卫生纸") {goodsName: String,hour:Int->
      val year=2022
      "${year}年，双11${goodsName}促销倒计时：${hour}小时"}
  }
     //具名函数
 fun showOnBoard(goodsName:String,getDiscountWords:(String,Int)->String){
     val hour: Int =(1..24).shuffled().last()
      println(getDiscountWords(goodsName, hour))
  }