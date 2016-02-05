name := "rights-app"

version := "0.1"

packageName in Universal := "rights-app-dist"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

routesGenerator := InjectedRoutesGenerator

libraryDependencies += "org.apache.jena" % "apache-jena-libs" % "2.13.0"
libraryDependencies += "com.github.jknack" % "handlebars" % "2.2.2"
libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "4.0.1.201506240215-r"
