
val ktorVersion: String by project
val kotlinVersion: String by project
val logbackVersion: String by project
val testcontainersVersion: String by project
val fmodelVersion: String by project

plugins {
    kotlin("jvm") version "1.9.23"
    id("io.ktor.plugin") version "3.0.0-beta-1"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.23"
}

group = "com.elevaktor"
version = "0.0.1"

application {
    mainClass.set("com.elevaktor.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testcontainers:testcontainers:$testcontainersVersion")
    testImplementation("org.testcontainers:gcloud:$testcontainersVersion")

    implementation("com.fraktalio.fmodel:domain:$fmodelVersion")
    implementation("com.fraktalio.fmodel:application-arrow:$fmodelVersion")

    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-websockets-jvm")
    implementation("io.ktor:ktor-server-content-negotiation-jvm")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm")
    implementation("io.ktor:ktor-server-call-logging-jvm")
    implementation("io.ktor:ktor-server-call-id-jvm")
    implementation("io.ktor:ktor-server-metrics-jvm")
    implementation("io.ktor:ktor-server-metrics-micrometer-jvm")
    implementation("io.micrometer:micrometer-registry-prometheus:1.6.3")
    implementation("io.ktor:ktor-server-compression-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    testImplementation("io.ktor:ktor-server-tests-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
}
