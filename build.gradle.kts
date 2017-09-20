allprojects {

    group = "test.gradle.kotlin.dsl"

    version = "0.0.1-SNAPSHOT"

    repositories {
        jcenter()
    }

    repositories {
        mavenCentral()
        maven { setUrl("https://repo.spring.io/snapshot") }
        maven { setUrl("https://repo.spring.io/milestone") }
    }
}