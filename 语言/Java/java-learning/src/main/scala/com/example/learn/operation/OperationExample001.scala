package com.example.learn.operation

object OperationExample001 {

  def main(args: Array[String]): Unit = {

    // scala的尾递归

    /**
     * @param n：第几个数字，下标从1开始
     * @return
     */
    def  fibonacci(n: Int): Int ={
        if(n <= 2){
          1
        }else{
          fibonacci(n-1) + fibonacci(n-2)
        }
    }

    @scala.annotation.tailrec
    def  tailFibonacci(n: Int, acc1:Int=1, acc2: Int=1): Int = {
        if (n <= 2) {
          acc2
        } else {
          tailFibonacci(n - 1, acc2, acc1 + acc2)
        }
    }

  }

}
