ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "forkenstein",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio"      % "2.0.0",
      "dev.zio" %% "zio-test" % "2.0.0" % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
