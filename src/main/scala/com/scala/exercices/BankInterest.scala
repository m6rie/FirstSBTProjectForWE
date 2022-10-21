package com.scala.exercices

object BankInterest extends App {


}
// Interest = P x R x N. P = Principal amount (the beginning balance). R = Interest rate (usually per year, expressed as a decimal). N = Number of time periods (generally one-year time periods)

class Banks {
  val interestRate:Double = 1.5/100

  def interest()={
    val monthlyInterest:Double = interestRate/12
//    var total:Double = savings/monthlyInterest
//    println(total)
  }
//  interest(10000)
}

class Santander extends Banks {

}

class BofA extends Banks {

}