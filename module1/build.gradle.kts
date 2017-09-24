import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    val kotlinVersion = "1.1.4-3"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
    kotlin("plugin.allopen") version kotlinVersion
}

buildscript {
    val springBootVersion = "2.0.0.M3"

    repositories {
        mavenCentral()
        maven { setUrl("https://repo.spring.io/snapshot") }
        maven { setUrl("https://repo.spring.io/milestone") }
        jcenter()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
    }
}

apply {
    plugin("org.springframework.boot")
    plugin("io.spring.dependency-management")
}

tasks {


    "clean" {
        doFirst {
            println("Running task clean")
        }
    }

    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            freeCompilerArgs = listOf("-Xjsr305-annotations=enable")
        }
    }

    val kotlinVersion = "1.1.4-3"

    dependencies {
        compile("org.springframework.boot:spring-boot-starter")
        compile("commons-io:commons-io:2.5")
        compile(kotlin("stdlib-jre8", kotlinVersion))
        compile(kotlin("reflect", kotlinVersion))
        testCompile("org.springframework.boot:spring-boot-starter-test")
    }
}
