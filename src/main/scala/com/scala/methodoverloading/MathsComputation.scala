package com.scala.methodoverloading

class MathsComputation {
def add(a:Int,b:Int): Unit={ //you can replace the type with double
  var sum=a-b
  println(sum)
}

  def add(a: Int, b: Int,c:Int): Unit = {
    var sum = a + b + c
    println(sum)
  }
/* this gives an error message "method add is defined twice"
  def add(a: Int, b: Int): Unit = {
    var sum = a + b
    println(sum)
  }
 */
}

object Maintemp extends App {
  var a = new MathsComputation()
  a.add(5,6)
  a.add(3,4,5)
}