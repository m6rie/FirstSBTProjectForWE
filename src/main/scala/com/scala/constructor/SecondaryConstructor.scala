package com.scala.constructor

// they are defined within the class. Here <age> and <job>

class SecondaryConstructor(id:Int, name:String) {
  var age:Int=0
  var job:String="null"

  def showDetails(): Unit = {
    println(id+" "+name+" "+age)
  }

  def showMoreDetails(): Unit ={
    println(id+" "+name+" "+age+ " "+ job)
  }

  def this(id:Int,name:String,age:Int,job:String){
    this(id+1,name)
    this.age=age+2
    this.job= "senior"+" "+job
  }
}

object MainTe extends App {
  var s = new SecondaryConstructor(1, "name", 35,"cook")
  var s1 = new SecondaryConstructor(2,"some1", 55, "cook")
  s.showDetails()
  s1.showMoreDetails()
}