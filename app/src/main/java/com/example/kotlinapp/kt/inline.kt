package com.example.kotlinapp.kt
 //TODO 函数引用
fun main() {
     //函数引用
    login("admin","123456",::methodResponseResult)
    login("admin","123",::methodResponseResult)
     val obj=::methodResponseResult
     login("admin","123456",obj)
}
//TODO 将lambda实例为普通函数  lambda属于函数类型的对象，需要把普通函数变成函数引用（函数类型的对象） 要加::
  fun methodResponseResult(msg:String,code:Int){ //TODO 普通函数
      println("最终的登录结果为：$msg,code:$code")
  }
//模拟数据库 编译时常量
  const val username="admin"
  const val password="123456"
// inline 如果有lambda作为函数的参数 尽量使用inline 内联 减少内存的消耗
inline fun login(name:String,pwd:String,responseResult:(String,Int)->Unit) {
   if (username==name&& password==pwd){
       //登录成功
       //校验信息等。。。
       responseResult("登陆成功",200)
   }else{
       //登录失败
       //做很多事情 登录失败的逻辑处理...
       responseResult("登陆失败",400)
   }

}
