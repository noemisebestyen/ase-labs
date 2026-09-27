plugins {
    `kotlin-dsl` // enables Kotlin-DSL scripts
}

repositories {
    mavenCentral()
}

dependencies {
    // needed to access the version catalog
    // https://github.com/gradle/gradle/issues/15383
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}