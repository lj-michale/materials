package com.example.learn.`implicit`

/**
 * @descr 为一个类添加一个新的方法
 * @date 2021/6/6 23:57
 */
object ImplicitApp {

  def main(args: Array[String]): Unit = {

    // 定义隐式转换函数,用于将man成superMan
    implicit def man2superman(man:Man):SuperMan=new SuperMan(man.name);
    // 实例化一个man
    val man = new Man("rdb")
    //返回的是一个超人
    man.fly()
    // 同时它也是一个人
    man.eat("马铃薯")

  }

  class Man(val name:String){
    def eat(food:String): Unit ={
      println(s"${name} 正在吃 ${food}")
    }
  }

  class SuperMan(val name:String){
    def fly(): Unit ={
      println(s"${name} is fly ......")
    }
  }

}


