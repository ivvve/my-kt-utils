plugins {
    id("maven-publish")
    kotlin("jvm") version "1.5.10"
    java
}

// JitPack occurs `ERROR: No build artifacts found` after building project.
// It can be solved by adding below.
// See https://stackoverflow.com/questions/62876093/building-an-android-library-in-jitpack-error-no-build-artifacts-found
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.tistory.devs0n"
            artifactId = "my-utils"
            version = "1.0.0"

            from(components["kotlin"])
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
