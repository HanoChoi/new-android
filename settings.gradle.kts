pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "General3"
include(":app")
include(":features")
include(":features:splash")
include(":features:splash:splash-di")
include(":features:splash:splash-api")
include(":features:splash:splash-impl")
include(":data")
