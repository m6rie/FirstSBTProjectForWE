package com.scala.collections

// The higher data type. All data types are Any, Any then is divided between AnyVal and AnyRef

object TypeHierachy extends App {
  // Step1: declare a variable of type Any
  println("Step1: declare a variable of type Any")
  val favouriteItem:Any = "Glazed Donut"
  println(favouriteItem)
  println("\nDeclare a variable of type AnyRef")
  val pizza:AnyRef = "Cheese pizza"
  println(pizza)
  println("\nDeclare a variable of type AnyVal")
  val pricePizza:AnyVal = 4.5
  println(pricePizza)


  // -----------

  println("----------------")
  val myList = Nil
  println(myList.length)
  println(None.toString)


}
