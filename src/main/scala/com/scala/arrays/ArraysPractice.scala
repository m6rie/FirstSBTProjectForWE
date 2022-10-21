package com.scala.arrays

class ArraysPractice1 {
  var arr1 = Array(1,2,3,4,5,6,7,8,9)
  // to add an element at position 0 <arr1 ::= 10>
  var arr2:Array[String]=new Array[String](30) // this is populating an empty array of values null

  def show():Unit = {
    for (a<-arr1){
      println(a)
    }
//    for(a<-arr2){
//      println(a)
//    }
    println("third element: " + arr1(2))
  }
}

object mainPractice extends App {
  var prc = new ArraysPractice1
  prc.show()
}