package com.scala.accessmodifiers

// There are 3 access modifiers:
// Public: by default.It is the least restrictive. The content is accessible by everybody.
// Protected: more restrictive than public, but less so that private. Accessible by the class, subclass and companion.
// Private: the most restrictive. Only accessible by the class and companion.

class AccessExample {
  private var a:Int=10
  def show():Unit = {
    println(a)
  }

  def set(a1:Int): Unit ={
    a=a1
  }
}

object AccessTest1 extends App {
  var p = new AccessExample
  // p.a = 98 doesn't work because we cannot change a private variable
  p.set(98)
  p.show()
}
