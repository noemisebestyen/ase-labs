plugins {
    id("hu.bme.mit.ase.shingler.gradle.java")
    application
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":logic"))

    implementation(libs.picocli)

    runtimeOnly(libs.slf4j.logback.impl)
}

application {
    mainClass = "hu.bme.mit.ase.shingler.similarity.SimilarityApp"
}

tasks.test {
    useJUnitPlatform()
    testLogging.showStandardStreams = true
}