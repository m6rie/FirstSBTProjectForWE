package com.scala.exercices

object datatypesexercice2 extends App {
//  var givenInt: Int = 34

//  var given_integer = 320
//  var given_integers = List(12, 79, 80, 90, 120, 121, 200, 279, 280, 310, 320, 321, 500)
//
//  for (x <- given_integers) {
//    if ((x >= 100 - 20 && x <= 100 + 20) || (x >= 300 - 20 && x <= 300 + 20)) {
//      println("True: " + x)
//    } else {
//      println("False: " + x)
//    }
//  }

  // SYNTAX EX
//  printf("Age = %d", 83)
  // write a program to print your name and version of scala you're using
//  def ScalaProg(name:String, version:String): Unit = {
//    var name = "M"
//    var version = util.Properties.versionString
//    println(name, version)
//  }

  val name = "Marie"
  val version = util.Properties.versionString
  println("Name: "+ name)
  println("Scala version: " +version)

  printf("Name: %s", name)
  printf("\nScala: %s", version)

  printf(s"\nName: $name" )
  printf(s"\nScala: $version")

  println("\nThi\bs is a \ttest of \ncharacter\n \fliterals\f. \rWith \"double\" and \'single\' quote\\")

//  System.err.println("Oopsi error spotted")

  // Data types Multiple Assignments
//  val (a:String, b:Int)=Pair("M", 45)
//  println(a)

  // --------------------
  // get name and age input
//  println("Enter name: ")
//  var firstname: String = scala.io.StdIn.readLine()
//  println("Enter age: ")
//  var userAge: Int = scala.io.StdIn.readInt()
//  println(s"Your name is $firstname and you are $userAge years old")

//  print("{\n\"donut_name\":\"Vanilla Donut\",\n\"quantity_purchased\":\"10\",\n\"price\":2.5\n}")
}
