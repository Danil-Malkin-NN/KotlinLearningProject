plugins {
	kotlin("jvm") apply false
	kotlin("multiplatform") apply false
	kotlin("js") apply false
}


group = "ru.danilMalkin.kotlin"
version = "0.0.1"

subprojects {
	group = rootProject.group
	version = rootProject.version
	repositories {
		mavenCentral()
	}
}