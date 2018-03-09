name := """play-silhouette-macwire-quill-circe-scalatags-example"""

version := "2.6.x"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLayoutPlugin)

// You should uncomment the following if you wish to use Twirl (https://www.playframework.com/documentation/2.6.x/Anatomy), since the PlayLayoutPlugin is disabled
//PlayKeys.playMonitoredFiles ++= (sourceDirectories in (Compile, TwirlKeys.compileTemplates)).value

scalaVersion in ThisBuild := "2.12.4"

libraryDependencies ++= {
  val silhouetteV = "5.0.2"
  val circeV = "0.9.0-M2"

  "org.scalatestplus.play"   %% "scalatestplus-play"              % "3.0.0-M3" % Test       ::
  "com.softwaremill.macwire" %% "macros"                          % "2.3.0"    % "provided" ::
  "org.postgresql"           %  "postgresql"                      % "42.1.4"                ::
  "io.getquill"              %% "quill-async-postgres"            % "2.1.0"                 ::
  "com.mohiva"               %% "play-silhouette"                 % silhouetteV             ::
  "com.mohiva"               %% "play-silhouette-password-bcrypt" % silhouetteV             ::
  "com.mohiva"               %% "play-silhouette-persistence"     % silhouetteV             ::
  "com.mohiva"               %% "play-silhouette-crypto-jca"      % silhouetteV             ::
  "com.lihaoyi"              %% "scalatags"                       % "0.6.7"                 ::
  "io.circe"                 %% "circe-core"                      % circeV                  ::
  "io.circe"                 %% "circe-generic"                   % circeV                  ::
  "io.circe"                 %% "circe-parser"                    % circeV                  ::
  "com.dripower"             %% "play-circe"                      % "2608.5"                :: Nil
}
