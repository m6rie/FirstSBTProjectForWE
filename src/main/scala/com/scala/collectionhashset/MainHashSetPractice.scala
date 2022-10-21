package com.scala.collectionhashset

import scala.collection.immutable.HashSet

// It is sealed class

object MainHashSetPractice extends App {
  var hashSet = HashSet(1,2,3,4,5,6,7)
  hashSet.foreach((element:Int)=> println(element))

  var hashSet2:HashSet[String] = HashSet("3Pilaka Ruchitha",
    "4Sugandha Dhanawade",
    "6Irfan Khan Patan",
    "7Vaibhav Kemani",
    "8Sumukh Jadhav")

  hashSet2.foreach(((element:String)=> {
    var string = "Update template set name \"" + element + "\" where project name is " + element.head
    println(string)
  }))
}
