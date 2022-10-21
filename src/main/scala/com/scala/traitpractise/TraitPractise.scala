package com.scala.traitpractise

trait Printable {
  def Print()
}

class A4 extends Printable{
  override def Print(): Unit = {
    println("It's a a4 page")
  }
}

object TraitPractise extends App {
  var traitPract:Printable = new A4()
  traitPract.Print()
}
