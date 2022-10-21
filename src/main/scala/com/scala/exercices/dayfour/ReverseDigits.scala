package com.scala.exercices.dayfour

// --- REVERSE ALL DIGITS OF A NUMBER ---
object ReverseDigits extends App {
  def reverseNum(number:Int): Unit ={
    println("Type a number: ")
    val number:Int = scala.io.StdIn.readInt()
    val rev:Int = ((number).toString.reverse).toInt
    println(s"The reverse version of $number is $rev.")
  }
    reverseNum(5678)
}
