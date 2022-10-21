package com.scala.higheroerderfunctions

object MultilineExpression extends App {
  println(add1(10, 20))

  def add1(i:Int, i1:Int): Int = {
    i // if i+ it'd print 30
    +i1 // prints 20: the program ignores the +
  }
}
