package com.scala.abstractclass

// The abstract class cannot be instantiated on their own.
// The methods inside an abstract class don't necessarily provide an implementation. If they don’t, these methods should be implemented by which ever class overrides the abstract class.

abstract class Bike {
  def run()
  var f = new Bike {
    override def run(): Unit = {
      println("new bike")
    }
  }
}

class Hero extends Bike {
  override def run(): Unit = {
    println("running smoothly")
  }
}

object AbstractClassMain extends App {
  var h = new Hero
  var g = new Bike {
    override def run(): Unit = {
      println("testing bike class")
    }
  }
  h.run()
  g.run()
}
