import sbt._

object Dependencies {
  // scalaVersion needs to be kept in sync with ci
  val Scala213 = "2.13.16"
  val Scala3 = "3.3.6"
  val ScalaVersions = Seq(Scala213, Scala3)

  val PlayVersion = sys.props.getOrElse("play.version", sys.env.getOrElse("PLAY_VERSION", "3.1.0-M2"))
}
