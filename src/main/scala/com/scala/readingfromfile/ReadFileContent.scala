package com.scala.readingfromfile

import scala.io.Source

object ReadFileContent extends App {
  println(Source.fromFile("/Users/marie/Documents/bankDB.rtf").mkString)

//  Source.fromFile("filepath").getLines().foreach(z=> println("line content is: "))
//  Source.fromFile("filepath").getLines().take(1).foreach(println)
//  Source.fromFile("filepath").getLines().slice(0,2).foreach(println)
//  println(Source.fromFile("filepath").toList)
//  println(Source.fromFile("filepath").toArray)
}
