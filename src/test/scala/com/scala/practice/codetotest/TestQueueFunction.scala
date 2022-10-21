package com.scala.practice.codetotest

import com.scala.collections.TestQueue

import scala.collection.immutable.Queue
import org.scalatest.funsuite.AnyFunSuite

class TestQueueFunction extends AnyFunSuite{
  test("Check queue front element"){
    val q = new TestQueue
    val initializeQueue = Queue(1,2,3,4,5,6,7,8,64,9)
    assert(q.returnFirstElement(initializeQueue) === 1)
  }
}
