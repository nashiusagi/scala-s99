name:="s99"
scalaVersion:="3.3.0-RC4"

Compile / run / fork := true

scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest-flatspec" % "3.3.0-SNAP4" % "test",
  "org.scalatest" %% "scalatest-diagrams" % "3.3.0-SNAP4" % "test",
)