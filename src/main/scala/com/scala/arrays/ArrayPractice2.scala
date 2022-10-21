package com.scala.arrays

class ArrayExample2{
  var arrEx2 = new Array[Double](5)

  def show() = {
    for(a:Double <- arrEx2){
      println(a)   // this will print default value for the undefined a's
    }
    println(arrEx2(2))
    arrEx2(2)= 2.2
    println(arrEx2(4))
  }

//  def show2():Unit ={
//    for(var i=0 to arrEx2.length){
//      println(i)
//    }
//  }
}
/* Data types default values
String => null
Int => 0
Double => 0.0
 */

object ArrayPractice2 extends App {
  var a = new ArrayExample2
  a.show()
}
