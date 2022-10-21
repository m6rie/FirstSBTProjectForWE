package com.scala.scalafunctions

object DefaultValFunction {
  def main(args: Array[String]) = {
    val result1 = functionExample(14,23)
    val result2 = functionExample(_, 55)
    val result3 = functionExample(45)
    print(result1+"\n" + result2+"\n" + result3)
  }
  // =0 default value if no one passes it
  def functionExample(a:Int=0, b:Int=0):Int ={
    a+b
  }
}
