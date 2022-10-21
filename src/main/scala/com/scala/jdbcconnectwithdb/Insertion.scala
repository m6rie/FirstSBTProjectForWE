package com.scala.jdbcconnectwithdb

import java.sql._

object Insertion extends App {
  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost:3306/mysql80"
  val username = "root"
  val password = "FtE73.mP11"

  // instance of connection
  var connection: Connection = null
  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)
    val insertMySQL = "INSERT INTO movies (name, genre, director, release_year) VALUES (?,?,?,?)"
    val preparedStatement:PreparedStatement = connection.prepareStatement(insertMySQL)

    preparedStatement.setString(1,"ABC")
    preparedStatement.setString(2,"comedy")
    preparedStatement.setString(3,"temp")
    preparedStatement.setString(4,"2022")
    preparedStatement.execute()

  }catch {
    case e:Exception => e.printStackTrace()
  }
  finally {
    connection.close()
  }
}