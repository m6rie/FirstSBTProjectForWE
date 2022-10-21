package com.scala.strings

class StringExemple {
  var s1 = "Scala string ex"
  var s2 = "hello scala"
  var s3 = "hello scala" // same as <var s3 = "hello" + " scala">


  def show():Unit ={
    println(s1.equals(s2))
    println(s2.equals(s3))
  }
}

object StringPractice extends App {
  new StringExemple().show()
}
