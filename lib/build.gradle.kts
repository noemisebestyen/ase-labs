plugins {
    id("hu.bme.mit.ase.shingler.gradle.java")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}