package com.scala.higheroerderfunctions

// Function composition is the ability to combine functions together, in a specific order, to transform some shape into a new shape.

object ScalaComposition {
  def main(args: Array[String]):Unit = {
    val result = multiplyBy2(add(2))
    println(result)
  }

  def add(a:Int): Int = {
  a+2
  }

  def multiplyBy2(a:Int):Int = {
    a*2
  }

}
