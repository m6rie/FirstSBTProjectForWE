package com.scala.methodoverriding

object methodOverridingPractise extends App {
  var b = new Bike()
  b.run
}

class Vehicule {
  def run:Unit ={
    println("Vehicule is running")
  }
}

class Bike extends Vehicule {
  override def run():Unit ={
    println("Bike is running")
    super.run
  }
}