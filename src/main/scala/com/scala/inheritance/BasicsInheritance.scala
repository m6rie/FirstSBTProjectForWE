package com.scala.inheritance

class BasicsInheritance extends App {
}

class Employee {
  var salary:Float=50000
}

class Programmer extends Employee {
  var bonus:Int=5000
  println(salary)
  println(bonus)
}

class BusinessPerson extends Employee {
  var bonus:Int=9000
  // salary = 55000 you can change the inherited value from inside
  println(salary)
  println(bonus)
}