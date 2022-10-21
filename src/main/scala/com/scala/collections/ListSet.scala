package com.scala.collections
import scala.collection.immutable._

// It is a collection that contains unique items which are not repeatable

object ListSet extends App {
  var listSetObject:ListSet[Int] = scala.collection.immutable.ListSet(1,2,4,2,6,77,4,98,34)
  listSetObject.foreach((element:Int) => println(element))
  println(listSetObject.isEmpty)
  listSetObject = scala.collection.immutable.ListSet.empty
  println(listSetObject.isEmpty)
}
