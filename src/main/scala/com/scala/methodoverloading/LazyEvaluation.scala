package com.scala.methodoverloading

// Only used when they are called

object LazyEvaluation extends App {
lazy val myExpensiveValue = myExpensiveFunction //non lazy are printed immediately. lazy ones are printed when they are really called/used
// program won't work until a runMethod is created
  val settings:Boolean = true

    if(settings){
      var temp = myExpensiveValue // lazy variable is called here
      println("name is " + temp)
    }else {
      println("go to sleep")
    }

  def myExpensiveFunction(): Int = {
    println("name")
    8
  }
}
