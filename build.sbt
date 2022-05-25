
name := "sbt-catalysts"
description := "SBT plugin for Catalysts"

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.36"
enablePlugins(SbtPlugin)
addSbtPlugin("com.github.sbt"        %  "sbt-unidoc"               % "0.5.0")

addSbtPlugin("com.github.sbt"      %  "sbt-release"              % "1.1.0")
addSbtPlugin("com.github.sbt"      %  "sbt-pgp"                  % "2.1.2")
addSbtPlugin("org.xerial.sbt"      %  "sbt-sonatype"             % "3.9.13")
addSbtPlugin("com.github.sbt"    %  "sbt-git"                  % "2.0.0")

addSbtPlugin("com.github.tkawachi" %  "sbt-doctest"              % "0.10.0")

addSbtPlugin("pl.project13.scala"  %  "sbt-jmh"                  % "0.4.3")
addSbtPlugin("org.scalastyle"      %% "scalastyle-sbt-plugin"    % "1.0.0")
addSbtPlugin("org.scoverage"       %  "sbt-scoverage"            % "1.9.3")

addSbtPlugin("org.portable-scala"  %  "sbt-scalajs-crossproject" % "1.2.0")
addSbtPlugin("org.scala-js"        %  "sbt-scalajs"              % "1.10.0")
addSbtPlugin("com.47deg"           %  "sbt-microsites"           % "1.3.4")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"        % "0.3.1")

scalacOptions ++= Seq(Opts.compile.deprecation, "-feature")

scalaVersion := "2.12.15"

scmInfo := Some(ScmInfo(url("https://github.com/kailuowang/sbt-catalysts"), "git@github.com:kailuowang/sbt-catalysts.git"))

inThisBuild(List(
  organization := "com.kailuowang",
  homepage := Some(url("https://github.com/kailuowang/sbt-catalysts")),
  licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  developers := List(
    Developer(
      "kailuowang",
      "Kailuo Wang",
      "kailuo.wang@gmail.com",
      url("https://kailuowang.com")
    )
  ),
  versionScheme := Some("semver-spec")
))
scriptedBufferLog := false

scriptedLaunchOpts :=  Seq(
  "-Xmx1024M",
  "-Dplugin.version=" + version.value
)


//self referencing so that dependencies can be monitored by Scala Steward
org.typelevel.libraries.testDependencies(org.typelevel.libraries.libs.keys.toSeq:_*)
