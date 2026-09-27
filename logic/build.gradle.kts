plugins {
    id("hu.bme.mit.ase.shingler.gradle.java")
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
    api(project(":lib"))
    api(libs.slf4j.api)

    testRuntimeOnly(libs.slf4j.log4j.impl)
}

tasks.test {
    useJUnitPlatform()
    testLogging.showStandardStreams = true
}