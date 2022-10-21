package com.scala.exercices.daysixe

import scala.io.StdIn.readLine
import scala.io.StdIn.readInt
/*
Create a Scala class that has three constructors with one, two and three parameters respectively.
It should display the output on object instantiation and the output should be:
 First_name, Last_name, age.
Use Auxiliary Constructors
 */
class ScalaClassConstructors {
  def First_name(fn:String) = {
    println("What is your fn? ")
    var firstname = readLine()
  }

  def Last_name(fn: String) = {
    println("What is your ln? ")
    var lastname = readLine()
  }

  def age(fn: Int) = {
    println("What is your age? ")
    var age = readInt()
  }
}

object ClassConstructors extends App {
//  var person1 =
}
/*
VELLITA ANSWER

class Person(fName: String){
  var lName =""
  var age:Int = -1
  def this(fName:String, lName:String){
    this(fName)
    this.lName = lName
  }

  def this(fName: String, lName: String, age:Int) {
    this(fName, lName)
    this.age = age
  }

  override def toString: String = {
    f"$fName $lName aged $age"
  }
}
object ConstructorTask extends App{
  var user = new Person("Bob")
  var user1 = new Person("Peter", "Smith")
  var user2 = new Person("John","Edwards", 34)
  println(user)
  println(user1)
  println(user2)

}

---------------------
package com.wiley.LabWork

class SlideConstructorsTask() {
  var first_Name:String = ""
  var second_Name:String = ""
  var age: Int = 0

  def this(first_Name:String) {
    this()
    this.first_Name = first_Name
  }

  def this(first_Name:String, second_Name:String) {
    this()
    this.first_Name = first_Name
    this.second_Name = second_Name
  }

  def this(first_Name:String, second_Name:String, age:Int){
    this()
    this.first_Name = first_Name
    this.second_Name = second_Name
    this.age = age
  }

  def show(): Unit ={
    println(first_Name+", "+second_Name+", "+age)
  }
}

object testingblock extends App {
  var obj1 = new SlideConstructorsTask("Thomas", "Sadler", 22)
  obj1.show()

}

 */