lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .settings(
    name := "play-java-websocket-example",
    version := "1.0",
    scalaVersion := "2.13.0",
    // https://github.com/sbt/junit-interface
    testOptions += Tests.Argument(TestFrameworks.JUnit, "-a", "-v"),
    libraryDependencies ++= Seq(
      guice,
      ws,
      "org.webjars" %% "webjars-play" % "2.7.3",
      "org.webjars" % "bootstrap" % "2.3.2",
      "org.webjars" % "flot" % "0.8.3",

      // Testing libraries for dealing with CompletionStage...
      "org.assertj" % "assertj-core" % "3.8.0" % Test,
      "org.awaitility" % "awaitility" % "3.0.0" % Test,
    ),
    LessKeys.compress := true,
    javacOptions ++= Seq(
      "-Xlint:unchecked",
      "-Xlint:deprecation",
      "-Werror"
    )
  )
