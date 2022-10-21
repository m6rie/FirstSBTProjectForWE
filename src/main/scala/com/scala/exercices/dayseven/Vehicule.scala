package com.scala.exercices.dayseven

abstract class Vehicule {
  val make:String
}

case class Car() extends Vehicule {
  override val make: String = "_"
}

case class Bike() extends Vehicule {
  override val make: String = "_"
}

object VehiculeReport {
  def printVehicules(tuture:List[Vehicule]) = {
    for(x <- tuture){
      println(VehiculeObject)
    }
  }
}

object VehiculeObject extends App {
  var vehic:List[Vehicule] = List(Car())
    var BMWCar = new Car {
      override val make: String = "BMW 3 Series"
    }
    var VWBike = new Car {
      override val make = "VW Golf"
    }
    var BMWBike = new Bike {
      override val make = "BMW G 310 R Bike"
    }
    var FireBike = new Bike {
      override val make: String = "Fire Storm Bike"
    }

  for(obj <- vehic){
    println(obj)
  }
//  VehiculeReport.printVehicules(println(vehic)
//  println(VehiculeReport.printVehicules(BMWCar))
}

