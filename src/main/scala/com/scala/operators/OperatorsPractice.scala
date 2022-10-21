package com.scala.operators

object OperatorsPractice extends App {
  var a = 40
  var b = 10
  var c = true
  var d = false
  var result = 0

  // Arithmetic
  println("Addition is" (a+b))

  println("Substration is" (a-b))

  // Relation operators
  if(a == b){
    println("Values are the same")
  } else {
    println("Values are different")
  }

  // Logical Operators
  println("Logical or of c || d is " + (c||d))

  // Bitwise AND operator
  result = a&b
  println("Bitwise and " + result)

  // Assignment operators
  println("Assignment operator is"+ (a+=b))
}
