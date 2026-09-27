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

    runtimeOnly(libs.slf4j.log4j.impl)
}

application {
    mainClass = "hu.bme.mit.ase.shingler.diversity.DiversityApp"
}

tasks.test {
    useJUnitPlatform()
    testLogging.showStandardStreams = true
}