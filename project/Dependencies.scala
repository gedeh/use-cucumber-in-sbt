import sbt._
import Keys._

object Dependencies {
    private val cucumberVersion = "6.9.0"
    val cucumber = Seq(
        "org.scalatest" %% "scalatest" % "3.2.3" % "test",

        "io.cucumber" % "cucumber-core" % cucumberVersion % "test",
        "io.cucumber" % "cucumber-jvm" % cucumberVersion % "test",
        "io.cucumber" %% "cucumber-scala" % cucumberVersion % "test",
        "io.cucumber" % "cucumber-junit" % cucumberVersion % "test",

        "junit" % "junit" % "4.13.1",
    )
}