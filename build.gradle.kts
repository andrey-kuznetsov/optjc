plugins {
    java
    kotlin("jvm") version "1.4.21"
    id("com.github.johnrengelman.shadow") version "6.1.0"
    application
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("commons-io:commons-io:2.8.0")
    implementation("commons-codec:commons-codec:1.15")
    implementation("com.google.guava:guava:30.1-jre")
    implementation("org.jetbrains:annotations:20.1.0")
}

application {
    @Suppress("DEPRECATION")  // shadow plugin does not understand mainClass
    mainClassName = "incjc.IncJC"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "1.8"
}
