# VelocityNT Recast

[![Build Status](https://img.shields.io/github/actions/workflow/status/PaperMC/Velocity/gradle.yml)](https://papermc.io/downloads/velocity)
[![Join our Discord](https://img.shields.io/discord/289587909051416579.svg?logo=discord&label=)](https://discord.gg/papermc)

A Minecraft server proxy with unparalleled server support, scalability,
and flexibility.

Velocity is licensed under the GPLv3 license.

## About VelocityNT Recast

Its predecessor was my other Velocity Fork, [VelocityNT](https://github.com/404Setup/VelocityNT).

It died due to poor latency performance and a messy code base.

For VelocityNT Recast, its goal is the same as VelocityNT, which is to provide a better experience for Windows users.

## RecastLib License

- [RecastXZ](https://github.com/404Setup/RecastXZ) 2025-2026 404Setup. All rights reserved. Source code is
  licensed under a MPL-2.0 License.
- [RecastSSL](https://github.com/404Setup/RecastSSL): 2025-2026 404Setup. All rights reserved. Source code is
  licensed under a BSD-3-Clause License.

## Use RecastLIB

RecastLib consists of the following parts:

- Velocity Native (MacOS/Linux Compress/Crypt)
- RecastXZ Native (Windows Compress)
- RecastSSL Native (Windows Crypt)

```groovy
repositories {
    mavenCentral()
    maven {
        name = 'VelocityRecast'
        url = 'https://mvn.pkg.one/snapshots'
    }
    // or
    maven {
        name = 'VelocityRecast'
        url = 'https://mvnc.pkg.one/snapshots'
    }
}

dependencies {
    implementation("one.pkg.velocity_rc:velocity-native:3.4.0-SNAPSHOT") {
        exclude group: 'io.netty'
    }
}
```

## Goals

* A codebase that is easy to dive into and consistently follows best practices
  for Java projects as much as reasonably possible.
* High performance: handle thousands of players on one proxy.
* A new, refreshing API built from the ground up to be flexible and powerful
  whilst avoiding design mistakes and suboptimal designs from other proxies.
* First-class support for Paper, Sponge, Fabric and Forge. (Other implementations
  may work, but we make every endeavor to support these server implementations
  specifically.)

## Building

Velocity is built with [Gradle](https://gradle.org). We recommend using the
wrapper script (`./gradlew`) as our CI builds using it.

It is sufficient to run `./gradlew build` to run the full build cycle.

## Running

Once you've built Velocity, you can copy and run the `-all` JAR from
`proxy/build/libs`. Velocity will generate a default configuration file
and you can configure it from there.

Alternatively, you can get the proxy JAR from the [downloads](https://papermc.io/downloads/velocity)
page.

# Localisation

Translations are handled using [Crowdin](https://papermc-io.crowdin.com/velocity).
If you want to translate a language not available on Crowdin,
you might want to ask in the [Discord](https://discord.gg/papermc) about it.
