package com.scala.collectionmap

import scala.collection.immutable._

// This is how you iterate through a hashmap

object Iteration extends App {
  var hashMap= HashMap(("A" -> "Apple"), ("B","Banana"), ("C" -> "Canada"))
  hashMap.foreach {
    case(key, value) => println(key+"--->"+value)
  }

  println(hashMap("B"))
  hashMap = hashMap+("D"->"Doll")
  hashMap.foreach{
    case(key,value)=> println(key+"--->"+value)
  }
}
