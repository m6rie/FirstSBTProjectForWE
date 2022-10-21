package com.scala.exercices.dayseven

/*
create class that accept an upper type bound for a donut type as its constructor argument. this particular pastry class will further have a name() method that calls a given pastry's printName() method
 */


abstract class Donuts {
  var name:String
  def printName() = {
    println(name)
  }
}

case class VanillaDonut() extends Donuts {
  override var name:String = "Vanilla donut"
}

case class GlazedDonut() extends Donuts {
  override var name:String= "Glazed Donut"
}

class Pastry[D <: Donuts](donut:D) {
  def name() = {
    donut.printName()
  }
}


object Donut extends App {
  var vaniDonut = new VanillaDonut()

  var ClassicDonut = new Pastry[Donuts](new Donuts {
    override var name: String = "Classic donut"
  })

  var GlazDonut = new Pastry[Donuts](new GlazedDonut) {
//    override def name(): Unit = {
//      println("Glazed donut")
//    }
  }
  vaniDonut.printName()
  GlazDonut.name()
  ClassicDonut.name()
}

