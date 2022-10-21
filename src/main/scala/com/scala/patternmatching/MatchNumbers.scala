package com.scala.patternmatching

object MatchNumbers extends App {
// extends App so that all the code is considered as a main function
  var a:Any = "tru"
  a match {
    case 2 => println("one")
    case "fam" => println("two")
    case 1.2 => println("one point two")
    case true => println("line")
//    case _ => println("no")
  }

  var studentRegister:Map[Int,String]=Map(1 -> "John", 2 -> "something")
//  printingStatus(getStudentName(studentRegister, 22))
//  def getStudentName(studentRegister:Map[Int,String],roll:Int):Option[String] = {
//    studentRegister.get(roll)
//    var studentKeys = studentRegister.keys
//  }

  def printingStatus(student: Option[String]):Unit = {
    student match {
      case student => println("One"+student)

      case None => println("No")
    }
  }
}

class Student(roll:Int) {
  var rollNumber: Int = 0
}