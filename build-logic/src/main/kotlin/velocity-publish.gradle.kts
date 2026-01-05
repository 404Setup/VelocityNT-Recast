plugins {
    java
    `maven-publish`
}

extensions.configure<PublishingExtension> {
    repositories {
        maven {
            credentials(PasswordCredentials::class.java) {
                username = System.getenv("REPO_USER")
                password = System.getenv("REPO_PASS")
            }

            name = if (version.toString().endsWith("SNAPSHOT")) "paperSnapshots" else "paper" // "paper" is seemingly not defined
            val base = "https://mvn.pkg.one"
            val releasesRepoUrl = "$base/releases/"
            val snapshotsRepoUrl = "$base/snapshots/"
            setUrl(if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl)
        }
    }
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            pom {
                name.set("Velocity")
                description.set("The modern, next-generation Minecraft server proxy")
                url.set("https://papermc.io/software/velocity")
                scm {
                    url.set("https://github.com/PaperMC/Velocity")
                    connection.set("scm:git:https://github.com/PaperMC/Velocity.git")
                    developerConnection.set("scm:git:https://github.com/PaperMC/Velocity.git")
                }
            }
        }
    }
}
