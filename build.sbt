name := "etfdocs_be"

version := "1.0"

lazy val `etfdocs_be` = (project in file(".")).enablePlugins(PlayJava)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq( javaJdbc ,evolutions, cache , javaWs, javaJpa, "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final", "org.mindrot" % "jbcrypt" % "0.3m","org.postgresql" % "postgresql" % "9.4.1208.jre7" )



