package com.scala.pattern

// A Singleton object is an object which defines a single object of a class.

object Singleton {
  def main(args:Array[String]) = {
    SingletonObject.hello()
  }
}

object SingletonObject {
  var a=2
  def hello() = {
    println("Hi this is a singleton"+a)
  }
}