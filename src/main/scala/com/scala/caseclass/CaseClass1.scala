package com.scala.caseclass

// They are regular classes which are immutable by default and decomposable through pattern matching
// It does not use new keyword to instantiate object. All the parameters listed in the case class are public and immutable by default
// a case class can not extend another case class
// case class CaseClass(parameters)

trait Car

case class Volkswagen(a:Int,b:Int) extends Car
case class BMW(a:Int) extends Car
case object tesla extends Car

object MainCaseClass extends App {
  callCase(Volkswagen(10,10))
  callCase(BMW(12))
  callCase(tesla)

  def callCase(f:Car) = f match {
    case Volkswagen(f,g)=>println("a="+f+ " " + "b="+g)
    case BMW(f)=> println("a="+f)
    case tesla=>println("No argument in case object")
  }
}
