addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.4.0")

resolvers += Resolver.url(
  "tpolecat-sbt-plugin-releases",
  url("http://dl.bintray.com/content/tpolecat/sbt-plugin-releases")
)(Resolver.ivyStylePatterns)
