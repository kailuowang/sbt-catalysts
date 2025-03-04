package org
package typelevel

import sbt._
import sbtcatalysts.Libraries


object `package` {
  val typeLevelOrg = "org.typelevel"
  val libraries = Libraries()
    .add(name = "algebra",          version = "2.13.0",  org = typeLevelOrg, "algebra", "algebra-laws")
    .add(name = "discipline-core",  version = "1.7.0", org = typeLevelOrg)
    .add(name = "cats",             version = "2.13.0",org = typeLevelOrg, "cats-core", "cats-kernel", "cats-free", "cats-laws", "cats-testkit", "alleycats-core")
    .add(name = "cats-collections", version = "0.9.9",  org = typeLevelOrg, "cats-collections-core")
    .add(name = "cats-effect",      version = "3.5.7", org = typeLevelOrg, "cats-effect", "cats-effect-laws")
    .add(name = "cats-effect-testing",  version = "1.4.0",  org = typeLevelOrg, modules="cats-effect-testing-scalatest", "cats-effect-testing-utest", "cats-effect-testing-minitest")
    .add(name = "cats-mtl",         version = "1.5.0",  org = typeLevelOrg, "cats-mtl", "cats-mtl-laws")
    .add(name = "cats-retry",       version = "3.1.3",  org = "com.github.cb372")
    .add(name = "cats-tagless",     version = "0.16.3",    org = typeLevelOrg, "cats-tagless-core", "cats-tagless-laws", "cats-tagless-macros")
    .add(name = "cats-testkit-scalatest",version = "2.1.5",  org = typeLevelOrg)
    .add(name = "fs2" ,             version = "3.11.0",  org = "co.fs2", modules = "fs2-core")
    .addJVM(name = "fs2-jvm" ,      version = "3.11.0",  org = "co.fs2", "fs2-reactive-streams", "fs2-io")
    .addJVM(name = "fs2-kafka",     version = "3.6.0",  org = "com.github.fd4s")
    .addJVM(name = "http4s" ,       version = "0.23.30", org = "org.http4s", modules = "http4s-dsl",  "http4s-circe", "http4s-core")
    .addJVM(name = "http4s-modules" ,       version = "0.23.11", org = "org.http4s", modules =  "http4s-play-json",  "http4s-twirl", "http4s-blaze-client", "http4s-blaze-server")
    .add(   name = "jawn",          version = "1.6.0",  org = org.typelevel.typeLevelOrg, "jawn-ast", "jawn-parser", "jawn-util")
    .add(name = "kittens",          version = "3.4.0",  org = typeLevelOrg)
    .add(name = "mouse",            version = "1.3.2",   org = typeLevelOrg)
    .addJVM(name = "machinist",     version = "0.6.8",  org = typeLevelOrg)
    .add(name = "monocle",          version = "2.1.0",  org = "com.github.julien-truffaut", "monocle-core", "monocle-generic", "monocle-macro", "monocle-state", "monocle-law")
    .add(name = "newtype",          version = "0.4.4",  org = "io.estatico")
    .addJVM( name = "pureconfig",      version = "0.17.8", org = "com.github.pureconfig", "pureconfig-cats-effect", "pureconfig-generic")
    .add(name = "refined",          version = "0.11.3",  org = "eu.timepit", "refined", "refined-scalacheck", "refined-scodec")
    .add(name = "scalacheck",       version = "1.18.1", org = "org.scalacheck")
    .add(name = "scalatest",        version = "3.2.19",  org = "org.scalatest")
    .add(name = "scodec",           version = "1.11.10", org = "org.scodec", "scodec-core")
    .add(name = "shapeless",        version = "2.3.13",  org = "com.chuusai")
    .add(name = "simulacrum",       version = "1.0.1", org = "org.typelevel")
    .add(name = "specs2",           version = "4.20.9",  org = "org.specs2", "specs2-core", "specs2-scalacheck", "specs2-mock")
    .add(name = "scalac"   ,        version = "2.13.12")
    .add(name = "scalac_2.13",      version = "2.13.12")
    .add(name = "scalac_3",         version = "3.1.1")
    .add(name = "scalac_2.12",      version = "2.12.16")
    .add(name = "scalac_2.11",      version = "2.11.12")
    .add(name = "scalac_2.10",      version = "2.10.7")
    .addScalacPlugin(name = "kind-projector", version = "0.13.2",  org = typeLevelOrg, crossVersion = CrossVersion.full )
    .addScalacPlugin(name = "paradise",       version = "2.1.1", org = "org.scalamacros", crossVersion = CrossVersion.full )

}

