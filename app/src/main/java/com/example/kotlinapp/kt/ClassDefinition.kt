package com.example.kotlinapp.kt

open class ClassDefinition(open val name:String,open var age:Int) {
      init {
            println("对象被创建了")
      }

      /* TODO 这行代码的背后
      *  @NotNull
   private String name = "jack";

   @NotNull
   public final String getName() {
      return this.name;
   }

   public final void setName(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.name = var1;
   }
       */
      fun speak(){
            println("Hello")
      }
      fun greet(name:String){
            println("hello ,$name")
      }

      fun getYearOfBirth()=2021-age
}
   // 继承  需要用到OPen 和 override
class Student(override val name: String, override var age: Int):ClassDefinition(name,age){
    //类似的东西被继承 可以在子类实现自己的东西
      fun isIntelligent()=true
}
fun main() {
      val classDefinition = ClassDefinition("jack",21)
       classDefinition.speak()
      classDefinition.greet("world")
      println(classDefinition.getYearOfBirth())
      println(classDefinition.name)
      println(classDefinition.age)
      val student = Student("学生john",18)
      student.greet(student.name)
      println(student.isIntelligent())
      println(student.getYearOfBirth())
}
