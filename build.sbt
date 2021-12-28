ThisBuild / organization := "org.apache.spark.mllib"

ThisBuild / name := "dbscan"

ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "2.12.15"

lazy val root = (project in file("."))
  .settings(
    name := "dbscan-spark"
  )

libraryDependencies ++= Seq(
  // https://mvnrepository.com/artifact/org.apache.spark/spark-core
  "org.apache.spark" %% "spark-core" % "3.2.0",
  "org.apache.spark" %% "spark-mllib" % "3.2.0",
  "org.scalactic" %% "scalactic" % "3.2.10",
  "org.scalatest" %% "scalatest" % "3.2.10" % "test",

  "com.meetup" %% "archery" % "0.4.0"
)
