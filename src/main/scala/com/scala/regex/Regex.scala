package com.scala.regex

object Regex extends App {
  var str = "hello to all".r
  val source = "hello to all from these world"
  println(str.findFirstIn(source))

  val needChange = "repalcetest"
  val finalString = "replacetest".replaceAll(".test","**")
  println(needChange)
  println(finalString)

  val stringCheck = "check"
  val finalString2 = stringCheck.matches(".*k")
  println(finalString2)

  val sstring = "something to test the result"
  var finalsstring = sstring.split(".ng",4)
  for(sq <- finalsstring) {
    println(s"here is the array ${sq}")
  }
}
