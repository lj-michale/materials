package com.example.learn.functional

/**
 * @descr 函数式编程
 * @date 2021/6/4 17:00
 */
object FunctionalProgrammingExample001 {

  // 函数参数 - 可变参数
  // 用 * 来表示，可变参数不能放置在参数列表的前面，一般放置在参数列表的最后
  def fun7(names:String*): Unit = {
    println(names)
  }

  // 使用 = 进行参数的默认赋值
  def fun8( name:String, password:String = "000000" ): Unit = {
    println( name + "," + password )
  }

  // 省略return关键字，
  def fun1(): String = {
    return "zhangsan"  //不省略
  }
  def fun11(): String = {
     "zhangsan"      //省略return
  }

  // 省略花括号。只有一行逻辑
  def fun2(): String = "hello world"

  // 省略返回值类型
  def fun3() = "hello scala"

  // 省略参数列表（无参函数）
  // 定义时没有小括号，调用时也不能有小括号，无参的
  def fun4:String = "zhangsan"

  // 省略等号, （） => { 函数体 }
  def fun5() { // 方法返回值类型为Unit
    return "zhangsan"
  }

  /////////// 高阶函数编程
  //  所谓的高阶函数，其实就是将函数当成一个类型来使用，而不是当成特定的语法结构
  //  函数类型表示方法 :(参数1类型，参数2类型。。。) => 返回值类型 eg: (Int， Int） => Int

  // 函数作为值
  // 函数可以作为值赋值给变量
  def fun15(): String = {
    "zhangsan"
  }
  val a = fun15      //a  为string类型，fun1 为方法的调用
  val b = fun15 _    // b为函数fun1 
  val c : () => String = fun15  //c 为函数fun1

  // 函数作为参数
  // 函数可以作为另一个函数的参数
  def fun2( i:Int ): Int = {
    i * 2
  }
  def fun22( f : Int => Int ): Int = {  //参数为 Int => Int 的函数
    f(10)
  }
  //将函数 fun2 作为参数 ，fun22 进行了类型推断，所以fun2 不用加下划线 _ 
  println(fun22(fun2))
  //也可以直接使用匿名函数
  println(fun22(_ * 2))

  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>")
  // 闭包
  // 函数在使用外部变量时，如果外部变量失效时，会将这个变量包含到当前的函数内部，形成闭合的使用效果。改变变量的生命周期，将这种操作称之为closure (闭包)
  // 匿名函数肯定为闭包，将函数赋值给变量使用也是闭包，嵌套函数的使用都为闭包
  // 2.12版本闭包通过重新声明来实现
  // 2.11以前的闭包被编译为匿名函数类，若使用外部变量，会将外部变量作为类的属性

  // 没有使用外部变量还能称之为闭包吗？
  // 2.11，即使没有使用外部变量，也会有闭包的效果，只是没有包含外部的变量
  // 2.12版本中，没有使用外部变量的话，就没有闭包

  // 函数的柯里化
  // 参数转换，可以将一个参数列表分为多个参数列表
  def fun6(i:Int)(j:Int) = {
    i * j
  }

  //  控制抽象
  //  代码作为参数
  //  参数列表中如果有多行逻辑，可以采用大括号代替
  //  scala支持将代码逻辑作为参数传递给函数使用
  //  如果函数参数想要传递代码逻辑，那么类型声明的方式应该为:
  //    参数名: =返回值类型(Unit)
  //  因为参数类型中没有声明小括号，所以调用时，也不能加小括号
  def fun7(op: => Unit) = {
    op  //参数类型 ： 抽象控制
  }

  fun7{
    println("xx")  //方法调用，将代码作为参数，用大括号
  }

  // 惰性函数
  // 当函数返回值被声明为lazy时，函数的执行将被推迟，直到我们首次对此取值，该函数才会执行。这种函数我们称之为惰性函数。
  def fun9(): String = {
    println("function...")
    "zhangsan"
  }
  lazy val aa = fun9()
  println(aa)

}
