plugins {
    `java-gradle-plugin`
    kotlin("jvm") version "1.4.32"
    id("com.gradle.plugin-publish") version "0.14.0"
}

group = "com.dfsek"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    api("com.github.javaparser:javaparser-symbol-solver-core:3.20.2")
}

pluginBundle {
    website = "https://github.com/PolyhedralDev/TectonicGradle"
    vcsUrl = "https://github.com/PolyhedralDev/TectonicGradle"
    tags = listOf("tectonic", "config", "docs")
}

gradlePlugin {
    plugins {
        create("tectonicgradle") {
            id = "com.dfsek.tectonicgradle"
            displayName = "Tectonic Gradle"
            description = "Grade plugin to generate Javadoc-style documentation for Tectonic configurations."
            implementationClass = "com.dfsek.tectonicgradle.TectonicGradle"
        }
    }
}
