package com.example.learn.`implicit`

import java.io.File

/**
 * @descr 隐式转换切面封装
 * @date 2021/6/6 23:57
 */
object ImplicitExamplle002 {

  def main(args: Array[String]): Unit = {

    //定义隐式转换函数即可
    implicit def man2superman(man:Man):Superman = new Superman(man.name)

    val man = new Man("张三")
    man.fly()

    implicit def file2RichFile(file:File):RichFile = new RichFile(file)
    val f = new File("D:\\test\\test.txt")
    val txt = f.read()
    println(txt)


  }

  class Man(val name:String){
    def eat(): Unit ={
      println(s"man[ $name ] eat .........")
    }
  }

  class Superman(val name:String){
    def fly(): Unit ={
      println(s"Superman[ $name ] fly .........")
    }
  }

  class RichFile(val file:File){
    def read()={
      scala.io.Source.fromFile(file.getPath).mkString
    }
  }


}
