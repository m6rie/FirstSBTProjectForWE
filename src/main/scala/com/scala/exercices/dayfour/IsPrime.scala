package com.scala.exercices.dayfour

object IsPrime extends App {

    // --- PRIME NUMBER ---
//    if number / allSmallerNumber == Double
//      var userInput:Int = scala.io.StdIn.readInt()
//      var doubleNumber:Int = _
//      if(userInput / (i <- userInput)){
//        false
//      }else {
//        true
//      }
    def isPrime(num: Int): Boolean = {
    //(num > 1) && !(2 to scala.math.sqrt(num).toInt).exists(x => num % x == 0) {
      //si num est divisible par les nombres entre 0 -> num
      for (i <- 2 to num / 2) {
        if (num % i == 0) false else true
//      println(isPrime(67))
//      println(isPrime(97))
//      println(isPrime(98))
      }
    isPrime(65)
    }
}
