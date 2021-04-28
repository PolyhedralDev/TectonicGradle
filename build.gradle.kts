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
