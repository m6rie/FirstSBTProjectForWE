package com.scala.strings

object StringComparison extends App {
  new StringComparison().show()
}

class StringComparison {
  var s1 = "Scala"
  var s2 = " Hello Scala"
  var s3 = "Hello Scala"
  var s4 = " scala"
  var s5 = s3.concat(s4)

  def show():Unit ={
    val d:Int = s1.compareTo(s2)
    println(d)
    println(s2.compareTo(s3))
    println(s5)
    println(s1.substring(1,2))
  }
}