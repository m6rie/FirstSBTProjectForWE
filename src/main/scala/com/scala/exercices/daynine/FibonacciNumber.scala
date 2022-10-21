package com.scala.exercices.daynine
// Compute the n-th Fibonacci Number

class FibonacciNumber {

}

object Fibonacci extends App {
  var initialNumber:Int = 1
  var lastNumber: Int = 1
  var nextNumber:Int = 0

  def fibo(a:Int) = {
    for(a <- 1 to 1000) {
      nextNumber = initialNumber + lastNumber
      lastNumber = initialNumber
      nextNumber = lastNumber

      nextNumber = initialNumber + lastNumber
      lastNumber = initialNumber
      nextNumber = lastNumber
    }
    println(nextNumber)
    println(lastNumber)
    println(initialNumber)
  }
fibo(1)


//   initialNumber = initialNumber + 1
//  lastNumber =
}