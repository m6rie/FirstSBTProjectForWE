package com.scala.objectoriented

object ExecuteClass2 extends App {
var s = new Student1(100, "Hola")
s.show()
}

class Student1(id:Int, name:String) {
  def show():Unit ={
    println(s"$id----->$name")
  }

  // autoincrementation program
//  def autoinc(ids:Int): Unit = {
//    for(new Student1()){
//      var ids:Int = this.Student1.last
//      ids = ids+1
//    }
//  }
}
/*
 ------ Marius's code ------
package com.wiley.objectOriented
import scala.io.StdIn.{readInt, readLine}

class Student(id:Int, name:String) {
  def show(): Unit = {
    println(s"$id --> $name")
  }
}

object execSecondStudent extends App{
  print("How many students: ")
  var num = readInt()

  var students = List[Student]()

  for (x <- 1 to num) {
    print("Enter student name: ")
    val name = readLine()
    students = students :+ new Student(x, name)
  }

  showStudents()

  def showStudents(): Unit = {
    for (student <- students) {
      student.show()
    }
  }
}
 */