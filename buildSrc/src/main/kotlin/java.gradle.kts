// set the full name of the plugin to `hu.bme.mit.ase.shingler.gradle.java`
package hu.bme.mit.ase.shingler.gradle

import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    java
    jacoco
    `java-library`
}

java {
    toolchain {
        // Sets the used JDK version to 21
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

tasks {
    test {
        useJUnitPlatform()
        testLogging.showStandardStreams = true
        finalizedBy(jacocoTestReport)
    }
    jacocoTestReport {
        inputs.files(test.get().outputs)
    }
}

val libs = the<LibrariesForLibs>()

dependencies {
    testImplementation(libs.junit.jupiter.core)

    testRuntimeOnly(libs.junit.jupiter.engine)
    testRuntimeOnly(libs.junit.platform.launcher)
}