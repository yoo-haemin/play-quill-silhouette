name := """play-silhouette-macwire-quill-circe-scalatags-example"""

version := "0.0.1-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

scalaVersion in ThisBuild := "2.12.4"

resolvers += "Atlassian" at "https://maven.atlassian.com/content/repositories/atlassian-public/"

libraryDependencies ++= {
  val silhouetteV = "5.0.3"
  val circeV = "0.9.1"

  "org.scalatestplus.play"   %% "scalatestplus-play"              % "3.1.2" % Test       ::
  "com.softwaremill.macwire" %% "macros"                          % "2.3.0" % "provided" ::
  "org.postgresql"           %  "postgresql"                      % "42.2.1"             ::
  "io.getquill"              %% "quill-async-postgres"            % "2.3.2"              ::
  "com.mohiva"               %% "play-silhouette"                 % silhouetteV          ::
  "com.mohiva"               %% "play-silhouette-password-bcrypt" % silhouetteV          ::
  "com.mohiva"               %% "play-silhouette-persistence"     % silhouetteV          ::
  "com.mohiva"               %% "play-silhouette-crypto-jca"      % silhouetteV          ::
  "com.lihaoyi"              %% "scalatags"                       % "0.6.7"              ::
  "io.circe"                 %% "circe-core"                      % circeV               ::
  "io.circe"                 %% "circe-generic"                   % circeV               ::
  "io.circe"                 %% "circe-parser"                    % circeV               ::
  "com.dripower"             %% "play-circe"                      % "2609.0"             :: Nil
}
