dependencyResolutionManagement {
    versionCatalogs {
        create("libs") { // use the same version catalog as the other subprojects
            from(files("../gradle/libs.versions.toml"))
        }
    }
}