package com.scala.exception

class InvalidAgeException(s:String) extends Exception{
  override def toString: String = super.toString + " ------- " + s
}

class ExceptionExample3 {
  @throws(classOf[InvalidAgeException])
  def validate(age:Int):Unit ={
    if(age<18){
      throw new InvalidAgeException("Not eligible")
    } else {
      println("Eligible")
    }
  }
}

object createException extends App {
  var e = new ExceptionExample3()
  try{
    e.validate(4)
  }catch {
//    case e:Exception => println("Exception occurred " + e)
    case e:InvalidAgeException => println("Exception occurred " + e)
  }
}