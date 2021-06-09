package com.example.learn.pattern

object PatternMatchingExample001 {

  /**
   * @descr
   * 模式匹配语法中，采用match关键字声明，每个分支采用case关键字进行声明，
   * 当需要匹配时，会从第一个case分支开始，如果匹配成功，那么执行对应的逻辑代码，
   * 如果匹配不成功，继续执行下一个分支进行判断。
   * 如果所有case都不匹配，那么会执行case_分支，类似于Java中default语句。
   * 如果不存在case _分支，那么会发生错误。
   */
  // 匹配常量
  def describe(x: Any) = x match {
    case 5 => "Int five"
    case "hello" => "String hello"
    case true => "Boolean true"
    case '+' => "Char +"
  }

  // 匹配类型
  def describe2(x: Any) = x match {
    case i: Int => "Int"
    case s: String => "String hello"
    case m: List[_] => "List" //下划线在泛型中表示任意类型
    case c: Array[Int] => "Array[Int]"
    case someThing => "something else " + someThing //相当于下划线，其他任何类型
  }

  // 匹配数组
  for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1), Array("hello", 90))) {// 对一个数组集合进行遍历
       val result = arr match {
       case Array(0) => "0" //匹配Array(0) 这个数组
       case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的x,y
       case Array(0, _*) => "以0开头的数组" //匹配以0开头和数组
       case _ => "something else"
    }
    println("result = " + result)
  }

  // 匹配列表
  for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0), List(88))) {
    val result = list match {
         case List(0) => "0" //匹配List(0)
         case List(x, y) => x + "," + y //匹配有两个元素的List
         case List(0, _*) => "0 ..."
         case _ => "something else"
    }
    println(result)
  }

  // 匹配元组
  for (tuple <- Array((0, 1), (1, 0), (1, 1), (1, 0, 2))) {
    val result = tuple match {
      case (0, _) => "0 ..." //是第一个元素是0的元组
      case (y, 0) => "" + y + "0" // 匹配后一个元素是0的对偶元组
      case (a, b) => "" + a + " " + b
      case _ => "something else" //默认
    }
    println(result)
  }

  // 匹配对象
  // Scala中模式匹配对象时，会自动调用对象的unapply方法进行匹配
  class User(val name: String, val age: Int)
  object User{
    def apply(name: String, age: Int): User = new User(name, age)
    def unapply(user: User): Option[(String, Int)] = {
      if (user == null) {
        None
      } else{
        Some(user.name, user.age)
      }
    }
  }
  val user: User = User("zhangsan", 11)
  val result = user match {
    case User("zhangsan", 11) => "yes"
    case _ => "no"
  }

  // 匹配样例类
  case class User2(name: String, age: Int)
  object ScalaCaseClass {
    def main(args: Array[String]): Unit = {
      val user: User2 = User2("zhangsan", 11)
      val result = user match {
        case User("zhangsan", 11) => "yes"
        case _ => "no"
      }
      println(result)
    }
  }



}
