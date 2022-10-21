package com.scala.objectoriented

class Student {
  var id:Int=0;
  var name:String=null;
}

object ExecuteClass extends App {
  var s = new Student()
//  var s1 = new Student(1, "Hola")
  println(s.id+"------>"+s.name)
}
