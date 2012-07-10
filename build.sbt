name := "Akka Remote"

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor" % "2.0.2",
  "com.typesafe.akka" % "akka-remote" % "2.0.2"
)
