package com.scala.exercices.dayfive

import io.AnsiColor._

/*
Create a Scala program to prompt customers for their name and age. The format for the name and age labels should be in bold. And, the name literal should be underlined.
Output:
Name: Nadim Bahadoor
Age: 38
 */

object StylingPrompt extends App {
  def id() = {
    println("What is your name?")
    val name:String = scala.io.StdIn.readLine()
    println("How old are you?")
    val age:Int = scala.io.StdIn.readInt()
    println(s"\u001B[1mName:\u001B[0m ${UNDERLINED}$name${RESET}\n${BOLD}Age:${RESET} \u001B[4m$age\u001B[0m")
  }
  id()
  // you can either use the ANSI code or the AnsiColor import
//  var bold:String = s"\u001B[1mbold\u001B[0m"
//  var bold2:String = s"${BOLD}bold${RESET}"
//  var underlined:String = s"${UNDERLINED}Underlined${RESET}"
}
