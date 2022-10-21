package com.scala.higheroerderfunctions

// An anonymous function is also known as a function literal. A function which does not contain a name is known as an anonymous function. An anonymous function provides a lightweight function definition. It is useful when we want to create an inline function.

object AnonymousFunction extends App {
  var result1 = (a:Int, b:Int) => a+b
  println(result1(11,12))

  var result2 = (_:Int)+(_:Int)
  println(result2(20, 56))
}
