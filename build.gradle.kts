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
    val graalvmVersion: String by project
    annotationProcessor("org.graalvm.truffle", "truffle-dsl-processor", graalvmVersion)
    implementation("org.graalvm.sdk", "graal-sdk", graalvmVersion)
    implementation("org.graalvm.truffle", "truffle-api", graalvmVersion)
    implementation("org.graalvm.truffle", "truffle-dsl-processor", graalvmVersion)

    antlr("org.antlr:antlr4:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter")
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
