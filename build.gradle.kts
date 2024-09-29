plugins {
    id("java")
    id("io.freefair.lombok") version "8.4"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.apache.commons:commons-lang3:3.14.0")
    implementation("org.apache.commons:commons-collections4:4.0")
    testImplementation("org.assertj:assertj-core:3.25.3")
    implementation("com.h2database:h2:2.2.220")
// https://mvnrepository.com/artifact/org.junit.platform/junit-platform-launcher
    testImplementation("org.junit.platform:junit-platform-launcher:1.10.2")

    compileOnly ("org.projectlombok:lombok:1.18.32")
    annotationProcessor ("org.projectlombok:lombok:1.18.32")

    testCompileOnly ("org.projectlombok:lombok:1.18.32")
    testAnnotationProcessor ("org.projectlombok:lombok:1.18.32")
}

tasks.test {
    useJUnitPlatform()
}