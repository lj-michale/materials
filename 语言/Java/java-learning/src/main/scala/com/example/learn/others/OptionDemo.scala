package com.example.learn.others

object OptionDemo {

  // 在Scala中Option类型用样例类来表示可能存在或者可能不存在的值（Option的子类有Some和None）。Some包装了某个值，None表示没有值
  def main(args:Array[String]){
    val map = Map("a" -> 1,"b" -> 2)
    val v = map.get("b") match{
      case Some(i) => i
      case None => 0
    }
    println(v)
    //更好的方式
    val v1 = map.getOrElse("c",0)
    println(v1)
  }

}
