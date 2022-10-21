package com.scala.exercices

object BankInterestJinesh extends App {
//  var a = new
//  a.show()
}

class Bank {
  val centralBankROI = 1
  def getRateOfInterest():Int ={
    centralBankROI
  }
}

class Barclays extends Bank {
  //Bank
  val barclaysROI=2

  override def getRateOfInterest(): Int = super.getRateOfInterest()+barclaysROI
}