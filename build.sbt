scalaVersion := "2.11.0"

resolvers ++= Seq(
  "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.0.0"
  //"com.chuusai" %% "shapeless" % "2.1.0-SNAPSHOT"
)

initialCommands in console := """import shapeless._, workshop._, WorkshopDefns._"""
