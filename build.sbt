name := "TEST"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
"org.apache.spark" %% "spark-core" % "2.1.0",

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
"org.apache.spark" %% "spark-sql" % "2.1.0"

)
