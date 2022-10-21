package com.scala.patternmatching

object MixTypes {
  def main(args:Array[String]): Unit ={
    var result = search(333)
    println(result)
  }

  def search(a:Any):Any = a match {
    case 1 => {
      println("One")
      1
    }
    case "two" => {
      println("two")
      2
    }
    case true => {
      println("Boolean")
      3
    }
    case 5.77 => {
      println("double")
      4
    }
    case _ =>
      println("Nothing selected");
      5

  }
}
