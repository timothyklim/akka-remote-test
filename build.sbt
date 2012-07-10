name := "Akka Remote"

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases"

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/snapshots"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-remote" % "2.1-SNAPSHOT"
)
