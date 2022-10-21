package com.scala.exercices.dayfour

//Write a Scala program to find the sum of the first and last digit of a number.

object FirstAndLastDigits extends App {
//  def firstLast(a: String) = {
    println("Enter a number: ")
    val a = scala.io.StdIn.readLine()
    val first = a.head - '0'
    val last = a.last - '0'
    val result = first + last
    println(s"The sum of the first and last digit is $result")
//  }
//    firstLast("43299")
}
