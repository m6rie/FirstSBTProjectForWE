package com.scala.mixtraits

trait Printing{
  def printing()
}

abstract class PrintingA4{
  def printingA4()
}

class A6 extends PrintingA4 with Printing {
  override def printing(): Unit = {
    println("printing sheet")
  }

  override def printingA4(): Unit = {
    println("A4 sheet")
  }
}


object MixTraits extends App {
var As = new A6
As.printing()
As.printingA4()
}
