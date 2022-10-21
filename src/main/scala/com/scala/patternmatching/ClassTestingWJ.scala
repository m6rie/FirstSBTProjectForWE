package com.scala.patternmatching

class StudentTemp(roll:Int){
  var rollNumber=roll
}

class PersonalDetails(NameV:String,ageT:Int){
  var Name=NameV
  var age=ageT
}
object MatchNumbers2 extends App{
  // var st=new Student(8)
  //prin
  //printingStatus(st)
  var st=new StudentTemp(1)

  var pt=new PersonalDetails("Jinesh",35)


  val studentRegister:Map[StudentTemp,PersonalDetails]= Map(st->pt)
  printingStatus(getStudentName(studentRegister,1))
  def getStudentName(studentRegister:Map[StudentTemp,PersonalDetails],roll:Int):Option[PersonalDetails]={
    var alpha:Option[PersonalDetails]=None
    var studentKeys=studentRegister.keys
    var check=false
    for(a <- studentKeys){
      if(a.rollNumber.equals(roll)){
        alpha=studentRegister.get(a)
        check=true
      }
    }
    if(!check){
      var pt1:Option[PersonalDetails]=None
      pt1
    }else{
      alpha
    }
  }
  def printingStatus(student:Option[PersonalDetails]):Unit={
    student match {
      case student => println("One"+student)

      case None => println("No")
    }
  }
}