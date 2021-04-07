resolvers ++= Seq(
  Resolver.url("lightbend-bintray-mirror-lagom-sbt-ivy",
  url("http://lightbend-bintray-mirror.s3-website.eu-central-1.amazonaws.com/lagom/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
    .withAllowInsecureProtocol(true),
  Resolver.url("lightbend-bintray-mirror-lagom-sbt-maven",
  url("http://lightbend-bintray-mirror.s3-website.eu-central-1.amazonaws.com/lagom/sbt-plugin-releases"))
    .withAllowInsecureProtocol(true),
Resolver.url("lightbend-bintray-mirror-lagom-maven",
  url("http://lightbend-bintray-mirror.s3-website.eu-central-1.amazonaws.com/lagom/maven"))
    .withAllowInsecureProtocol(true)
)

addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.6.4")