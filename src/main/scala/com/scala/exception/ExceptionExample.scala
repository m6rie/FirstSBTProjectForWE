package com.scala.exception

class ExceptionExample {
  def divide(a:Int,b:Int) = {
    try { // the code you think will throw an exception
      a / b // Exception occurs
      println("rest of the code executing")
    }
    catch { // what to do with the exception
      case e:ArithmeticException=> println(e)
    }
  }
}

object checkException extends App {
  new ExceptionExample().divide(200,0)
}