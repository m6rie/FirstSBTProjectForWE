package com.scala.tuples

object Tuples extends App {
  val tuple: (String, Int) = ("Name", 53)
  val stillTuple = "Jinesh" -> 24
  val tuple3: (String, Int, Boolean) = ("Jinesh", 34, true)

  println(tuple)

  var tuples = (1,3,5,7,5,8,99)
  var tuples2 = ("Apple", "orange")
  var tuples3 = (2.3,55,6.3,8.4)
  var tuples4 = (1,4,6,"lin",3.4)
  println(tuples)
  println(tuples2)
  println(tuples3)
  println(tuples4)
  println(tuples2.productArity) // to get the length
  tuples.productIterator.foreach{i=>println(i)} // to iterate over a tuple
}
