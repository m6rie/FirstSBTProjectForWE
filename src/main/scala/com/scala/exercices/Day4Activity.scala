package com.scala.exercices

object Day4Activity extends App {
// --- given temperatures is less than 0 and the other is greater than 100 ---
  def temp (x:Int, y:Int) ={
    if(x < 0){
      println("First temp is less than 0")
    } else {
      println("First temp is greater than 0")
    }

    if(y > 100) {
      println("Second temp is greater than 100")
    } else {
      println("Second temp is not greater than 100")
    }
  }
  temp(-12, 55)


  // Write a program get all possible combination of your name
}
