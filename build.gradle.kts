plugins {
    id("com.github.johnrengelman.shadow") version "7.1.2"
    java
    antlr
}

group = "com.soarex.truffle.lama"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    val graalvmVersion: String by project
    val antlrVersion: String by project

    annotationProcessor("org.graalvm.truffle", "truffle-dsl-processor", graalvmVersion)
    implementation("org.graalvm.truffle", "truffle-api", graalvmVersion)

    antlr("org.antlr", "antlr4", antlrVersion)

    testImplementation(platform("org.junit:junit-bom:5.9.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf("-no-listener", "-visitor", "-long-messages")
}

tasks.test {
    useJUnitPlatform()
    val patchArgs = listOf(
        "-ea",
        "--add-exports",
        "org.graalvm.truffle/com.oracle.truffle.api=ALL-UNNAMED",
        "--add-exports",
        "org.graalvm.truffle/com.oracle.truffle.api.nodes=ALL-UNNAMED",
        "--add-exports",
        "org.graalvm.truffle/com.oracle.truffle.api.staticobject=ALL-UNNAMED",
        "-Dgraalvm.locatorDisabled=true",
    )
    jvmArgs(patchArgs)
}