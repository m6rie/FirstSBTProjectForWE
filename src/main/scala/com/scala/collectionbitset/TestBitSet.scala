package com.scala.collectionbitset
import scala.collection.immutable.HashSet
import scala.collection.immutable.BitSet

object TestBitSet extends App {
  var number = BitSet(1,4,5,7,8,9987,75,4332,11,57,9,33,886,6)
  number.foreach((element:Int) => print(element + " "))

  var number2 = HashSet(1, 4, 5, 7, 8, 9987, 75, 4332, 11, 57, 9, 33, 886, 6, -2)
  number2.foreach((element: Int) => print(element + " "))
}
