name := """reactivecouchbase-starter-kit"""

version := "1.0"

scalaVersion := "2.11.1"

resolvers ++= Seq(
  "ReactiveCouchbase Snapshots" at "https://raw.github.com/ReactiveCouchbase/repository/master/snapshots/"
)

libraryDependencies += "org.reactivecouchbase" %% "reactivecouchbase-core" % "0.4-SNAPSHOT"
