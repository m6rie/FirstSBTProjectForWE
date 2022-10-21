package com.scala.controlstructure

object ForLoops extends App {
  for(a<- 1 to 20) {
    println(a)
  }

  for(a<- 1 until 50)
    {
      println(a)
    }

  for(a<-1 to 10 if a % 2 == 0){
    println(a)
  }

  var result = for(a<-1 to 10) yield a
  for(i<- result){
    println(i)
  }
}
