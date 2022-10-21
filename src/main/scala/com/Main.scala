package com

object Main extends App {
        println("Hello world!")

        val tuple: (String, Int) = ("Name", 33)
        val stillTuple = "Jinesh" -> 24
        val tuple3: (String, Int, Boolean) = ("Jinesh", 34, true)
        val name = tuple3._2
        println(tuple)
        println(name)
        val(username, wifeage)= stillTuple
        println(wifeage)

        val data= Map("A" -> 2, "B" -> 25, "C" -> 40, "D" -> 56)
        println(data.mkString(" || "))

        case class Person(name:String, isAdult:Boolean)
        val createPerson:(String,Int) => Person = (name,age) => Person(name,age>18)
        val users = data.map(createPerson.tupled)
        println(users)

        val animals = Map("dog" -> "canin", "pigeon" -> "bird", "fourmi" -> "insect")
        case class Animal(name:String, family:String)
        val createAnimal:(String,String) => Animal = (name, family) => Animal(name, family)
        val ninimal = animals.map(createAnimal.tupled)
        println(ninimal)
        }
