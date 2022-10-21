package com.scala.jdbcconnectwithdb

import java.sql._

object mySQLconnectivity extends App {
  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost:3306/mysql80"
  val username = "root"
  val password = "FtE73.mP11"

  // instance of connection
  var connection:Connection = null
  try{
    Class.forName(driver)
    connection = DriverManager.getConnection(url,username,password)

    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("select * FROM mysql80.movies")
    while(resultSet.next()){
      val title = resultSet.getString("name")
//      val genere = resultSet.getString("genre")
      println(s"title: ${title}")
    }
  }
}
