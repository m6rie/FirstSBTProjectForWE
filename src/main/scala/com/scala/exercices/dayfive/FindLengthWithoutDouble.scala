package com.scala.exercices.dayfive

/*
Given a string s, find the length of the longest substring without repeating characters.
 */
object FindLengthWithoutDouble extends App {
  def longestString(str:String)={
    val removeDup:String = str.distinct
    val strLength = removeDup.length
    println(removeDup)
    println(strLength)
  }

  longestString("ttttttssssdf")
}
