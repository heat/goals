name := "play-java"

version := "1.0-SNAPSHOT"

PlayKeys.externalizeResources := false

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJpa,
  "mysql" % "mysql-connector-java" % "5.1.38",
  "dom4j" % "dom4j" % "1.6.1" intransitive(),
  "org.hibernate" % "hibernate-core" % "5.2.3.Final"
)


