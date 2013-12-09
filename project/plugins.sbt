// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3-SNAPSHOT")

// sbt-web plugins
addSbtPlugin("com.typesafe" % "sbt-jshint-plugin" % "1.0.0-SNAPSHOT")