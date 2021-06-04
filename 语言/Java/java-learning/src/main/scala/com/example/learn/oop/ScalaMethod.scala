package com.example.learn.oop

object ScalaMethod {

  def main(args: Array[String]): Unit = {

      //通过new来创建User 的对象
      val user = new User
      user.login("zhangsan", "000000")

      //通过伴生类创建对象，
      val user2 = User.apply()
      val user3 = User()  // 必须加上小括号，若不加小括号，则user3就是User伴生对象

  }

  // 类
  class User{
    def login( name:String, password:String ): Boolean = {
      false
    }
  }

  // User类的伴生对象
  object User{   //User 的伴生对象，静态，可以通过类名直接访问，只会初始化一次
    def apply():User={  //不能省略小括号
      new User()
    }
  }

}
