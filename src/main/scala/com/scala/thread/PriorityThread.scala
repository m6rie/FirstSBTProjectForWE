package com.scala.thread

class mythread extends Thread{
  override  def run(): Unit ={
    if(Thread.currentThread().isDaemon){
      println("daemon thread")
    }else{
      println("other work")
    }
  }
}
object testthreadutility extends App{
  var a= new mythread()
  var b= new mythread()
  var c= new mythread()
  a.setDaemon(true)

  b.start()
  c.start()
  a.start()

}
