package com.scala.collections

import scala.collection.immutable.Queue
import scala.collection.immutable._

// First-in first-out data structure

object QueuePractice extends App {
  var queue = Queue(3,5,6,3,86,66,8,9,0,22)
  var queue2:Queue[Int] = Queue(43,5,77,97,2,4,6,8,9)

//  println(queue)
//  println(queue2)

  val firstElement = queue.front
  queue.foreach((element:Int) => {
//    println(element+4)
  })

// TO CREATE A NEW OBJECT AND ADD ELEMENT AT THE END OF THE QUEUE
  var enqueueQueue = queue.enqueue(36)
  enqueueQueue.foreach(((element:Int) =>{
    println(element)
  }))

  // TO CREATE A NEW OBJECT AND REMOVE THE ELEMENT AT THE BEGINNING OF THE QUEUE
  println("---- Dequeue the queue ----")
  var dequeueQueue = enqueueQueue.dequeue
//  println(dequeueQueue)
  println(dequeueQueue._1)
  println(dequeueQueue._2)

  // THIS FORMS A TUPLE
  var deq = queue.dequeue
  println(deq._1)
  println(deq._2)

  println(queue.sorted)
}
