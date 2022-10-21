package com.scala.exception

class TestObject {
  def divide(a:Int,b:Int)={
    try{
      a/b
      var testEx = Array(1,2)
      testEx(10)
    } catch {
      case e:ArithmeticException => println(e)
      case exp:Exception => println(exp)
      case th:Throwable => println("Unknown " +th)
    } finally { // if you don't finally it won't execute the code underneath
      println("This is always executed")
    }
    println("Done")
  }
}

object TestObject extends App {
  var obj = new TestObject
  obj.divide(10,1)
}