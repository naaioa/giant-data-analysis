
organization := "com.spike.giantdataanalysis"
name := "scala-temporal-apache-flink"
version := "1.0.0"
scalaVersion := "2.11.12"

lazy val FLINK_VERSION = "1.6.0"

libraryDependencies ++= Seq(
  "org.apache.flink" % "flink-core" % FLINK_VERSION withSources()
  , "org.apache.flink" %% "flink-scala" % FLINK_VERSION withSources()
  , "org.apache.flink" %% "flink-streaming-scala" % FLINK_VERSION withSources()
  , "org.apache.flink" % "flink-java" % FLINK_VERSION withSources()
  , "org.apache.flink" %% "flink-streaming-java" % FLINK_VERSION withSources()
  , "org.apache.flink" %% "flink-clients" % FLINK_VERSION withSources()
  //,"org.apache.flink" %% "flink-streaming-contrib" % FLINK_VERSION withSources() // for mock sink

  // connector: rabbitmq
  , "org.apache.flink" %% "flink-connector-rabbitmq" % FLINK_VERSION withSources()
  // queryable state
  , "org.apache.flink" %% "flink-queryable-state-client-java" % FLINK_VERSION % "provided" withSources()

  , "com.google.guava" % "guava" % "19.0" withSources()
  , "org.slf4j" % "slf4j-api" % "1.7.7"
  , "org.slf4j" % "slf4j-log4j12" % "1.7.7"
  , "log4j" % "log4j" % "1.2.17"

  // test
  , "org.scalactic" %% "scalactic" % "3.0.5"
  , "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  , "org.apache.flink" %% "flink-test-utils" % FLINK_VERSION % "test"

  // Streaming Ledger
  , "com.data-artisans.streamingledger" % "da-streamingledger-sdk" % "1.0.0" withSources()
  , "com.data-artisans.streamingledger" % "da-streamingledger-runtime-serial" % "1.0.0" withSources()
)

// https://stackoverflow.com/questions/5137460/sbt-stop-run-without-exiting
fork in run := true
cancelable in Global := true
