package com.scala.higheroerderfunctions

import com.scala.scalafunctions.functionCall

// It is a function that takes at least 1 function as its argument(s) and may return a new function.

object HigherOrderFunction {
  def main(args: Array[String]) = {
    functionExample(25, multiplyBy2)
    functionExample(3, functionCall.higherTest)
  }

  def functionExample(a: Int, f: Int => AnyVal) = {
    println(f(a))
//    var tes = f * a
//    println(f + a)
  }

  def multiplyBy2(a: Int): Int = {
    a * 2
  }
}
