name := "couchbase-client"

version := "1.0"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "ReactiveCouchbase Snapshots" at "https://raw.github.com/ReactiveCouchbase/repository/master/snapshots/"
)

libraryDependencies += "org.reactivecouchbase" %% "reactivecouchbase-core" % "0.4-SNAPSHOT"
