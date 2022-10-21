package com.scala.exercices.dayfive

/*
Create a Scala program to find the 8th character in the String: "Jinesh".
Output:
The 3th character literal in n
 */
object FindCharInString extends App {
  println("Number: ")
  var name:String = "Jinesh"
  var character:Int = scala.io.StdIn.readInt()
  if(character < name.length) {
    println(name(character))
  } else throw new Error("The String is not long enough")

//  System.err.println("The String is not long enough")
//  println(name(2))
//  println(name(8))
}
