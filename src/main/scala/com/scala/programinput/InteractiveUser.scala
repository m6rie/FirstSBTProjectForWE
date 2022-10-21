package com.scala.programinput

object InteractiveUser extends App {
  print("Enter your first name: ")
  val firstName = scala.io.StdIn.readLine()

  print("Enter your last name: ")
  val lastName = scala.io.StdIn.readLine()

  println(s"Your name is $firstName $lastName")


  println("Type Your Number: ")
  var a: Int = scala.io.StdIn.readInt
  println("Type Your String: ")
//  var b: Int = scala.io.StdIn.readLine()
}
