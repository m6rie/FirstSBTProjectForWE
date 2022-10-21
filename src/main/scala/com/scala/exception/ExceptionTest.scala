package com.scala.exception

class ExceptionTest {
  @throws(classOf[NumberFormatException])
  def validate()= {
  "abc".toInt
  }
}

object ExceptionTest4 extends App {
  var e = new ExceptionTest()

  try {
    e.validate()
  } catch {
    case ex:NumberFormatException => println("Number format issue")
  }
  println("Rest of code executing")
}