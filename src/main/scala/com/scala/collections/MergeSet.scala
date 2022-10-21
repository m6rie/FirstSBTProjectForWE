package com.scala.collections

import scala.collection.immutable.HashSet
// To merge set you have to use ++

object MergeSet extends App {

  val a = HashSet(1,2,3)
  val b = HashSet(4,5,6)
  val c = a ++ b
  println(c)
}
