package com.scala.collectionmap

object MapTest extends App {
  var map = Map(("A", "Apple"),("B","Banana")) // To create a map list
  var map2 = Map(("A" -> "Apple"), ("B" -> "Banana"))

//  var emptyMap:Map[String,String]=Map.empty[String,String]
//  println(map)
//  println(map2)
//  println(emptyMap)
//  map += ("C" -> "Canada", "D" -> "Danemark")
//  println(map)
//  map -= ("A")
//  println(map)

  val s1 = Set(5, 1, 3, 5, 6, 9)
  val result = s1.map(x => x * x)
  println(result)

  val s2 = List("jiensh", "aasd", "asdasd", "asdasdasd", "asdasdasdad")
  val result2 = s2.map(_.toUpperCase())
  println(result2)


  val s22 = List("jiensh", "aasd", "asdasd", "asdasdasd", "asdasdasdad")
  val result22 = s2.flatMap(_.toUpperCase())
  println(result22)
}
