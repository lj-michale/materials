package com.example.learn.operation

import scala.collection.immutable.Range

object ScalaLoopExample {

  def main(args: Array[String]): Unit = {

    // for循环
    for ( i <- Range(1,5)) {
      println("i = " + i )
    }

    // 循环守卫: 循环时可以增加条件来决定是否继续循环体的执行,这里的判断条件我们称之为循环守卫
    for ( i <- Range(1,5) if i != 3) {
      println("i = " + i )
    }

    // while循环

    // 循环中断
    // scala是完全面向对象的语言，所以无法使用break，continue关键字这样的方式来中断，或继续循环逻辑，而是采用了函数式编程的方式代替了循环语法中的break和continue
    // Breaks.break是依靠抛出异常来中断程序。
    scala.util.control.Breaks.breakable{
      for(i <- 1 to 5){
        scala.util.control.Breaks.break()
      }
      println()
    }



  }

}
