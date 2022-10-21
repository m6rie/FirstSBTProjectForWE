package com.scala.arrays

// It is an array which store data in matrix form

object MultidimentionalArrays extends App {
  var a = new MultidimArrays
  a.show
  var b = new ArrOfArr
//  b.show2
}

class MultidimArrays {
  var arr = Array.ofDim[Int](n1=2,n2=2) // creating MD array of 2 lines & 2 columns
  arr(1)(0)=15
  def show ={
    for(i<- 0 to 1){ // i is the number of rows
      for(j<- 0 to 1){ // j is the number of column//for(j <- arr(i).indices)
        print(" "+arr(i)(j))
      }
      println("")
    }
    println("third element is "+arr(1)(1))
  }
}

class ArrOfArr {
  var arr2 = Array(Array(1,2,3,4,5),Array(6,7,8,9,10))
  println(arr2(0).length)
  println(arr2(1).length)

//  def show2 = {
//    for (ii <- 0 to arr2(1)) { // i is the number of rows
//      for (jj <- 0 to arr2(1).length-1) { // j is the number of column//for(j <- arr(i).indices)
//        print(" " + arr2(ii)(jj))
//      }
//      println("")
//    }
//    println("third element is " + arr2(1)(1))
//  }
}