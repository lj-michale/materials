package com.example.learn.collection

object ScalaCollection{

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4)
    // 集合长度
    println("size =>" + list.size)
    println("length =>" + list.length)
    // 判断集合是否为空
    println("isEmpty =>" + list.isEmpty)
    // 集合迭代器
    println("iterator =>" + list.iterator)
    // 循环遍历集合
    list.foreach(println)
    // 将集合转换为字符串
    println("mkString =>" + list.mkString(","))
    // 判断集合中是否包含某个元素
    println("contains =>" + list.contains(2))
    // 取集合的前几个元素
    println("take =>" + list.take(2))
    // 取集合的后几个元素
    println("takeRight =>" + list.takeRight(2))
    // 查找元素
    println("find =>" + list.find(x => x % 2== 0))
    // 丢弃前几个元素
    println("drop =>" + list.drop(2))
    // 丢弃后几个元素
    println("dropRight =>" + list.dropRight(2))
    // 反转集合
    println("reverse =>" + list.reverse)
    // 去重
    println("distinct =>" + list.distinct)

    // 集合映射
    println("map => " + list.map(x=>{x*2}))
    println("map => " + list.map(x=>x*2))
    println("map => " + list.map(_*2))
    // 集合扁平化
    val list1 = List(List(1,2), List(3,4))
    println("flatten =>" + list1.flatten)
    // 集合扁平映射
    println("flatMap =>" + list1.flatMap(list=>list))
    // 集合过滤数据
    println("filter =>" + list.filter(_%2 == 0))
    // 集合分组数据
    println("groupBy =>" + list.groupBy(_%2))
    // 集合排序
    println("sortBy =>" + list.sortBy(num=>num)(Ordering.Int.reverse))
    println("sortWith =>" + list.sortWith((left, right) => {left < right}))


  }
}
