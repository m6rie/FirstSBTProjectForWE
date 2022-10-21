package com.scala.exercices.dayfive

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false


Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */
object Anagram extends App {
  def anagram(t:String, s:String) = {
    var tList = t.split(',')
    var tSorted = t.toLowerCase().sorted
    var sList = s.split(',')
    var sSorted = s.toLowerCase().sorted

    if(tSorted == sSorted){
      println(true)
    } else {
      println(false)
    }
  }
  anagram("anAmam","amAanM")
}
