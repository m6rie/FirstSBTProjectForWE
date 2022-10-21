package com.scala.exercices.daysixe

import scala.io.StdIn.readLine

object Program extends App {
  var newUser = new SignUp
  newUser.signUp()
}

class SignUp {
  println("Type your first name: ")
  var firstName = readLine()
  println("Type your last name: ")
  var lastName = readLine()
  println("Type your email address: ")
  var email = readLine()
  println("Type your email address to confirm it: ")
  var email2 = readLine()


  def signUp():Unit = {
    var fullName = firstName.concat(" "+ lastName)
    println(s"Hi $fullName")


    if(email.equals(email2)){
      println("Email address confirmed")
    } else {
      println("Please type the same email address: ")
      var email2 = readLine()
    }
  }
}