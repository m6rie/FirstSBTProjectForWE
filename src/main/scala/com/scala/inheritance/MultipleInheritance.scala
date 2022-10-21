package com.scala.inheritance

import com.scala.traitpractise.Printable

// a class can inherit several traits but only one class

trait Printable{
  def print()
  def show():Unit={
    println("show method")
  }
}

trait Showable{
  def show()
}

class A6 extends Printable with Showable {
  override def print(): Unit = {
    println("some code")
  }

  override def show(): Unit = {
    println("something else")
  }
}

object MultipleInheritance extends App {
  var newTrait = new A6
  newTrait.show()
}
