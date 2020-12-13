ThisBuild / scalaVersion := "2.13.4"
ThisBuild / organization := "scala.cucumber.junit"

lazy val CucumberTest = config("cucumber") extend(Test)

def isCucumber(name: String): Boolean = name equals "cucumber.junit.CucumberRunner"
def notCucumber(name: String):Boolean = !isCucumber(name)

lazy val root = (project in file("."))
  .configs( CucumberTest)
  .settings(
    name := "cucumber-junit-sbt",
    libraryDependencies ++= Dependencies.cucumber,

    inConfig( CucumberTest)(Defaults.testTasks),
    Test / testOptions := Seq(Tests.Filter(notCucumber)),
     CucumberTest / testOptions := Seq(Tests.Filter(isCucumber))
  )
