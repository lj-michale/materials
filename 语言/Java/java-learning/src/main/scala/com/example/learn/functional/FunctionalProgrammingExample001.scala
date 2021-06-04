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




}
