import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    antlr
}

group = "com.soarex.truffle.lama"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    antlr("org.antlr:antlr4:4.12.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    dependsOn("generateGrammarSource")
    kotlinOptions.jvmTarget = "1.8"
}

tasks.generateGrammarSource {
    val grammarOutputDir = "gen/main/com/soarex/truffle/lama/parser"
    outputDirectory = File("${project.rootDir}/$grammarOutputDir")
    maxHeapSize = "64m"
    arguments = arguments + listOf("-no-listener", "-visitor", "-long-messages")
}