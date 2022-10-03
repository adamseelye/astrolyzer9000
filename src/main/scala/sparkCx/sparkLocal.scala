package sparkCx

import org.apache.spark.sql.SparkSession
import org.apache.log4j.{Level, Logger}

object sparkLocal {
  System.setProperty("HADOOP_USER_NAME","data")

  val spark = SparkSession.builder
    .appName("cryptoquery")
    .master("local[*]")
    .config("spark.driver.allowMultipleContexts", "true")
    .enableHiveSupport()
    .getOrCreate()
  Logger.getLogger("org").setLevel(Level.ERROR)
  println("~~ Created Spark Session ~~")

  val url = "jdbc:mysql://localhost:3306/cryptoquery"
  val user = "cryptoquery"
  val pass = "MN3ttXP9LE"

}