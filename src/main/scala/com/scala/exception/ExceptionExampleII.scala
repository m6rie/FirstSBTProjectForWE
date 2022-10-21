package com.scala.exception

object MainException extends App {
  new ExceptionExampleII().divide(100,10)
}

class ExceptionExampleII {
  def divide(a:Int,b:Int)={
    try{
      a/b
      var arr = Array(1,2)
      arr(10)
//      arr(1)
    } catch {
      case e:ArithmeticException=> println(e)
      case ex:Throwable=> println("Found unknown " + ex)
    }
    println("rest of the code executing")

  }
}
