import de.johoop.jacoco4sbt._
import JacocoPlugin._

name := "hello"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"

seq(jacoco.settings : _*)

jacoco.reportFormats in jacoco.Config := Seq(XMLReport("utf-8"))
