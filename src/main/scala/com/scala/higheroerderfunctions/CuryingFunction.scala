package com.scala.higheroerderfunctions

object CuryingFunction extends App {
val result = add(10)(10)
  println(result)
  val addlt = add(10)_
  val result2 = addlt(3)
  println(result2)
  println(addlt) // doesn't print anything because it is waiting for the second parameter

  def add(a:Int)(b:Int):Int = {
    a+b
  }
  // ----------
//  val result = add(22)("biscuits")
//  println(result)
//
//  def add(a:Int)(b:String): Any = {
//    a+" " +b
//  }
}
