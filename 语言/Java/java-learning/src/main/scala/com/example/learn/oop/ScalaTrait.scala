package com.example.learn.oop

// 特质
// scala中没有接口。但是增加了特质（trait）。scala可以将多个类中相同的特征，从类中剥离出来，形成特殊的语法"特质"。
// 特质中可以声明抽象方法，也可以声明普通方法。特质的使用需要混入到类中。特质的一个重要的功能：可以进行功能的扩展。
// 特质也可以看做抽象类，继承其他的类，并用with混入其他的特质。特质又可以使用extends，又可以使用with。
object ScalaTrait {

  def main(args: Array[String]): Unit = {
    val mysql: MySQL = new MySQL
    mysql.operData()  //功能执行，从右到左
  }

  trait Operate {
    def operData(): Unit ={
      println("操作数据。。")
    }
  }

  trait DB extends Operate{
    override def operData(): Unit = {
      print("向数据库中。。")
      // 特质中的super其实有特殊的含义，表示的不是父特质，而是上级特质
      super.operData()
    }
  }

  trait Log extends Operate{
    override def operData(): Unit = {
      print("hello")
      super.operData()
    }
  }

  class MySQL extends DB with Log {

  }

}
