package com.scala.abstractclass

abstract class Bike2(a:Int){
var b:Int=20
var c:Int = 25
  def run()
  def performance():Unit ={
    println("These performances are awesome")
  }
  }

class tesla(a:Int) extends Bike2(a) {
c=30

  override def run(): Unit = {
    println("running motor vroooom")
    println(a)
    println(b)
    println(c)
  }
}

object AbstractClassDetail extends App {
  var h=new tesla(10)
  h.run()
  h.performance()
}
