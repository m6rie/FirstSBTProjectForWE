package com.scala.customer


class StudentRecord (id:Int, name:String) {
def getRecord():Unit = {
  println(id+" "+name)
}
}

object MainObject extends App {
  var count = 0

  while(count < 5){
    var x = scala.io.StdIn.readInt()
    var y = scala.io.StdIn.readLine()
    var student = new StudentRecord(x, y)
    student.getRecord()
    count +=1
  }

  var student1 = new StudentRecord(101, "StuOne")
  var student2 = new StudentRecord(102, "Name2")
  student1.getRecord()
  student2.getRecord()
}