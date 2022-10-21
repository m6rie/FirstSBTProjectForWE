package com.scala.collections

object PriorityQueueTest extends App {

  case class Donut(name:String, price:Double)

  def donOrder(d:Donut):Double = d.price
  import scala.collection.mutable.PriorityQueue
  val priorityQueue:PriorityQueue[Donut] = PriorityQueue(
    Donut("Plain",1.50), Donut("Berry",4), Donut("Chocolate",2.4))(Ordering.by(donOrder))

  println(s"The element of the Priority Queue are $priorityQueue")

  priorityQueue.enqueue(Donut("NewDough", 5))
  priorityQueue+=(Donut("OtherDough",7))
  println(priorityQueue)
  println()
  var b:Donut = priorityQueue.dequeue()
  println(b.name)
}
