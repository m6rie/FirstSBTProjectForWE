package com.scala.fieldoverriding

class Vehicule {
  val speed:Int = 60
}

class Bike extends Vehicule {
  var tempSpeed = speed
  override val speed:Int = 100

  def show(): Unit = {
    println(speed)
  }
}

object fieldOverriding extends App {
  var b = new Bike
  b.show()
}
