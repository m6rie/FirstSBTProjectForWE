package com.scala.collectionbitset

import scala.collection.immutable.BitSet

// It is a collection which only contains unique items which are not repeatable

object AddingRemovingBitSet extends App {
  var numbers = BitSet(1,3,44,6,33,8,96,33,764,215,6)
  numbers.foreach((element:Int) => println(element))
  numbers+=20
  print("\nAfter adding 20")
  numbers.foreach((element:Int) => println(element))
  numbers -= 8
  print("\nAfter removing 8")
  numbers.foreach((element:Int) => println(element))
}
