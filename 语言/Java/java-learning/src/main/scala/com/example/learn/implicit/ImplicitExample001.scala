package com.example.learn.`implicit`

import collection.JavaConversions._

object ImplicitExample001 {

  def main(args: Array[String]): Unit = {

    for((k, v) <- System.getProperties if v == "") println(k -> v)

  }

}
