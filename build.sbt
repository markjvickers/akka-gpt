import sbt.Keys.libraryDependencies

val DoobieVersion = "1.0.0-RC1"
val MonocleVersion = "1.5.0"
val CirceVersion = "0.14.5"
val AkkaVersion = "2.7.0"
val LogbackVersion = "1.2.11"

name := "akka-gpt"
description := "Akka-GPT"
version := "0.1.0"
scalaVersion := "2.13.9"
scalacOptions ++= Seq(
  "-deprecation",     //emit warning and location for usages of deprecated APIs
  "-unchecked",       //enable additional warnings where generated code depends on assumptions
  "-explaintypes",    //explain type errors in more detail
  "-Xfatal-warnings"  //fail the compilation if there are any warnings
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.9.0",
  "org.typelevel" %% "cats-effect" % "3.4.8",
  "com.chuusai" %% "shapeless" % "2.3.3",
  //"org.typelevel" %% "shapeless3-deriving" % "3.3.0",
  "io.circe"    %% "circe-core"    % CirceVersion,
  "io.circe"    %% "circe-generic"    % CirceVersion,
  "io.circe"    %% "circe-parser"  % CirceVersion,
  "io.circe"    %% "circe-literal" % CirceVersion,
  "io.circe"    %% "circe-config" % "0.10.0",
  "net.ruippeixotog" %% "scala-scraper" % "3.0.0",
  "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-remote" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion,
  "com.lightbend.akka" %% "akka-projection-core" % "1.3.1",
  "com.lightbend.akka" %% "akka-projection-jdbc" % "1.3.1",
  "com.lightbend.akka" %% "akka-persistence-jdbc" % "5.2.1",
  "com.typesafe.akka" %% "akka-serialization-jackson" % AkkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "com.itextpdf" % "itext7-core" % "7.2.3",
  "ch.qos.logback" % "logback-classic" % LogbackVersion,
  "org.tpolecat" %% "doobie-core" % DoobieVersion,
  "org.tpolecat" %% "doobie-postgres" % DoobieVersion,
  "org.mariadb.jdbc" % "mariadb-java-client" % "3.1.2",
  "com.github.pureconfig" %% "pureconfig" % "0.17.2",
  "com.github.pureconfig" %% "pureconfig-akka" % "0.17.2",
  "org.scalatest" %% "scalatest" % "3.2.15" % "test",
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test

)
