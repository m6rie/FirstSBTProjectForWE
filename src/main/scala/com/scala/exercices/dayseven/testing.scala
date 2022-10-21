package com.scala.exercices.dayseven

object testing extends App {
  var logOut:Boolean = false
  println(s"Hi YOU. What would you like to do today? Select your choice and press enter: \n " +
    s"\bTo check your balance, press 1\n " +
    s"\bTo add money to your account, press 2\n " +
    s"\bTo withdraw money from your account, press 3\n " +
    s"\bTo delete your account, press 4\n " +
    s"\bTo log out, press 5")
  var loggedInChoice = scala.io.StdIn.readInt()
  while(!logOut) {
    if (loggedInChoice == 1) {
      //check balance
      println("1 working")
    }
    else if (loggedInChoice == 2) {
      //add money
      println("2 working")
    }
    else if (loggedInChoice == 3) {
      //withdraw money
      println("3 working")
    }
    else if (loggedInChoice == 4) {
      //delete account
      println("4 working")
    }
    else if (loggedInChoice == 5) {
      //log out
      println("5 working")
      logOut = true
    } else {
      println("Invalid choice. Try again: ")
      loggedInChoice = scala.io.StdIn.readInt()
    }
  }
}
