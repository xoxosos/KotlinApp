package com.example.kotlinapp.kt
// 启动函数
fun main() {
    //返回的是字符串所以打印下才有结果
    println(doSomething())
    println(doSomething().toUpperCase())//转为大写
    haveParam("Java",666)
    haveParam("kotlin")//如果有预参数(默认参数) 可传新值 也可不传新值（会用预参数值） 防止null
    haveParam(a=999,b="具名函数")//具名函数 可以指定参数名字传递值
    println(haveParam(a=1,b="1")) //kotlin.Unit 返回值是Unit 没有返回值 类似于java void
  //  TODO("nothing异常")//  TODO 函数的任务是抛出异常throw exception 返回Nothing类型 可以用来中断代码
  //  print("after noting")  // 发现没有打印nothing 说明todo 函数可以中单代码运行
    我是测试()  //反引号 中的函数名 可以随便命名
    //调用java类中的方法
    Myclass.`is`() // is跟kotlin中的方法名有冲突 所以加上反引号可以调用java中的方法



}
// 无参
  fun doSomething():String{
      // 返回一个字符串 hello
   return  "hello"
  }
// 有参 和 预参数（默认参数） 没有指定返回类型 默认unit
fun haveParam(b:String,a:Int = 2){
    println("第一个参数：$b 第二个参数：$a")
}
// 反引号中的函数名  主要用来防止 JAVA与kotlin 调用时方法名冲突
fun `我是测试`(){
    println("测试代码")
}




