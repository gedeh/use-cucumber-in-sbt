import complete.DefaultParsers._

ThisBuild / scalaVersion := "2.13.4"
ThisBuild / organization := "scala.cucumber.junit"

lazy val root = (project in file("."))
  .settings(
    name := "cucumber-junit-sbt",
    libraryDependencies ++= Dependencies.cucumber
  )

lazy val cucumber = taskKey[Unit]("Cucumber")
cucumber := {
  runTask(Test, "io.cucumber.core.cli.Main").value
}
