package com.scala.strings

object StringInterpolation extends App {
  new StringInter().show()
}

class StringInter {
  var s1 = "Scala string example"
  var version = 2.12

  def show():Unit = {
    println(f"This is $s1%s scala version is $version%2.2f")
  }
}