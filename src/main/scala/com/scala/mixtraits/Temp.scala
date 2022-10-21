package com.scala.mixtraits

trait Printing1{
  def printing()
}

abstract class PrintingA41{
  def printingA4()
}

class A61 extends PrintingA4 {
  def printing(): Unit = {
    println("printing1 sheet")
  }

  override def printingA4(): Unit = {
    println("A41 sheet")
  }
}


object Temp extends App {
  var RAs = new A61 with Printing1 // you can add a class at initialization
  RAs.printing()
  RAs.printingA4()
}
