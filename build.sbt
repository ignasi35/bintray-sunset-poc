import Dependencies._

ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .enablePlugins(LagomScala)
  .settings(
    name := "Scala Seed Project",
    libraryDependencies ++= Seq(
      lagomScaladslApi,
      lagomScaladslBroker,
      lagomScaladslKafkaBroker,
      lagomScaladslServer,
      scalaTest % Test
    )
  )
