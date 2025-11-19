plugins {
    kotlin("jvm")
    id("java-library")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

kotlin {
    jvmToolchain(11)
}

dependencies {
    implementation(project(":domain"))
    implementation(kotlin("stdlib"))
}

// Data module for repositories, data sources, and models
// Add your data code in src/main/java or src/main/kotlin
