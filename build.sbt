ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "FirstSBTProject"
  )

val scalaLogging="com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
val utilControl="org.scala-sbt" %% "util-control" % "1.7.2"

libraryDependencies ++= Seq(scalaLogging,utilControl)
//libraryDependencies += "org.scala-sbt" %% "util-control" % "1.7.2"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"

libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "3.0.0"

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "2.1.0"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.14"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % "test"

libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.30"
// val mysqlDependency = "mysql" % "mysql-connector-java" % "8.0.30"

// SEARCH scala util control maven dependency
// https://mvnrepository.com/artifact/org.scala-sbt/util-control
libraryDependencies += "org.scala-sbt" %% "util-control" % "1.7.2"