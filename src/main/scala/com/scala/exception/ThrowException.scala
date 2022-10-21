package com.scala.exception

class ThrowException {
  def validate(age:Int) = {
    if(age<18) {
      throw new ArithmeticException("You're not eligible")
//      throw new Throwable("Not eligible")
    } else
      println("You're eligible")
  }
}

object MainObject{
  def main(args:Array[String]):Unit = {
    var e = new ThrowException
    e.validate(10)
  }
}