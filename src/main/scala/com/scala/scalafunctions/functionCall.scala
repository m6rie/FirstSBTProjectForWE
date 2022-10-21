package com.scala.scalafunctions

object functionCall {
  def main(args: Array[String]): Unit = {
    functionExam()
    var result = functionExamModify()
    println(result)
    println(functionExample(5,6))
  }

  def functionExam(): Unit = {
    println("Simple function")
  }
  // if you don't specify the type of a function's return it won't return anything
  def functionExamModify():Int = {
    var a = 10
    a
  }

  // Parametrised
  def functionExample(a: Int, b: Int): Int = {
    var c: Int = a + b
    c // Can't use println() as it is void and wouldn't return anything
  }

  def higherTest(test:Int) ={
    val test = 30
    test
  }
}
