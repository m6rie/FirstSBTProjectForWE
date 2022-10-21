package com.scala.controlstructure

import LoopsContinous.a

object LoopsContinous extends App {
  var a = 10

  while (true) {
    println(a)
    a = a + 2
  }

  while (a <= 20) {
    println(a)
    a = a + 2
  }

  do{
    println(a)
    a+=2
  }while(a<=20)
}
