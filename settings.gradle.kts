rootProject.name = "ZooPark"

pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
        kotlin("js") version "1.5.20"
    }
}
include("KtorFullStack")
include("KotlinReactJs")
