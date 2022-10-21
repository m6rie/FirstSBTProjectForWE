package com.scala.collections

import scala.collection.immutable.SortedSet

// To create a new set of element without duplicates

object SortedSetTest extends App {
  var number:SortedSet[Int] = SortedSet(5,23,6,99,65,1,9,4)
  number.foreach((elem:Int)=> print(s"$elem "))
//  println()
}
