import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    application
}

group = "org.jeamrh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //Ktor para server
    implementation ("io.ktor:ktor-server-core:2.3.11")
    implementation ("io.ktor:ktor-server-netty:2.3.11")
    implementation ("io.ktor:ktor-server-host-common:2.3.11")
    implementation("ch.qos.logback:logback-classic:1.2.11")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}
tasks {
    withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
        archiveBaseName.set("ServerKtor3")
        archiveClassifier.set("")
        archiveVersion.set("")
    }
}