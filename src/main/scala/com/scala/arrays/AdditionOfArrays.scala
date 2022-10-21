package com.scala.arrays

// Array is a special kind of collection. It is a fixed size data structure that stores elements of the same data type.

class ArraySum {
  var arr1 = Array(Array(1,2,3,4,5),Array(6,7,8,9,10))
  var arr2 = Array(Array(1,2,3,4,5),Array(6,7,8,9,10))
  var arr3 = Array.ofDim[Int](2,5)

  def addAndShow() = {
    for(i <- 0 to 1){
      for(j <- 0 to 4){
        arr3(i)(j)=arr1(i)(j)+arr2(i)(j)
        print(" "+arr3(i)(j))
      }
      println()
    }
  }
}
object AdditionOfArrays extends App {
  var newArr = new ArraySum
  newArr.addAndShow()
}
