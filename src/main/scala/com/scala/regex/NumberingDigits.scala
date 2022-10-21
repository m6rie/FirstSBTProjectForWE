package com.scala.regex

import scala.util.matching.Regex

object NumberingDigits extends App {
  val reg = new Regex("\\d") // finds all the digits
  val reg2 = new Regex("\\D") // removes all the digits
  val str = "to check digit 520 in string"
  println((reg.findAllIn(str).mkString(", "))) // finds digits in str and separate them with a comma
  println((reg2.findAllIn(str).mkString(", ")))

  val reg3 = new Regex("\\S") // finds all the strings
  val reg4 = new Regex("\\s") // removes all strings
  val source1 = "hello to all from these world"
  println((reg3.findAllIn(source1).mkString(", ")))
  println((reg4.findAllIn(source1).mkString(", ")))

  val reg5 = new Regex("qlr")
  val tempstr = "Check regular expression"
  println(reg5.findAllIn(tempstr).mkString("  , "))

  val reg6 = new Regex(".") // finds all the char including spaces
  val reg7 = " checkf or new line."
  println(reg6.findAllIn(reg7).mkString(" , "))
}
