package com.scala.stream

import scala.collection.immutable.Stream.cons

object AnotherStream extends App {
  val stream3:Stream[Int] = cons(1,cons(10,cons(1000,Stream.empty)))
  println(s"Elements of stream ${stream3}")
}
