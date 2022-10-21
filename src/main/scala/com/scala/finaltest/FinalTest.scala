package com.scala.finaltest

class Car {
  final val speed:Int=60

  final def print():Unit ={ // this can't be overridden either
    println("un dos tres")
  }
}

class Bike extends Car {
  //override val speed:Int=100 // doesn't work because speed cannot be overridden
}

object FinalMain extends App {
  val newC = new Bike
  newC.print()
}