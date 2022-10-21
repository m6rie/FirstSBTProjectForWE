package com.scala.enumeration

object MilkyWay extends Enumeration {
  type Planets = Value
  val Mercury,Venus,Earth,Jupiter,Saturn,Uranus,Neptune,Mars = Value

  val Pluto = Value(9,"Pluto")
  val Zoto = Value(10,"Zoto")

  def isMilkyWay(planets: Planets) = {
    println(s"Planet ${planets.id} is ${planets}")
  }

  def isPlanet(planet:String) = {
    val check = MilkyWay.values.toList.map(v=> v.toString).contains(planet)
    println(s"The claim that ${planet} belongs to the Milky Way is ${check}")
  }

  def main(args: Array[String]): Unit = {
    println(s"Sum of values of Planets the Milky Way holds ${MilkyWay.values}")

    isMilkyWay(Earth)
    isPlanet("Mars")
  }
}
