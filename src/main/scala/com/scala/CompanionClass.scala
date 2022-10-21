package com.scala

class CompanionClass {
  def hello()={
    println("This is a companion class")
  }
}

object CompanionObject extends App {
  new CompanionClass().hello()
  println("Companion Object")
}