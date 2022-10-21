package com.scala.exercices.dayfour

//Write a Scala program to find the frequency of each digit in each integer.

object Frequency extends App {
  def numFreq(num: Int, dig: Int) = {
    var i = 0
      while (dig * i <= num) {
        i+=1
      }
    println("The frequency of " +dig+ " in " +num+ " is " + (i-1))
  }
  numFreq(24, 4)
  numFreq(23, 4)
}
