name := """customy"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))

scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies += "dev.zio" %% "zio" % "2.0.0-RC5"
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.12"
