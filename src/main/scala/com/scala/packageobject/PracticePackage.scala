package com.scala.packageobject

// Package objects can contain arbitrary definitions, not just variable and method definitions. For instance, they are frequently used to hold package-wide type aliases and implicit conversions. Package objects can even inherit Scala classes and traits.

package object PracticePackage {
  val a = 200

  def add(a:Int, b:Int) = {
    a+b
  }
}
