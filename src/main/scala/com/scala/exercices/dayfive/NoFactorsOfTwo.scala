package com.scala.exercices.dayfive

import scala.util.control.Breaks._

/*
Write a Scala program and use an appropriate data structure to represent the following numerical values: 2, 8, 19, 20, 25, 50, 100, 10. Define a value function that will identify whether a given numeric value is divisible by 2. Using this value function, and starting from the left hand side to the right hand side, remove all elements from the aforementioned data structure that are factors of two. But, your program should stop removing elements as soon as a number literal is not a factor of two.
Output:
Starting from left to right, removing items that are factors of two, and will
stop execution on the first element that is not divisible by two:
19
20
25
50
100
10
 */
/*
scala> val originalList = List(5, 1, 4, 3, 2)
originalList: List[Int] = List(5, 1, 4, 3, 2)
scala> val newList = originalList.filter(_ > 2)
newList: List[Int] = List(5, 4, 3)
 */
object NoFactorsOfTwo extends App {
  var initialList: List[Int] = List(2, 8, 19, 20, 25, 50, 100, 10)

  var newList: List[Int] = initialList.filter(_ % 2 != 0)
//  var removeTest: List[Int] = initialList.remove()


//  for(a <- initialList){
//    while(a % 2 != 0){
//      var updList: List[Int] = List(a)
//      println(updList)
//    }
//
//  }
  println(initialList)
  println(newList)
//  println(updList)
  def value():Unit = {

  }
}
