package com.scala.controlstructure

// A block of programming that analyzes variables and selects how to proceed based on given parameters

object ControlStructure extends App {
  var score:Int = 88
    if(score>=0 && score< 50){
      println("fail")
    } else if(score>=50 && score< 60){
      println("D")
    } else if(score>=60 && score< 70){
      println("C")
    } else if(score>=70 && score< 80){
      println("B")
    } else{
      println("A")
    }
}
