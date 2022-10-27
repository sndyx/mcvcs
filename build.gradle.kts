import kr.entree.spigradle.kotlin.*

plugins {
    kotlin("jvm") version "1.7.10"
    id("kr.entree.spigradle") version "2.4.2"
}

group = "org.index0.mcvcs"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    enginehub()
    protocolLib()
}

dependencies {
    compileOnly(spigotAll("1.19.2"))
    compileOnly(worldedit("7.2.0"))
    compileOnly(protocolLib("4.5.1"))
}

spigot {
    authors = listOf("sndy")
    commands {
        create("branch")
    }
}