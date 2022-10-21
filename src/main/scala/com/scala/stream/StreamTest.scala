package com.scala.stream

object StreamTest extends App {

  val stream = 1#:: 2#:: 8#:: 34#:: Stream.empty //Stream.empty to let the program know the string is done
  println(stream)

  println("Take the first 2 numbers from the stream")
  stream.take(2).print()
  println("")
  stream.take(10).print()

  println("----\n")
  stream.take(4).print()
  println(stream.map(_+5))
  stream.take(3).print()

  val stream2 = 1#:: 10#:: 100#:: 1000#:: 10000#:: Stream.empty
  println(stream2.filter(_>100))
  println(stream2.map{_*3})
  println(stream2.max)
  println(stream2.size)
  println(stream2.length)
  println(stream2.tail)
  println(stream2(3))
  
//  def facto(a:Int, b:Int, c:Int, d:Int):Stream[Int] = a#::
}
