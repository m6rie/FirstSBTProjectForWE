package com.scala.exception

class ExceptionPrepTest(currentMonth:String) extends Exception{
  override def toString: String = super.toString
}

class ExceptionPrep {
  @throws(classOf[ExceptionPrepTest])
  def validated(thismonth:Int):Unit ={
    if(thismonth <= 10){
      throw new ExceptionPrepTest("Wrong format")
    } else {
      println("Yes")
    }
  }
}

object monthException extends App {
  var m = new ExceptionPrep()
  try{
    m.validated(10)
  }catch {
    case m:ExceptionPrepTest => println("Exception occurred " +m)
  }
}