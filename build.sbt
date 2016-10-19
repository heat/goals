name := "play-java"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJpa,
  "mysql" % "mysql-connector-java" % "5.1.38",
  "org.hibernate" % "hibernate-core" % "5.2.3.Final"
)

resolvers += "hibernate" at "https://mvnrepository.com/artifact/org.hibernate/hibernate-core"
