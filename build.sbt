ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.9"

lazy val root = (project in file("."))
  .settings(
    name := "astrolyzer9000"
  )

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.3.0"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "3.3.0"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.30"

// JSON parsing
val circeVersion = "0.14.3"

libraryDependencies ++= Seq(
  "io.circe"  %% "circe-core"     % circeVersion,
  "io.circe"  %% "circe-generic"  % circeVersion,
  "io.circe"  %% "circe-parser"   % circeVersion
)