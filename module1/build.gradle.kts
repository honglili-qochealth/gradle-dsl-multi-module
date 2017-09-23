import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    val kotlinVersion = "1.1.4-3"
    val springBootVersion = "2.0.0.M3"

    repositories {
        mavenCentral()
        maven { setUrl("https://repo.spring.io/snapshot") }
        maven { setUrl("https://repo.spring.io/milestone") }
        jcenter()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
    }
}

apply {
    plugin("base")
    plugin("kotlin")
    plugin("kotlin-spring")
    plugin("org.springframework.boot")
    plugin("io.spring.dependency-management")
    plugin("org.jetbrains.kotlin.plugin.allopen")
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
        "compile"("org.springframework.boot:spring-boot-starter")
        "compile"("commons-io:commons-io:2.5")
        "compile"("org.jetbrains.kotlin:kotlin-stdlib-jre8:$kotlinVersion")
        "compile"("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
        "testCompile"("org.springframework.boot:spring-boot-starter-test")
    }
}
