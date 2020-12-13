ThisBuild / scalaVersion := "2.13.4"
ThisBuild / organization := "scala.cucumber.junit"

lazy val root = (project in file("."))
    .settings(
        name := "cucumber-junit-sbt",
        libraryDependencies ++= Dependencies.cucumber,
        testOptions := Seq(
            Tests.Argument(TestFrameworks.JUnit, "-a")
        )
    )