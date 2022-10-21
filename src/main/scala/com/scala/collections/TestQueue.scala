package com.scala.collections

import scala.collection.immutable.Queue


class TestQueue {
  var queue = Queue(3, 5, 6, 3, 86, 66, 8, 9, 0, 22)
  var queue2: Queue[Int] = Queue(43, 5, 77, 97, 2, 4, 6, 8, 9)
  def returnFirstElement(zxy:Queue[Int]): Unit ={
    val firstElement = zxy.front
    firstElement
  }
}
