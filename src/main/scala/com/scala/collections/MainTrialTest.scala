package com.scala.collections

object MainTrialTest extends App {
  var set1 = Set()
  var set2 = Set("one",1)
  var games:Set[String]= Set("Cricket","Football","Hockey","Golf")
  var set3 = Set("Ananas","Golf")

  var numbers:Set[Int]= Set(1,5,7,9,3,9,6)
//  var sortedGames = (++(numbers))
  games +="Basket" // add
  games -= "Golf" // remove

//  println(games.head)
//  println(games.tail)
//  println(set1.isEmpty)
//  println(set1)

//  println(numbers.excl(1))
//  println(games.excl("Basket"))
//  println(games.dropRight(1)) // remove string on the right
//  println(games++set2)
//  println(games.diff(set3)) // shows string from games that aren't in set3
//  println(games.)
//  println(games)
//  println(games.size)
//  println(games.contains("Cricket"))
//  println(games+ "+=")

  println(numbers)
//  println(games.toSeq.sorted)
//  println(games.toSeq.reverse)
//  println(games.toSeq.reverse.head)

}
