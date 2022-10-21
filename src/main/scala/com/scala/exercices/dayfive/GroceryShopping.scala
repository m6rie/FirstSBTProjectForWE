package com.scala.exercices.dayfive

/*
Write a Scala program and use a case class to define a shopping cart item. Each shopping cart item should have the following properties, namely, a name, a price, and a quantity bought. Create three shopping cart items for the following items:
10 vanilla ice cream at $2.99 each
3 chocolate biscuits at $3.99 each
5 cupcakes at $4.99 each

Use an appropriate data structure to store the above-mentioned shopping cart items. Thereafter, define and use a method that will print out all items from a given shopping cart.
Output:
10 vanilla ice cream at $2.99 each
3 chocolate biscuits at $3.99 each
5 cupcakes at $4.99 each

Define also another method that given a shopping cart basket will only output vanilla ice cream products. A generic message, such as, "Found another item", will be the output for all other items.
 */

object Cart extends App {
  case class ShoppingCartItem(name:String, price:Double, quantity:Int)

  val iceCream = new ShoppingCartItem("Vanilla Ice Cream", 2.99, 10)
  val biscuit = new ShoppingCartItem("Chocolate Biscuit", 3.99, 3)
  val cupcake = new ShoppingCartItem("Cupcakes", 4.99, 5)

  def basket() = {
    println(s"\n${iceCream.quantity} ${iceCream.name} at $$${iceCream.price} each")
    println("Found another item. Press \"Y\" if you would you like to see it?")
    val seeMore:Char = scala.io.StdIn.readChar().toUpper
    if(seeMore == 'Y'){
      println(s"${biscuit.quantity} ${biscuit.name} at $$${biscuit.price}\nFound another item. Press \"Y\" if you would you like to see it?")
      val seeMore:Char = scala.io.StdIn.readChar().toUpper
      if(seeMore == 'Y'){
        println(s"${cupcake.quantity} ${cupcake.name} at $$${cupcake.price} each\n \bNo more item found.")
      } else {
        println("See you later!")
      }
    } else {
      println("See you later!")
    }

    //  println("How much ice cream would you like?")
    //  val iceCreamInput = scala.io.StdIn.readInt()
    //  println("How much biscuit would you like?")
    //  val biscuitInput = scala.io.StdIn.readInt()
    //  println("How much cupcake would you like?")
    //  val cupcakeInput = scala.io.StdIn.readInt()
    //  val totalPrice = (iceCream.price * iceCreamInput) + (biscuit.price * biscuitInput) + (cupcake.price * cupcakeInput)
  }
  basket()
}
