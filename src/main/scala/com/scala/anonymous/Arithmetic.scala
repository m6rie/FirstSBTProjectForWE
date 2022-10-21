package com.scala.anonymous

// Some example of arithmetic functions

class Arithmetic {
  def add(a:Int, b:Int) = {
    var add = a+b
    println("sum = "+add)
  }

  def divide(a:Int, b:Int) = {
    var divide = a / b
    println("product = " + divide)
  }
}

object MainObj extends App {
  new Arithmetic().add(10,10)
  new Arithmetic().divide(10,5)

}