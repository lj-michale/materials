package com.example.learn.oop

class User2 {

  // 主构造函数 ，形参中可以添加var、val将形参作为类的属性直接使用
  var username : String = _

  def this(name:String) { // 辅助构造函数，使用this关键字声明
    this() // 辅助构造函数应该直接或间接调用主构造函数
    username = name
  }

  def this( name:String, password:String ) {
    this(name) // 构造器调用其他另外的构造器，要求被调用构造器必须提前声明
  }

}
