import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.20"
}

group = "mes.inc.code.byte"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("test"))
    testImplementation(kotlin("test"))

//    val kotest = "5.5.5"
//    testImplementation ("io.kotest:kotest-runner-junit5:$kotest")
//    testImplementation ("io.kotest:kotest-assertions-core:$kotest")
//    testImplementation("io.kotest:kotest-runner-junit5-jvm:$kotest")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.5.5")
//    testImplementation("io.kotest:kotest-assertions-core-jvm:5.5.5")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}