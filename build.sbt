val commonSettings = tutSettings ++ Seq(
  scalaVersion := "2.10.5",
  libraryDependencies += "org.scalikejdbc" %% "scalikejdbc" % "2.2.6",
  libraryDependencies += "com.h2database" % "h2" % "1.4.+"
)

val japanese = project.settings(commonSettings).settings(
  tutSourceDirectory := (baseDirectory in LocalRootProject).value / "ja"
)

val english = project.settings(commonSettings).settings(
  tutSourceDirectory := (baseDirectory in LocalRootProject).value / "en"
)
