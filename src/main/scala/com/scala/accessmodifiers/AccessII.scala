package com.scala.accessmodifiers

class AccessExample2{
  protected var a:Int = 22
}

class tempClass extends AccessExample2 {
  def display():Unit ={
    println(a)
  }
}

object AccessTest2 extends App {
  var s = new tempClass
  s.display()
}
