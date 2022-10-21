package com.scala.inheritance

class A { // this have to be trait A
  var salary1=10000
}

class B extends A {
  var salary2=20000
}

class C extends B { // or class C extends B with A
  def show():Unit ={
    println("salary1="+salary1)
    println("salary2="+salary2)
  }
}

object MultiLevelInheritance extends App {
var c = new C
c.show()
}
