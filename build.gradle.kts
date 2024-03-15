object Versions {
    const val squareupApi = "23.1.0.20220823"
    const val okhttp = "4.11.0"
    const val squareupOkio = "3.4.0"
    const val swaggerAnnotations = "1.5.8"
    const val commonsCollectionsV3 = "3.2.2"
    const val jackson = "2.15.2"
}

plugins {
    kotlin("jvm") version "1.9.22"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("com.squareup:square:${Versions.squareupApi}")
    implementation("com.squareup.okhttp3:okhttp:${Versions.okhttp}")
    api("com.squareup.okio:okio:${Versions.squareupOkio}")
    implementation("io.swagger:swagger-annotations:${Versions.swaggerAnnotations}")
    implementation("commons-collections:commons-collections:${Versions.commonsCollectionsV3}")
    implementation("com.fasterxml.jackson.core:jackson-annotations:${Versions.jackson}")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
