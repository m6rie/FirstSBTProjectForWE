package com.scala.constructor

// Defined when the class is created. Here <i> and <name>

class PrimaryConstructor(i:Int, name:String) {
def showDetails() ={
  println(i+" "+name)
}
}

object temp extends App {
  var s = new PrimaryConstructor(1, "something")
  s.showDetails()
//  println("")//missing the end lines
}