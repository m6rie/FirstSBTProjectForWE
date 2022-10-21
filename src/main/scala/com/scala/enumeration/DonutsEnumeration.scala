package com.scala.enumeration

object DonutsEnumeration extends App {

  object Donut extends Enumeration{
    type Donut = Value

    val Glazed = Value ("Glazed")
    val Berry = Value ("Berry")
    val Plain = Value ("Plain")
    val Vanilla = Value ("Vanilla")
  }

  println(s"Vanilla donuts flavour => ${Donut.Vanilla}")
  println(s"Vanilla donuts ID => ${Donut.Vanilla.id}")
  println(s"Donuts flavours are => ${Donut.values}")

  Donut.values.foreach{
    case d if(d == Donut.Berry) || (d == Donut.Glazed) => println(s"Fave")
    case _ => println("Rejected" +_)
  }
}
