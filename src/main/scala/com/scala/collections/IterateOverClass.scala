package com.scala.collections

object IterateOverClass  extends App {
  var games = Set("Cricket", "Foo") // with foreach, while
  games.foreach((elem:String)=>println(elem))
}
